package com.crisav2.mobiletest3.repository.database

import android.content.Context
import com.crisav2.core.data.Post
import com.crisav2.core.repository.savingPosts.PostDataSource
import com.crisav2.mobiletest3.repository.database.db.PostDatabase
import com.crisav2.mobiletest3.repository.model.PostTable
import com.crisav2.mobiletest3.repository.model.asCoreModel
import com.crisav2.mobiletest3.repository.model.createBasedOnModel

class RoomPostDataSource(context: Context): PostDataSource {

    private val postDAO = PostDatabase.getInstance(context).postDao

    override suspend fun savePosts(posts: List<Post>) {
        val postsTableList = castPostsToTable(posts)
        postDAO.insertAll(postsTableList)
    }

    private fun castPostsToTable(posts: List<Post>): List<PostTable> {
        val postsTableResult = mutableListOf<PostTable>()
        posts.forEach {
            val postTable = PostTable()
            postsTableResult.add(postTable.createBasedOnModel(it))
        }
        return postsTableResult
    }

    override suspend fun getPosts(): List<Post> {
        val postTableList = postDAO.getPosts()
        return castPostsToCoreModel(postTableList)
    }

    private fun castPostsToCoreModel(postTableList: List<PostTable>): List<Post> {
        val postsResult = mutableListOf<Post>()
        postTableList.forEach {
            postsResult.add(it.asCoreModel())
        }
        return postsResult
    }

    override suspend fun getPost(id: Int): Post {
        return postDAO.getPost(id).asCoreModel()
    }

    override suspend fun removePosts() {
        postDAO.clearPosts()
    }

    override suspend fun removePost(id: Int) {
        postDAO.clearPost(id)
    }

    override suspend fun setFavoritePost(id: Int, favorite: Boolean) {
        postDAO.updateIsFavorite(favorite, id)
    }

    override suspend fun setOpenPost(id: Int, hasBeenOpened: Boolean) {
        postDAO.updateHasBeenOpened(hasBeenOpened, id)
    }
}
package com.crisav2.core.repository.savingPosts

import com.crisav2.core.data.Post

class PostDataRepository(private val dataSource: PostDataSource) {
    suspend fun savePosts(posts: List<Post>){
        dataSource.savePosts(posts)
    }
    suspend fun getPosts() = dataSource.getPosts()
    suspend fun getPost(id: Int) = dataSource.getPost(id)
    suspend fun removeAllPosts() = dataSource.removePosts()
    suspend fun removePost(id: Int) = dataSource.removePost(id)
    suspend fun setFavoritePost(id: Int, isFavorite: Boolean) = dataSource.setFavoritePost(id, isFavorite)
    suspend fun setOpenPost(id: Int, hasBeenOpened: Boolean) = dataSource.setOpenPost(id, hasBeenOpened)
}
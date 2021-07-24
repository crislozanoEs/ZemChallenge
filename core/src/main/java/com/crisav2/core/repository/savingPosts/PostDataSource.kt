package com.crisav2.core.repository.savingPosts

import com.crisav2.core.data.Post

interface PostDataSource {
    suspend fun savePosts(posts: List<Post>)
    suspend fun getPosts(): List<Post>
    suspend fun getPost(id: Int): Post
    suspend fun removePosts()
    suspend fun removePost(id: Int)
    suspend fun setFavoritePost(id: Int, favorite: Boolean)
    suspend fun setOpenPost(id: Int, hasBeenOpened: Boolean)

}
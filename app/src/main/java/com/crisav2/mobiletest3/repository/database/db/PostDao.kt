package com.crisav2.mobiletest3.repository.database.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.crisav2.mobiletest3.repository.model.PostTable

@Dao
interface PostDao {
    @Insert
    fun insertAll(posts: List<PostTable>)

    @Query("SELECT * FROM posts_table WHERE id = :postId")
    fun getPost(postId: Int): PostTable

    @Query("SELECT * FROM posts_table")
    fun getPosts(): List<PostTable>

    @Query("DELETE FROM posts_table")
    fun clearPosts()

    @Query("DELETE FROM posts_table WHERE id = :postId")
    fun clearPost(postId: Int)

    @Query("UPDATE posts_table SET has_been_opened = :hasBeenOpen WHERE id = :postId")
    fun updateHasBeenOpened(hasBeenOpen: Boolean, postId: Int)

    @Query("UPDATE posts_table SET is_favorite = :isFavorite WHERE id = :postId")
    fun updateIsFavorite(isFavorite: Boolean, postId: Int)


}
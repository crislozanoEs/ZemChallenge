package com.crisav2.mobiletest3.repository.database.db;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\b\u0010\u0006\u001a\u00020\u0003H\'J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\nH\'J\u0016\u0010\u000b\u001a\u00020\u00032\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\nH\'J\u0018\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0018\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\u0012"}, d2 = {"Lcom/crisav2/mobiletest3/repository/database/db/PostDao;", "", "clearPost", "", "postId", "", "clearPosts", "getPost", "Lcom/crisav2/mobiletest3/repository/model/PostTable;", "getPosts", "", "insertAll", "posts", "updateHasBeenOpened", "hasBeenOpen", "", "updateIsFavorite", "isFavorite", "app_debug"})
public abstract interface PostDao {
    
    @androidx.room.Insert()
    public abstract void insertAll(@org.jetbrains.annotations.NotNull()
    java.util.List<com.crisav2.mobiletest3.repository.model.PostTable> posts);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM posts_table WHERE id = :postId")
    public abstract com.crisav2.mobiletest3.repository.model.PostTable getPost(int postId);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM posts_table")
    public abstract java.util.List<com.crisav2.mobiletest3.repository.model.PostTable> getPosts();
    
    @androidx.room.Query(value = "DELETE FROM posts_table")
    public abstract void clearPosts();
    
    @androidx.room.Query(value = "DELETE FROM posts_table WHERE id = :postId")
    public abstract void clearPost(int postId);
    
    @androidx.room.Query(value = "UPDATE posts_table SET has_been_opened = :hasBeenOpen WHERE id = :postId")
    public abstract void updateHasBeenOpened(boolean hasBeenOpen, int postId);
    
    @androidx.room.Query(value = "UPDATE posts_table SET is_favorite = :isFavorite WHERE id = :postId")
    public abstract void updateIsFavorite(boolean isFavorite, int postId);
}
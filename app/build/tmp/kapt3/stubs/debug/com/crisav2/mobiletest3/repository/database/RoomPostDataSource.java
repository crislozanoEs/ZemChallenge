package com.crisav2.mobiletest3.repository.database;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\bH\u0002J\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002J\u0019\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0010H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J\u0019\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u0010H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u0011\u0010\u0016\u001a\u00020\u0015H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J\u001f\u0010\u0017\u001a\u00020\u00152\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0018J!\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u001bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001cJ!\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u001bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001cR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001f"}, d2 = {"Lcom/crisav2/mobiletest3/repository/database/RoomPostDataSource;", "Lcom/crisav2/core/repository/savingPosts/PostDataSource;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "postDAO", "Lcom/crisav2/mobiletest3/repository/database/db/PostDao;", "castPostsToCoreModel", "", "Lcom/crisav2/core/data/Post;", "postTableList", "Lcom/crisav2/mobiletest3/repository/model/PostTable;", "castPostsToTable", "posts", "getPost", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPosts", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "removePost", "", "removePosts", "savePosts", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setFavoritePost", "favorite", "", "(IZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setOpenPost", "hasBeenOpened", "app_debug"})
public final class RoomPostDataSource implements com.crisav2.core.repository.savingPosts.PostDataSource {
    private final com.crisav2.mobiletest3.repository.database.db.PostDao postDAO = null;
    
    public RoomPostDataSource(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object savePosts(@org.jetbrains.annotations.NotNull()
    java.util.List<com.crisav2.core.data.Post> posts, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final java.util.List<com.crisav2.mobiletest3.repository.model.PostTable> castPostsToTable(java.util.List<com.crisav2.core.data.Post> posts) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getPosts(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.crisav2.core.data.Post>> continuation) {
        return null;
    }
    
    private final java.util.List<com.crisav2.core.data.Post> castPostsToCoreModel(java.util.List<com.crisav2.mobiletest3.repository.model.PostTable> postTableList) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getPost(int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.crisav2.core.data.Post> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object removePosts(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object removePost(int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object setFavoritePost(int id, boolean favorite, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object setOpenPost(int id, boolean hasBeenOpened, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}
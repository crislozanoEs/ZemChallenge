package com.crisav2.mobiletest3.repository.database.db;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\u0002\u0010\u0010J\t\u0010\u001f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010 \u001a\u00020\u0005H\u00c6\u0003J\t\u0010!\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\"\u001a\u00020\tH\u00c6\u0003J\t\u0010#\u001a\u00020\u000bH\u00c6\u0003J\t\u0010$\u001a\u00020\rH\u00c6\u0003J\t\u0010%\u001a\u00020\u000fH\u00c6\u0003JO\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u00c6\u0001J\u0013\u0010\'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010*\u001a\u00020+H\u00d6\u0001J\t\u0010,\u001a\u00020-H\u00d6\u0001R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\f\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e\u00a8\u0006."}, d2 = {"Lcom/crisav2/mobiletest3/repository/database/db/Interactors;", "", "savePosts", "Lcom/crisav2/core/useCases/savePosts/SavePosts;", "getPost", "Lcom/crisav2/core/useCases/savePosts/GetPost;", "getPosts", "Lcom/crisav2/core/useCases/savePosts/GetPosts;", "favoritePost", "Lcom/crisav2/core/useCases/savePosts/FavoritePost;", "openPost", "Lcom/crisav2/core/useCases/savePosts/OpenPost;", "removePost", "Lcom/crisav2/core/useCases/savePosts/RemovePost;", "removePosts", "Lcom/crisav2/core/useCases/savePosts/RemovePosts;", "(Lcom/crisav2/core/useCases/savePosts/SavePosts;Lcom/crisav2/core/useCases/savePosts/GetPost;Lcom/crisav2/core/useCases/savePosts/GetPosts;Lcom/crisav2/core/useCases/savePosts/FavoritePost;Lcom/crisav2/core/useCases/savePosts/OpenPost;Lcom/crisav2/core/useCases/savePosts/RemovePost;Lcom/crisav2/core/useCases/savePosts/RemovePosts;)V", "getFavoritePost", "()Lcom/crisav2/core/useCases/savePosts/FavoritePost;", "getGetPost", "()Lcom/crisav2/core/useCases/savePosts/GetPost;", "getGetPosts", "()Lcom/crisav2/core/useCases/savePosts/GetPosts;", "getOpenPost", "()Lcom/crisav2/core/useCases/savePosts/OpenPost;", "getRemovePost", "()Lcom/crisav2/core/useCases/savePosts/RemovePost;", "getRemovePosts", "()Lcom/crisav2/core/useCases/savePosts/RemovePosts;", "getSavePosts", "()Lcom/crisav2/core/useCases/savePosts/SavePosts;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_debug"})
public final class Interactors {
    @org.jetbrains.annotations.NotNull()
    private final com.crisav2.core.useCases.savePosts.SavePosts savePosts = null;
    @org.jetbrains.annotations.NotNull()
    private final com.crisav2.core.useCases.savePosts.GetPost getPost = null;
    @org.jetbrains.annotations.NotNull()
    private final com.crisav2.core.useCases.savePosts.GetPosts getPosts = null;
    @org.jetbrains.annotations.NotNull()
    private final com.crisav2.core.useCases.savePosts.FavoritePost favoritePost = null;
    @org.jetbrains.annotations.NotNull()
    private final com.crisav2.core.useCases.savePosts.OpenPost openPost = null;
    @org.jetbrains.annotations.NotNull()
    private final com.crisav2.core.useCases.savePosts.RemovePost removePost = null;
    @org.jetbrains.annotations.NotNull()
    private final com.crisav2.core.useCases.savePosts.RemovePosts removePosts = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.crisav2.mobiletest3.repository.database.db.Interactors copy(@org.jetbrains.annotations.NotNull()
    com.crisav2.core.useCases.savePosts.SavePosts savePosts, @org.jetbrains.annotations.NotNull()
    com.crisav2.core.useCases.savePosts.GetPost getPost, @org.jetbrains.annotations.NotNull()
    com.crisav2.core.useCases.savePosts.GetPosts getPosts, @org.jetbrains.annotations.NotNull()
    com.crisav2.core.useCases.savePosts.FavoritePost favoritePost, @org.jetbrains.annotations.NotNull()
    com.crisav2.core.useCases.savePosts.OpenPost openPost, @org.jetbrains.annotations.NotNull()
    com.crisav2.core.useCases.savePosts.RemovePost removePost, @org.jetbrains.annotations.NotNull()
    com.crisav2.core.useCases.savePosts.RemovePosts removePosts) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public Interactors(@org.jetbrains.annotations.NotNull()
    com.crisav2.core.useCases.savePosts.SavePosts savePosts, @org.jetbrains.annotations.NotNull()
    com.crisav2.core.useCases.savePosts.GetPost getPost, @org.jetbrains.annotations.NotNull()
    com.crisav2.core.useCases.savePosts.GetPosts getPosts, @org.jetbrains.annotations.NotNull()
    com.crisav2.core.useCases.savePosts.FavoritePost favoritePost, @org.jetbrains.annotations.NotNull()
    com.crisav2.core.useCases.savePosts.OpenPost openPost, @org.jetbrains.annotations.NotNull()
    com.crisav2.core.useCases.savePosts.RemovePost removePost, @org.jetbrains.annotations.NotNull()
    com.crisav2.core.useCases.savePosts.RemovePosts removePosts) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.crisav2.core.useCases.savePosts.SavePosts component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.crisav2.core.useCases.savePosts.SavePosts getSavePosts() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.crisav2.core.useCases.savePosts.GetPost component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.crisav2.core.useCases.savePosts.GetPost getGetPost() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.crisav2.core.useCases.savePosts.GetPosts component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.crisav2.core.useCases.savePosts.GetPosts getGetPosts() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.crisav2.core.useCases.savePosts.FavoritePost component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.crisav2.core.useCases.savePosts.FavoritePost getFavoritePost() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.crisav2.core.useCases.savePosts.OpenPost component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.crisav2.core.useCases.savePosts.OpenPost getOpenPost() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.crisav2.core.useCases.savePosts.RemovePost component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.crisav2.core.useCases.savePosts.RemovePost getRemovePost() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.crisav2.core.useCases.savePosts.RemovePosts component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.crisav2.core.useCases.savePosts.RemovePosts getRemovePosts() {
        return null;
    }
}
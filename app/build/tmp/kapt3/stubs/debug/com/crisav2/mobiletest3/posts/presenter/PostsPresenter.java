package com.crisav2.mobiletest3.posts.presenter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\rJ\u0016\u0010\u0017\u001a\u00020\u00182\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0002J\u0010\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0010\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u0014H\u0016J\b\u0010\u001f\u001a\u00020\u0018H\u0016J\b\u0010 \u001a\u00020\u0018H\u0002J\b\u0010!\u001a\u00020\u0018H\u0016J\b\u0010\"\u001a\u00020\u0018H\u0016J\b\u0010#\u001a\u00020\u0018H\u0016J\b\u0010$\u001a\u00020\u0018H\u0002J\u001c\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\'0\u0013H\u0002J\b\u0010(\u001a\u00020\u0018H\u0016J\b\u0010)\u001a\u00020\u0018H\u0016J\u0010\u0010*\u001a\u00020\u00182\u0006\u0010+\u001a\u00020,H\u0016R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006-"}, d2 = {"Lcom/crisav2/mobiletest3/posts/presenter/PostsPresenter;", "Lcom/crisav2/mobiletest3/posts/Posts$Presenter;", "view", "Lcom/crisav2/mobiletest3/posts/Posts$View;", "postsAPI", "Lcom/crisav2/mobiletest3/repository/PostsAPI;", "listPostsUseCase", "Lcom/crisav2/core/useCases/ListPostsUseCase;", "interactors", "Lcom/crisav2/mobiletest3/repository/database/db/Interactors;", "subscribeOn", "Lio/reactivex/Scheduler;", "observeOn", "(Lcom/crisav2/mobiletest3/posts/Posts$View;Lcom/crisav2/mobiletest3/repository/PostsAPI;Lcom/crisav2/core/useCases/ListPostsUseCase;Lcom/crisav2/mobiletest3/repository/database/db/Interactors;Lio/reactivex/Scheduler;Lio/reactivex/Scheduler;)V", "disposables", "Lio/reactivex/disposables/CompositeDisposable;", "job", "Lkotlinx/coroutines/CompletableJob;", "posts", "", "Lcom/crisav2/core/data/Post;", "uiScope", "Lkotlinx/coroutines/CoroutineScope;", "cachePost", "", "postsResult", "deleteCachedPost", "reload", "", "deletePost", "item", "destroy", "getPostsDB", "init", "reloadPost", "requestPosts", "requestPostsNetwork", "retrievePosts", "postsNetwork", "Lcom/crisav2/mobiletest3/repository/model/PostNetwork;", "showAllPost", "showFavoritePost", "validateIdAndNavigate", "id", "", "app_debug"})
public final class PostsPresenter implements com.crisav2.mobiletest3.posts.Posts.Presenter {
    private final com.crisav2.mobiletest3.posts.Posts.View view = null;
    private final com.crisav2.mobiletest3.repository.PostsAPI postsAPI = null;
    private final com.crisav2.core.useCases.ListPostsUseCase listPostsUseCase = null;
    private final com.crisav2.mobiletest3.repository.database.db.Interactors interactors = null;
    private final io.reactivex.Scheduler subscribeOn = null;
    private final io.reactivex.Scheduler observeOn = null;
    private kotlinx.coroutines.CompletableJob job;
    private final kotlinx.coroutines.CoroutineScope uiScope = null;
    private java.util.List<com.crisav2.core.data.Post> posts;
    private final io.reactivex.disposables.CompositeDisposable disposables = null;
    
    public PostsPresenter(@org.jetbrains.annotations.NotNull()
    com.crisav2.mobiletest3.posts.Posts.View view, @org.jetbrains.annotations.NotNull()
    com.crisav2.mobiletest3.repository.PostsAPI postsAPI, @org.jetbrains.annotations.NotNull()
    com.crisav2.core.useCases.ListPostsUseCase listPostsUseCase, @org.jetbrains.annotations.NotNull()
    com.crisav2.mobiletest3.repository.database.db.Interactors interactors, @org.jetbrains.annotations.NotNull()
    io.reactivex.Scheduler subscribeOn, @org.jetbrains.annotations.NotNull()
    io.reactivex.Scheduler observeOn) {
        super();
    }
    
    @java.lang.Override()
    public void init() {
    }
    
    @java.lang.Override()
    public void requestPosts() {
    }
    
    @java.lang.Override()
    public void reloadPost() {
    }
    
    @java.lang.Override()
    public void deleteCachedPost(boolean reload) {
    }
    
    @java.lang.Override()
    public void showAllPost() {
    }
    
    @java.lang.Override()
    public void showFavoritePost() {
    }
    
    @java.lang.Override()
    public void deletePost(@org.jetbrains.annotations.NotNull()
    com.crisav2.core.data.Post item) {
    }
    
    private final void requestPostsNetwork() {
    }
    
    private final void getPostsDB() {
    }
    
    private final void cachePost(java.util.List<com.crisav2.core.data.Post> postsResult) {
    }
    
    @java.lang.Override()
    public void destroy() {
    }
    
    @java.lang.Override()
    public void validateIdAndNavigate(int id) {
    }
    
    private final java.util.List<com.crisav2.core.data.Post> retrievePosts(java.util.List<com.crisav2.mobiletest3.repository.model.PostNetwork> postsNetwork) {
        return null;
    }
}
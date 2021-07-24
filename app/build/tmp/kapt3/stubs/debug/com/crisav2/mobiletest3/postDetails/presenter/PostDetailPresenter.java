package com.crisav2.mobiletest3.postDetails.presenter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\r\u00a2\u0006\u0002\u0010\u000fJ\b\u0010\u001d\u001a\u00020\u001eH\u0016J\u0012\u0010\u001f\u001a\u00020\u001e2\b\u0010 \u001a\u0004\u0018\u00010\u0014H\u0016J\b\u0010!\u001a\u00020\u001eH\u0002J\b\u0010\"\u001a\u00020\u001eH\u0002J\b\u0010#\u001a\u00020\u001eH\u0002J\b\u0010$\u001a\u00020\u001eH\u0016J\b\u0010%\u001a\u00020\u001eH\u0002R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006&"}, d2 = {"Lcom/crisav2/mobiletest3/postDetails/presenter/PostDetailPresenter;", "Lcom/crisav2/mobiletest3/postDetails/PostDetail$Presenter;", "view", "Lcom/crisav2/mobiletest3/postDetails/PostDetail$View;", "interactors", "Lcom/crisav2/mobiletest3/repository/database/db/Interactors;", "userAPI", "Lcom/crisav2/mobiletest3/repository/UserAPI;", "commentsAPI", "Lcom/crisav2/mobiletest3/repository/CommentsAPI;", "detailPostUseCase", "Lcom/crisav2/core/useCases/DetailPostUseCase;", "subscribeOn", "Lio/reactivex/Scheduler;", "observeOn", "(Lcom/crisav2/mobiletest3/postDetails/PostDetail$View;Lcom/crisav2/mobiletest3/repository/database/db/Interactors;Lcom/crisav2/mobiletest3/repository/UserAPI;Lcom/crisav2/mobiletest3/repository/CommentsAPI;Lcom/crisav2/core/useCases/DetailPostUseCase;Lio/reactivex/Scheduler;Lio/reactivex/Scheduler;)V", "currentComments", "", "Lcom/crisav2/core/data/Comment;", "currentPost", "Lcom/crisav2/core/data/Post;", "disposables", "Lio/reactivex/disposables/CompositeDisposable;", "job", "Lkotlinx/coroutines/CompletableJob;", "uiScope", "Lkotlinx/coroutines/CoroutineScope;", "user", "Lcom/crisav2/core/data/User;", "destroy", "", "init", "postSelected", "requestAllCommentsForPost", "requestAllDataForPost", "requestUsers", "setAsFavorite", "setUpLoading", "app_debug"})
public final class PostDetailPresenter implements com.crisav2.mobiletest3.postDetails.PostDetail.Presenter {
    private final com.crisav2.mobiletest3.postDetails.PostDetail.View view = null;
    private final com.crisav2.mobiletest3.repository.database.db.Interactors interactors = null;
    private final com.crisav2.mobiletest3.repository.UserAPI userAPI = null;
    private final com.crisav2.mobiletest3.repository.CommentsAPI commentsAPI = null;
    private final com.crisav2.core.useCases.DetailPostUseCase detailPostUseCase = null;
    private final io.reactivex.Scheduler subscribeOn = null;
    private final io.reactivex.Scheduler observeOn = null;
    private kotlinx.coroutines.CompletableJob job;
    private final kotlinx.coroutines.CoroutineScope uiScope = null;
    private final io.reactivex.disposables.CompositeDisposable disposables = null;
    private com.crisav2.core.data.Post currentPost;
    private com.crisav2.core.data.User user;
    private java.util.List<com.crisav2.core.data.Comment> currentComments;
    
    public PostDetailPresenter(@org.jetbrains.annotations.NotNull()
    com.crisav2.mobiletest3.postDetails.PostDetail.View view, @org.jetbrains.annotations.NotNull()
    com.crisav2.mobiletest3.repository.database.db.Interactors interactors, @org.jetbrains.annotations.NotNull()
    com.crisav2.mobiletest3.repository.UserAPI userAPI, @org.jetbrains.annotations.NotNull()
    com.crisav2.mobiletest3.repository.CommentsAPI commentsAPI, @org.jetbrains.annotations.NotNull()
    com.crisav2.core.useCases.DetailPostUseCase detailPostUseCase, @org.jetbrains.annotations.NotNull()
    io.reactivex.Scheduler subscribeOn, @org.jetbrains.annotations.NotNull()
    io.reactivex.Scheduler observeOn) {
        super();
    }
    
    @java.lang.Override()
    public void init(@org.jetbrains.annotations.Nullable()
    com.crisav2.core.data.Post postSelected) {
    }
    
    private final void setUpLoading() {
    }
    
    private final void requestAllCommentsForPost() {
    }
    
    private final void requestAllDataForPost() {
    }
    
    private final void requestUsers() {
    }
    
    @java.lang.Override()
    public void destroy() {
    }
    
    @java.lang.Override()
    public void setAsFavorite() {
    }
}
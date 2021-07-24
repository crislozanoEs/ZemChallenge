package com.crisav2.mobiletest3.postDetails.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J(\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/crisav2/mobiletest3/postDetails/di/PostDetailModule;", "", "view", "Lcom/crisav2/mobiletest3/postDetails/PostDetail$View;", "(Lcom/crisav2/mobiletest3/postDetails/PostDetail$View;)V", "providePostDetailPresenter", "Lcom/crisav2/mobiletest3/postDetails/PostDetail$Presenter;", "interactors", "Lcom/crisav2/mobiletest3/repository/database/db/Interactors;", "userAPI", "Lcom/crisav2/mobiletest3/repository/UserAPI;", "commentsAPI", "Lcom/crisav2/mobiletest3/repository/CommentsAPI;", "detailPostUseCase", "Lcom/crisav2/core/useCases/DetailPostUseCase;", "app_debug"})
@dagger.Module()
public final class PostDetailModule {
    private final com.crisav2.mobiletest3.postDetails.PostDetail.View view = null;
    
    public PostDetailModule(@org.jetbrains.annotations.NotNull()
    com.crisav2.mobiletest3.postDetails.PostDetail.View view) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @com.crisav2.mobiletest3.di.FragmentScope()
    @dagger.Provides()
    public final com.crisav2.mobiletest3.postDetails.PostDetail.Presenter providePostDetailPresenter(@org.jetbrains.annotations.NotNull()
    com.crisav2.mobiletest3.repository.database.db.Interactors interactors, @org.jetbrains.annotations.NotNull()
    com.crisav2.mobiletest3.repository.UserAPI userAPI, @org.jetbrains.annotations.NotNull()
    com.crisav2.mobiletest3.repository.CommentsAPI commentsAPI, @org.jetbrains.annotations.NotNull()
    com.crisav2.core.useCases.DetailPostUseCase detailPostUseCase) {
        return null;
    }
}
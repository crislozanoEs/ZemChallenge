package com.crisav2.mobiletest3.posts.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J \u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/crisav2/mobiletest3/posts/di/PostsModule;", "", "view", "Lcom/crisav2/mobiletest3/posts/Posts$View;", "(Lcom/crisav2/mobiletest3/posts/Posts$View;)V", "providePostsPresenter", "Lcom/crisav2/mobiletest3/posts/Posts$Presenter;", "postsAPI", "Lcom/crisav2/mobiletest3/repository/PostsAPI;", "listPostsUseCase", "Lcom/crisav2/core/useCases/ListPostsUseCase;", "interactors", "Lcom/crisav2/mobiletest3/repository/database/db/Interactors;", "app_debug"})
@dagger.Module()
public final class PostsModule {
    private final com.crisav2.mobiletest3.posts.Posts.View view = null;
    
    public PostsModule(@org.jetbrains.annotations.NotNull()
    com.crisav2.mobiletest3.posts.Posts.View view) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @com.crisav2.mobiletest3.di.FragmentScope()
    @dagger.Provides()
    public final com.crisav2.mobiletest3.posts.Posts.Presenter providePostsPresenter(@org.jetbrains.annotations.NotNull()
    com.crisav2.mobiletest3.repository.PostsAPI postsAPI, @org.jetbrains.annotations.NotNull()
    com.crisav2.core.useCases.ListPostsUseCase listPostsUseCase, @org.jetbrains.annotations.NotNull()
    com.crisav2.mobiletest3.repository.database.db.Interactors interactors) {
        return null;
    }
}
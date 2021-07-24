package com.crisav2.mobiletest3.di.module;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\n\u001a\u00020\u000bH\u0007J\u0010\u0010\f\u001a\n \u0007*\u0004\u0018\u00010\r0\rH\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0007J\b\u0010\u0010\u001a\u00020\u0011H\u0007J\b\u0010\u0012\u001a\u00020\u0013H\u0007J\b\u0010\u0014\u001a\u00020\u0015H\u0007J\b\u0010\u0016\u001a\u00020\u0017H\u0007J\b\u0010\u0018\u001a\u00020\u0019H\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/crisav2/mobiletest3/di/module/ApplicationModule;", "", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "moshi", "Lcom/squareup/moshi/Moshi;", "kotlin.jvm.PlatformType", "postRepository", "Lcom/crisav2/core/repository/savingPosts/PostDataRepository;", "context", "Landroid/content/Context;", "createRetrofit", "Lretrofit2/Retrofit;", "providesCommentsAPI", "Lcom/crisav2/mobiletest3/repository/CommentsAPI;", "providesInteractors", "Lcom/crisav2/mobiletest3/repository/database/db/Interactors;", "providesListPostsUseCase", "Lcom/crisav2/core/useCases/ListPostsUseCase;", "providesPostDetailUseCase", "Lcom/crisav2/core/useCases/DetailPostUseCase;", "providesPostsAPI", "Lcom/crisav2/mobiletest3/repository/PostsAPI;", "providesUsersAPI", "Lcom/crisav2/mobiletest3/repository/UserAPI;", "app_debug"})
@dagger.Module()
public final class ApplicationModule {
    private final android.app.Application application = null;
    private final com.squareup.moshi.Moshi moshi = null;
    private final com.crisav2.core.repository.savingPosts.PostDataRepository postRepository = null;
    
    public ApplicationModule(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final android.content.Context context() {
        return null;
    }
    
    private final retrofit2.Retrofit createRetrofit() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.crisav2.mobiletest3.repository.PostsAPI providesPostsAPI() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.crisav2.mobiletest3.repository.UserAPI providesUsersAPI() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.crisav2.mobiletest3.repository.CommentsAPI providesCommentsAPI() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.crisav2.core.useCases.ListPostsUseCase providesListPostsUseCase() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.crisav2.core.useCases.DetailPostUseCase providesPostDetailUseCase() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.crisav2.mobiletest3.repository.database.db.Interactors providesInteractors() {
        return null;
    }
}
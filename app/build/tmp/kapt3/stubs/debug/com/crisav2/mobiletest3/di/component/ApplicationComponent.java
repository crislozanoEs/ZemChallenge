package com.crisav2.mobiletest3.di.component;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0002\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\t"}, d2 = {"Lcom/crisav2/mobiletest3/di/component/ApplicationComponent;", "", "plus", "Lcom/crisav2/mobiletest3/postDetails/di/PostDetailComponent;", "postDetailModule", "Lcom/crisav2/mobiletest3/postDetails/di/PostDetailModule;", "Lcom/crisav2/mobiletest3/posts/di/PostsComponent;", "postsModule", "Lcom/crisav2/mobiletest3/posts/di/PostsModule;", "app_debug"})
@dagger.Component(modules = {com.crisav2.mobiletest3.di.module.ApplicationModule.class})
@javax.inject.Singleton()
public abstract interface ApplicationComponent {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.crisav2.mobiletest3.posts.di.PostsComponent plus(@org.jetbrains.annotations.NotNull()
    com.crisav2.mobiletest3.posts.di.PostsModule postsModule);
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.crisav2.mobiletest3.postDetails.di.PostDetailComponent plus(@org.jetbrains.annotations.NotNull()
    com.crisav2.mobiletest3.postDetails.di.PostDetailModule postDetailModule);
}
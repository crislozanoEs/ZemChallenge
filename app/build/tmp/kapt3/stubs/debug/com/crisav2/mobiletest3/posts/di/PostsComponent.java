package com.crisav2.mobiletest3.posts.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/crisav2/mobiletest3/posts/di/PostsComponent;", "", "inject", "", "fragment", "Lcom/crisav2/mobiletest3/posts/view/PostsFragment;", "app_debug"})
@dagger.Subcomponent(modules = {com.crisav2.mobiletest3.posts.di.PostsModule.class})
@com.crisav2.mobiletest3.di.FragmentScope()
public abstract interface PostsComponent {
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.crisav2.mobiletest3.posts.view.PostsFragment fragment);
}
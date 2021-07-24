package com.crisav2.mobiletest3.di.component

import com.crisav2.mobiletest3.di.module.ApplicationModule
import com.crisav2.mobiletest3.postDetails.di.PostDetailComponent
import com.crisav2.mobiletest3.postDetails.di.PostDetailModule
import com.crisav2.mobiletest3.posts.di.PostsComponent
import com.crisav2.mobiletest3.posts.di.PostsModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        ApplicationModule::class
    ]
)
interface ApplicationComponent {
    fun plus(postsModule: PostsModule): PostsComponent
    fun plus(postDetailModule: PostDetailModule): PostDetailComponent
}
package com.crisav2.mobiletest3.posts.di

import com.crisav2.core.useCases.ListPostsUseCase
import com.crisav2.mobiletest3.di.FragmentScope
import com.crisav2.mobiletest3.posts.Posts
import com.crisav2.mobiletest3.posts.presenter.PostsPresenter
import com.crisav2.mobiletest3.posts.view.PostsFragment
import com.crisav2.mobiletest3.repository.PostsAPI
import com.crisav2.mobiletest3.repository.database.db.Interactors
import dagger.Module
import dagger.Provides
import dagger.Subcomponent
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers


@Module
class PostsModule(private val view: Posts.View){
    @Provides
    @FragmentScope
    fun providePostsPresenter(
        postsAPI: PostsAPI,
        listPostsUseCase: ListPostsUseCase,
        interactors: Interactors
    ): Posts.Presenter = PostsPresenter(view,
        postsAPI,
        listPostsUseCase,
        interactors,
        Schedulers.io(),
        AndroidSchedulers.mainThread())
}

@FragmentScope
@Subcomponent(modules = [PostsModule::class])
interface PostsComponent{
    fun inject(fragment: PostsFragment)
}
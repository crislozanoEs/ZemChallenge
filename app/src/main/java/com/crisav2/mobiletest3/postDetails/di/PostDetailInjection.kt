package com.crisav2.mobiletest3.postDetails.di

import com.crisav2.core.useCases.DetailPostUseCase
import com.crisav2.mobiletest3.di.FragmentScope
import com.crisav2.mobiletest3.postDetails.PostDetail
import com.crisav2.mobiletest3.postDetails.presenter.PostDetailPresenter
import com.crisav2.mobiletest3.postDetails.view.PostDetailFragment
import com.crisav2.mobiletest3.repository.CommentsAPI
import com.crisav2.mobiletest3.repository.UserAPI
import com.crisav2.mobiletest3.repository.database.db.Interactors
import dagger.Module
import dagger.Provides
import dagger.Subcomponent
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

@Module
class PostDetailModule(private val view: PostDetail.View){
    @Provides
    @FragmentScope
    fun providePostDetailPresenter(
        interactors: Interactors,
        userAPI: UserAPI,
        commentsAPI: CommentsAPI,
        detailPostUseCase: DetailPostUseCase
    ): PostDetail.Presenter = PostDetailPresenter(view,
        interactors,
        userAPI,
        commentsAPI,
        detailPostUseCase,
        Schedulers.io(),
        AndroidSchedulers.mainThread())
}

@FragmentScope
@Subcomponent(modules = [PostDetailModule::class])
interface PostDetailComponent{
    fun inject(fragment: PostDetailFragment)
}
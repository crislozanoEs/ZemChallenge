package com.crisav2.mobiletest3.di.module

import android.app.Application
import android.content.Context
import com.crisav2.core.repository.savingPosts.PostDataRepository
import com.crisav2.core.useCases.DetailPostUseCase
import com.crisav2.core.useCases.ListPostsUseCase
import com.crisav2.core.useCases.savePosts.*
import com.crisav2.mobiletest3.commons.Constants
import com.crisav2.mobiletest3.repository.CommentsAPI
import com.crisav2.mobiletest3.repository.PostsAPI
import com.crisav2.mobiletest3.repository.UserAPI
import com.crisav2.mobiletest3.repository.database.RoomPostDataSource
import com.crisav2.mobiletest3.repository.database.db.Interactors
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.moshi.MoshiConverterFactory
import javax.inject.Singleton

@Module
class ApplicationModule(private val application: Application) {

    @Provides
    fun context(): Context = application

    private val moshi = Moshi.Builder()
        .add(KotlinJsonAdapterFactory())
        .build()

    private fun createRetrofit() = Retrofit.Builder()
        .baseUrl(Constants.baseURL)
        .addConverterFactory(MoshiConverterFactory.create(moshi))
        .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
        .build()

    private val postRepository = PostDataRepository(RoomPostDataSource(context()))


    @Provides
    @Singleton
    fun providesPostsAPI(): PostsAPI = createRetrofit().create(PostsAPI::class.java)

    @Provides
    @Singleton
    fun providesUsersAPI(): UserAPI = createRetrofit().create(UserAPI::class.java)

    @Provides
    @Singleton
    fun providesCommentsAPI(): CommentsAPI = createRetrofit().create(CommentsAPI::class.java)

    @Provides
    @Singleton
    fun providesListPostsUseCase(): ListPostsUseCase = ListPostsUseCase()

    @Provides
    @Singleton
    fun providesPostDetailUseCase(): DetailPostUseCase = DetailPostUseCase()

    @Provides
    fun providesInteractors(): Interactors = Interactors(
        SavePosts(postRepository),
        GetPost(postRepository),
        GetPosts(postRepository),
        FavoritePost(postRepository),
        OpenPost(postRepository),
        RemovePost(postRepository),
        RemovePosts(postRepository)
    )
}
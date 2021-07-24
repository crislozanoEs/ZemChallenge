package com.crisav2.mobiletest3.repository

import com.crisav2.mobiletest3.repository.model.PostNetwork
import io.reactivex.Single
import retrofit2.http.GET

interface PostsAPI {
    @GET("posts")
    fun getPosts(): Single<List<PostNetwork>>
}
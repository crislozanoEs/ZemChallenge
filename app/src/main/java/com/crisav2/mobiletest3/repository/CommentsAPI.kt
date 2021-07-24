package com.crisav2.mobiletest3.repository

import com.crisav2.mobiletest3.repository.model.CommentNetwork
import io.reactivex.Single
import retrofit2.http.GET

interface CommentsAPI {
    @GET("comments")
    fun getComments(): Single<List<CommentNetwork>>
}
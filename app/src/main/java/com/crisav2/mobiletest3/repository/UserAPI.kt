package com.crisav2.mobiletest3.repository

import com.crisav2.mobiletest3.repository.model.PostNetwork
import com.crisav2.mobiletest3.repository.model.UserNetwork
import io.reactivex.Single
import retrofit2.http.GET

interface UserAPI {
    @GET("users")
    fun getUsers(): Single<List<UserNetwork>>
}
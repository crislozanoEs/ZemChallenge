package com.crisav2.mobiletest3.repository.model

import com.crisav2.core.data.User
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class UserNetwork(
    @Json(name = "id")
    val userID: Int,
    @Json(name = "name")
    val userName: String,
    @Json(name = "email")
    val userEmail: String,
    @Json(name = "Phone")
    val userPhone: String,
    @Json(name = "website")
    val userWebsite: String
)

fun UserNetwork.asCoreModel(): User{
    return User(
        id = userID,
        name = userName,
        email = userEmail,
        phone = userPhone,
        website = userWebsite
    )
}
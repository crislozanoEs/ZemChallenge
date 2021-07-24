package com.crisav2.mobiletest3.repository.model

import com.crisav2.core.data.Post
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PostNetwork(
    @Json(name = "id")
    val id: Int,
    @Json(name = "description")
    val description: String,
    @Json(name = "user")
    val userID: Int
)

fun PostNetwork.asCoreModel(): Post{
    return Post(
        id = id,
        description = description,
        userID = userID,
        shortDescription = ""
    )
}

package com.crisav2.mobiletest3.repository.model

import com.crisav2.core.data.Comment
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CommentNetwork(
    @Json(name= "id")
    val id: Int,
    @Json(name = "body")
    val body: String,
    @Json(name = "postId")
    val postId: Int
)

fun CommentNetwork.asCoreModel(): Comment{
    return Comment(
        id = id,
        body = body,
        postId = postId
    )
}
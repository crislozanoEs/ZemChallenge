package com.crisav2.core.data

import java.io.Serializable

data class Post(
    val id: Int,
    val description: String,
    var shortDescription: String,
    val userID: Int,
    var hasBeenOpened: Boolean = true,
    var isFavorite: Boolean = false
): Serializable

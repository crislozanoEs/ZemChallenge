package com.crisav2.mobiletest3.repository.database.db

import com.crisav2.core.useCases.savePosts.*

data class Interactors(
    val savePosts: SavePosts,
    val getPost: GetPost,
    val getPosts: GetPosts,
    val favoritePost: FavoritePost,
    val openPost: OpenPost,
    val removePost: RemovePost,
    val removePosts: RemovePosts
)
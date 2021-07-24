package com.crisav2.core.useCases.savePosts

import com.crisav2.core.repository.savingPosts.PostDataRepository

class FavoritePost(private val postDataRepository: PostDataRepository) {
    suspend operator fun invoke(id: Int, isFavorite: Boolean) =  postDataRepository.setFavoritePost(id, isFavorite)
}
package com.crisav2.core.useCases.savePosts

import com.crisav2.core.repository.savingPosts.PostDataRepository

class OpenPost(private val postDataRepository: PostDataRepository) {
    suspend operator fun invoke(id: Int, isOpen: Boolean) = postDataRepository.setOpenPost(id, isOpen)
}
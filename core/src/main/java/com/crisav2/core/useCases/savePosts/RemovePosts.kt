package com.crisav2.core.useCases.savePosts

import com.crisav2.core.repository.savingPosts.PostDataRepository

class RemovePosts(private val postDataRepository: PostDataRepository) {
    suspend operator fun invoke() = postDataRepository.removeAllPosts()
}
package com.crisav2.core.useCases.savePosts

import com.crisav2.core.repository.savingPosts.PostDataRepository

class GetPost(private val postDataRepository: PostDataRepository) {
    suspend operator fun invoke(id: Int) = postDataRepository.getPost(id)
}
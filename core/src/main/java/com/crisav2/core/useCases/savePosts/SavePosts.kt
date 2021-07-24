package com.crisav2.core.useCases.savePosts

import com.crisav2.core.data.Post
import com.crisav2.core.repository.savingPosts.PostDataRepository

open class SavePosts(private val postDataRepository: PostDataRepository) {
    suspend operator fun invoke(posts: List<Post>) = postDataRepository.savePosts(posts)
}
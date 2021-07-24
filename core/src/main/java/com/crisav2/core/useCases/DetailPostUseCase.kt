package com.crisav2.core.useCases

import com.crisav2.core.data.Comment
import com.crisav2.core.data.Post
import com.crisav2.core.data.User

class DetailPostUseCase {

    fun getUserPost(post: Post, users: List<User>): User?{
        return users.firstOrNull { it.id == post.userID }
    }

    fun getCommentsForPost(comments: List<Comment>, postId: Int): List<Comment> {
        return comments.filter { it.postId == postId }
    }
    fun getPresentationUser(user: User): String{
         return "Name: ${user.name} \n " +
                "Email: ${user.email} \n" +
                "Phone: ${user.phone} \n" +
                "Websie: ${user.website}"
    }
}
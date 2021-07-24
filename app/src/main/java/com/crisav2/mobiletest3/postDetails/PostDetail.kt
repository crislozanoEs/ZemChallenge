package com.crisav2.mobiletest3.postDetails

import com.crisav2.core.data.Comment
import com.crisav2.core.data.Post

interface PostDetail {
    interface View{
        fun setUpPost(post: Post, user: String)
        fun showPostLoading(isShowing: Boolean)
        fun showCommentsLoading(isShowing: Boolean)
        fun setUpComments(currentComments: List<Comment>)
    }

    interface Presenter{
        fun init(postSelected: Post?)
        fun destroy()
        fun setAsFavorite()
    }
}
package com.crisav2.mobiletest3.posts

import com.crisav2.core.data.Post

interface Posts {
    interface View{
        fun showPosts(post: List<Post>)
        fun showLoading(isShowing: Boolean)
        fun showError(isShowing: Boolean, errorMessage: String? = null)
        fun goToDetails(selectedPost: Post)
        fun showNoPosts()
        fun deleteItem(adapterPosition: Int)
    }

    interface Presenter{
        fun init()
        fun destroy()
        fun validateIdAndNavigate(id: Int)
        fun requestPosts()
        fun reloadPost()
        fun deleteCachedPost(reload: Boolean)
        fun showAllPost()
        fun showFavoritePost()
        fun deletePost(item: Post)
    }
}
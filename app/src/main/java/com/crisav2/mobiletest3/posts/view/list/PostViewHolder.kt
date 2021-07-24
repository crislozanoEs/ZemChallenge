package com.crisav2.mobiletest3.posts.view.list

import android.util.Log
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.core.view.isVisible
import androidx.recyclerview.widget.RecyclerView
import com.crisav2.core.data.Post
import com.crisav2.mobiletest3.R
import com.crisav2.mobiletest3.commons.getVisibility
import com.crisav2.mobiletest3.posts.Posts
import org.w3c.dom.Text

class PostViewHolder(
    itemView: View
): RecyclerView.ViewHolder(itemView) {

    val completeLayout: LinearLayout = itemView.findViewById(R.id.post_item_complete)
    private val bodyTextView: TextView = itemView.findViewById(R.id.post_item_text_description)
    private val openedImageView: ImageView = itemView.findViewById(R.id.post_item_image_opened)
    private val favoriteImageView: ImageView = itemView.findViewById(R.id.post_item_image_favorite)

    fun setUpPost(post: Post) {
        bodyTextView.text = post.shortDescription
        openedImageView.isVisible = !post.hasBeenOpened
        favoriteImageView.isVisible = post.isFavorite
    }

}
package com.crisav2.mobiletest3.postDetails.view.list

import android.view.View
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.crisav2.core.data.Comment
import com.crisav2.mobiletest3.R

class CommentViewHolder(
    itemView: View
): RecyclerView.ViewHolder(itemView) {

    private val commentTextView: TextView = itemView.findViewById(R.id.comment_item_text_description)

    fun setUpComment(comment: Comment){
        commentTextView.text = comment.body
    }
}
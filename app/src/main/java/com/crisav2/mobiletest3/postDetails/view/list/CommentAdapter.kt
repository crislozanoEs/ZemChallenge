package com.crisav2.mobiletest3.postDetails.view.list

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.crisav2.core.data.Comment
import com.crisav2.mobiletest3.R

class CommentAdapter: RecyclerView.Adapter<CommentViewHolder>() {

    var commentList: List<Comment> = emptyList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CommentViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_comment, parent, false)
        return CommentViewHolder(view)
    }

    override fun onBindViewHolder(holder: CommentViewHolder, position: Int) {
        val comment = commentList[position]
        holder.setUpComment(comment)
    }

    override fun getItemCount(): Int = commentList.size
}
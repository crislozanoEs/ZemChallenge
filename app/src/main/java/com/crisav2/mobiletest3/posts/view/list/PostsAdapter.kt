package com.crisav2.mobiletest3.posts.view.list

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.crisav2.core.data.Post
import com.crisav2.mobiletest3.R

class PostsAdapter(
    private val onPostClicked: (id: Int) -> Unit
):RecyclerView.Adapter<PostViewHolder>() {

    var postsList: MutableList<Post> = mutableListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_post, parent, false)
        return PostViewHolder(view)
    }

    override fun onBindViewHolder(holder: PostViewHolder, position: Int) {
        holder.setUpPost(postsList[position])
        holder.completeLayout.setOnClickListener {
            onPostClicked(postsList[position].id)
        }
    }

    override fun getItemCount(): Int = postsList.size

    fun deleteItem(adapterPosition: Int) {
        postsList.removeAt(adapterPosition)
        notifyItemRemoved(adapterPosition)
    }

    fun getItem(adapterPosition: Int): Post{
        return postsList[adapterPosition]
    }

    fun deleteItems() {
        postsList.clear()
        notifyDataSetChanged()
    }

}
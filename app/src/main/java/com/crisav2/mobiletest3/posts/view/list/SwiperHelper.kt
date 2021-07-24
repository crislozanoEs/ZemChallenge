package com.crisav2.mobiletest3.posts.view.list


import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.RecyclerView
import com.crisav2.mobiletest3.posts.Posts

class SwiperHelper(private val view: Posts.View, private val adapter: PostsAdapter, dragDirs: Int, swipeDirs: Int): ItemTouchHelper.SimpleCallback(dragDirs, swipeDirs) {
    override fun onMove(
        recyclerView: RecyclerView,
        viewHolder: RecyclerView.ViewHolder,
        target: RecyclerView.ViewHolder
    ): Boolean {
        // No needed
        return true
    }


    override fun onSwiped(viewHolder: RecyclerView.ViewHolder, direction: Int) {
        view.deleteItem(viewHolder.adapterPosition)
        adapter.deleteItem(viewHolder.adapterPosition)
    }


}
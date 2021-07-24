package com.crisav2.mobiletest3.posts.view

import android.os.Bundle
import android.util.Log
import android.view.*
import androidx.fragment.app.Fragment
import android.widget.ProgressBar
import android.widget.RadioGroup
import android.widget.TextView
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.RecyclerView
import com.crisav2.core.data.Post
import com.crisav2.mobiletest3.MainActivity
import com.crisav2.mobiletest3.R
import com.crisav2.mobiletest3.commons.applicationComponent
import com.crisav2.mobiletest3.commons.getVisibility
import com.crisav2.mobiletest3.posts.Posts
import com.crisav2.mobiletest3.posts.di.PostsModule
import com.crisav2.mobiletest3.posts.view.list.PostsAdapter
import com.crisav2.mobiletest3.posts.view.list.SwiperHelper
import com.google.android.material.floatingactionbutton.FloatingActionButton
import javax.inject.Inject

class PostsFragment : Fragment(), Posts.View {

    @Inject
    lateinit var presenter: Posts.Presenter

    private lateinit var recyclerViewList: RecyclerView
    private lateinit var progressBarLoading: ProgressBar
    private lateinit var textViewError: TextView
    private lateinit var deleteButton: FloatingActionButton
    private lateinit var radioGroupNavigation: RadioGroup
    private lateinit var adapter: PostsAdapter

    private val onCheckedChangeListener = RadioGroup.OnCheckedChangeListener{ _, checkedId ->
        if(checkedId == R.id.radio_button_all){
            presenter.showAllPost()
        }else{
            presenter.showFavoritePost()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        inject()
        setHasOptionsMenu(true)
    }

    private fun inject() {
        applicationComponent
            .plus(PostsModule(this))
            .inject(this)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_posts, container, false)
        setupView(root)
        return root
    }

    private fun setupView(root: View) {
        recyclerViewList = root.findViewById(R.id.posts_recycler_view_posts)
        progressBarLoading = root.findViewById(R.id.posts_progress_bar_loading)
        textViewError = root.findViewById(R.id.posts_text_view_error)
        deleteButton = root.findViewById(R.id.posts_floating_delete)
        radioGroupNavigation = root.findViewById(R.id.radio_segmented_navigation)
        deleteButton.setOnClickListener {
            radioGroupNavigation.setOnCheckedChangeListener(null)
            radioGroupNavigation.check(R.id.radio_button_all)
            radioGroupNavigation.setOnCheckedChangeListener(onCheckedChangeListener)
            presenter.deleteCachedPost(false)
        }

        adapter = PostsAdapter { id -> presenter.validateIdAndNavigate(id) }
        recyclerViewList.adapter = adapter
        val swiperHelper = ItemTouchHelper(SwiperHelper(this, adapter, 0, ItemTouchHelper.RIGHT))
        swiperHelper.attachToRecyclerView(recyclerViewList)
        radioGroupNavigation.setOnCheckedChangeListener(onCheckedChangeListener)
        (activity as MainActivity).supportActionBar?.setDisplayHomeAsUpEnabled(false)
        (activity as MainActivity).supportActionBar?.setHomeButtonEnabled(false)
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.menu_list, menu)
    }

    override fun onResume() {
        super.onResume()
        radioGroupNavigation.check(R.id.radio_button_all)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId){
            R.id.action_reload -> {
                radioGroupNavigation.setOnCheckedChangeListener(null)
                radioGroupNavigation.check(R.id.radio_button_all)
                radioGroupNavigation.setOnCheckedChangeListener(onCheckedChangeListener)
                presenter.reloadPost()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }

    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        presenter.init()

    }

    override fun onDestroy() {
        super.onDestroy()
        presenter.destroy()
    }
    override fun showPosts(post: List<Post>) {
        showError(false)
        if(post.isNotEmpty()){
            recyclerViewList.visibility = true.getVisibility()
            adapter.postsList = post as MutableList<Post>
            adapter.notifyDataSetChanged()
        }
    }

    override fun showLoading(isShowing: Boolean) {
        showError(false)
        progressBarLoading.visibility = isShowing.getVisibility()
    }

    override fun showError(isShowing: Boolean, errorMessage: String?){
        if(isShowing){
            textViewError.visibility = View.VISIBLE
            textViewError.text = errorMessage
        }else{
            textViewError.visibility = View.GONE
        }
    }

    override fun goToDetails(selectedPost: Post) {
        (activity as MainActivity).goToDetail(selectedPost)
    }

    override fun showNoPosts() {
        (recyclerViewList.adapter as PostsAdapter).deleteItems()
    }

    override fun deleteItem(adapterPosition: Int) {
        presenter.deletePost((recyclerViewList.adapter as PostsAdapter).getItem(adapterPosition))
    }

    companion object{
        fun newInstance() = PostsFragment()
    }
}
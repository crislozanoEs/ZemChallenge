package com.crisav2.mobiletest3.postDetails.view

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import android.widget.ProgressBar
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.crisav2.core.data.Comment
import com.crisav2.core.data.Post
import com.crisav2.mobiletest3.MainActivity
import com.crisav2.mobiletest3.R
import com.crisav2.mobiletest3.commons.applicationComponent
import com.crisav2.mobiletest3.commons.getVisibility
import com.crisav2.mobiletest3.postDetails.PostDetail
import com.crisav2.mobiletest3.postDetails.di.PostDetailModule
import com.crisav2.mobiletest3.postDetails.view.list.CommentAdapter
import java.io.Serializable
import javax.inject.Inject

private const val ARG_PARAM_1_PRODUCT = "param1"

class PostDetailFragment : Fragment(), PostDetail.View {
    private var postSelected: Post? = null

    @Inject
    lateinit var presenter: PostDetail.Presenter

    private lateinit var contentPost: ConstraintLayout
    private lateinit var descriptionTextView: TextView
    private lateinit var userNameTextView: TextView
    private lateinit var postProgressBar: ProgressBar
    private lateinit var commentProgressBar: ProgressBar
    private lateinit var commentList: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            postSelected = it.getSerializable(ARG_PARAM_1_PRODUCT) as Post
        }
        inject()
        setHasOptionsMenu(true)
    }

    private fun inject() {
        applicationComponent
            .plus(PostDetailModule(this))
            .inject(this)
    }
    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.menu_list_2, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId){
            R.id.action_favorite -> {
                presenter.setAsFavorite()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }

    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val root = inflater.inflate(R.layout.fragment_post_detail, container, false)
        setupView(root)
        return root
    }

    private fun setupView(root: View) {
        contentPost = root.findViewById(R.id.post_detail_content_post)
        descriptionTextView = root.findViewById(R.id.post_detail_text_description)
        userNameTextView = root.findViewById(R.id.post_detail_text_user_name)
        postProgressBar = root.findViewById(R.id.post_detail_progress_post)
        commentProgressBar = root.findViewById(R.id.post_comments_progress_post)
        commentList = root.findViewById(R.id.post_comments_recycler_view)
        (activity as MainActivity).supportActionBar?.setDisplayHomeAsUpEnabled(true)
        (activity as MainActivity).supportActionBar?.setHomeButtonEnabled(true)
    }

    override fun showPostLoading(isShowing: Boolean){
        postProgressBar.visibility = isShowing.getVisibility()
    }

    override fun showCommentsLoading(isShowing: Boolean) {
        commentProgressBar.visibility = isShowing.getVisibility()
    }

    override fun setUpComments(currentComments: List<Comment>) {
        val adapter = CommentAdapter()
        adapter.commentList = currentComments
        commentList.adapter = adapter
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        presenter.init(postSelected)
    }

    companion object {
        @JvmStatic
        fun newInstance(currentPost: Post) =
            PostDetailFragment().apply {
                arguments = Bundle().apply {
                    putSerializable(ARG_PARAM_1_PRODUCT, currentPost as Serializable)
                }
            }
    }

    override fun setUpPost(post: Post, user: String) {
        contentPost.visibility = true.getVisibility()
        descriptionTextView.text = post.description
        userNameTextView.text = user
    }
}
package com.crisav2.mobiletest3.postDetails.presenter

import android.util.Log
import com.crisav2.core.data.Comment
import com.crisav2.core.data.Post
import com.crisav2.core.data.User
import com.crisav2.core.useCases.DetailPostUseCase
import com.crisav2.mobiletest3.commons.asCoreModel
import com.crisav2.mobiletest3.commons.commentsAsCoreModel
import com.crisav2.mobiletest3.postDetails.PostDetail
import com.crisav2.mobiletest3.repository.CommentsAPI
import com.crisav2.mobiletest3.repository.UserAPI
import com.crisav2.mobiletest3.repository.database.db.Interactors
import io.reactivex.Scheduler
import io.reactivex.disposables.CompositeDisposable
import kotlinx.coroutines.*

class PostDetailPresenter(
    private val view: PostDetail.View,
    private val interactors: Interactors,
    private val userAPI: UserAPI,
    private val commentsAPI: CommentsAPI,
    private val detailPostUseCase: DetailPostUseCase,
    private val subscribeOn: Scheduler,
    private val observeOn: Scheduler
): PostDetail.Presenter {

    private var job = Job()
    private val uiScope = CoroutineScope(Dispatchers.Main + job)

    private val disposables = CompositeDisposable()

    private var currentPost: Post? = null
    private var user: User? = null
    private var currentComments: List<Comment>? = emptyList()

    override fun init(postSelected: Post?) {
        postSelected?.let {
            currentPost = it
            setUpLoading()
            requestAllDataForPost()
            requestAllCommentsForPost()
        }
    }

    private fun setUpLoading() {
        view.showPostLoading(true)
        view.showCommentsLoading(true)
    }

    private fun requestAllCommentsForPost() {
        currentPost?.let{ post ->
            val commentDisposable = commentsAPI.getComments()
                .subscribeOn(subscribeOn)
                .observeOn(observeOn)
                .doFinally { view.showCommentsLoading(false) }
                .subscribe({ result ->
                    val comments = result.commentsAsCoreModel()
                    currentComments = detailPostUseCase.getCommentsForPost(comments, post.id)
                    currentComments?.let{
                        view.setUpComments(it)
                    }
                },{

                })

            disposables.add(commentDisposable)
        }
    }

    private fun requestAllDataForPost() {
        currentPost?.let { post ->
            uiScope.launch {
                withContext(Dispatchers.IO){
                    interactors.openPost(post.id, true)
                }
                requestUsers()
            }
        }

    }

    private fun requestUsers() {
        currentPost?.let { post ->
            val userDisposable = userAPI.getUsers()
                .subscribeOn(subscribeOn)
                .observeOn(observeOn)
                .doFinally { view.showPostLoading(false) }
                .subscribe({
                    val users = it.asCoreModel()
                    user = detailPostUseCase.getUserPost(post, users)
                    val userString = user?.let {
                        detailPostUseCase.getPresentationUser(it)
                    }?: ""
                    view.setUpPost(post, userString)
                },{
                    Log.e("PostDetail","Error $it")
                })
            disposables.add(userDisposable)
        }

    }

    override fun destroy() {
        disposables.dispose()
        disposables.clear()
    }

    override fun setAsFavorite() {
        currentPost?.let {post ->
            uiScope.launch {
                withContext(Dispatchers.IO){
                    interactors.favoritePost(post.id, !post.isFavorite)
                }
            }
        }
    }
}
package com.crisav2.mobiletest3.posts.presenter

import android.provider.Contacts
import android.util.Log
import com.crisav2.core.data.Post
import com.crisav2.core.useCases.ListPostsUseCase
import com.crisav2.mobiletest3.posts.Posts
import com.crisav2.mobiletest3.repository.PostsAPI
import com.crisav2.mobiletest3.repository.database.db.Interactors
import com.crisav2.mobiletest3.repository.model.PostNetwork
import com.crisav2.mobiletest3.repository.model.asCoreModel
import io.reactivex.Scheduler
import io.reactivex.disposables.CompositeDisposable
import kotlinx.coroutines.*
import retrofit2.http.POST

class PostsPresenter(
    private val view: Posts.View,
    private val postsAPI: PostsAPI,
    private val listPostsUseCase: ListPostsUseCase,
    private val interactors: Interactors,
    private val subscribeOn: Scheduler,
    private val observeOn: Scheduler
): Posts.Presenter {

    private var job = Job()
    private val uiScope = CoroutineScope(Dispatchers.Main + job)

    private var posts: List<Post> = mutableListOf()

    private val disposables = CompositeDisposable()
    override fun init() {
        view.showLoading(true)
        requestPosts()
    }

    override fun requestPosts() {
        getPostsDB()
    }

    override fun reloadPost() {
        view.showLoading(true)
        deleteCachedPost(true)
    }

    override fun deleteCachedPost(reload: Boolean) {
        uiScope.launch {
            withContext(Dispatchers.IO){
                interactors.removePosts()
                posts = emptyList()
                withContext(Dispatchers.Main){
                    view.showNoPosts()
                }
                if(reload){
                    requestPostsNetwork()
                }
            }
        }
    }

    override fun showAllPost() {
        view.showPosts(posts)
    }

    override fun showFavoritePost() {
        view.showPosts(listPostsUseCase.getOnlyFavoritePost(posts))
    }

    override fun deletePost(item: Post) {
        uiScope.launch {
            withContext(Dispatchers.IO){
                interactors.removePost(item.id)
            }
        }
    }

    private fun requestPostsNetwork(){
        val postsDisposable = postsAPI.getPosts()
            .subscribeOn(subscribeOn)
            .observeOn(observeOn)
            .subscribe({
                posts = retrievePosts(it)
                listPostsUseCase.setUpPostList(posts)
                cachePost(posts)
            },{
                view.showError(true, it.localizedMessage ?: "Error")
            })
        disposables.add(postsDisposable)
    }

    private fun getPostsDB(){
        uiScope.launch {
            withContext(Dispatchers.IO){
                posts = interactors.getPosts()
                if(posts.isEmpty()){
                    requestPostsNetwork()
                }else{
                    launch (Dispatchers.Main){
                        view.showLoading(false)
                        view.showPosts(posts)
                    }
                }
            }
        }
    }

    private fun cachePost(postsResult: List<Post>) {
        uiScope.launch {
            withContext(Dispatchers.IO){
                interactors.savePosts(postsResult)
            }
            view.showLoading(false)
            view.showPosts(postsResult)
        }
    }

    override fun destroy(){
        disposables.dispose()
        disposables.clear()
        job.cancel()
    }

    override fun validateIdAndNavigate(id: Int) {
        val currentPost = posts.firstOrNull { it.id == id }
        currentPost?.let {
            view.goToDetails(it)
        }
    }


    private fun retrievePosts(postsNetwork: List<PostNetwork>): List<Post>{
        val posts = mutableListOf<Post>()
        postsNetwork.forEach {
            posts.add(it.asCoreModel())
        }
        return posts
    }
}
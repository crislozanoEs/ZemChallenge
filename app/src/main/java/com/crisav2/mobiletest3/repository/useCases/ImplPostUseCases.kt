package com.crisav2.mobiletest3.repository.useCases

import com.crisav2.core.data.Post
import com.crisav2.mobiletest3.repository.database.db.Interactors
import kotlinx.coroutines.*
import javax.inject.Inject

class ImplPostUseCases() {

    @Inject
    lateinit var interactors: Interactors

    private var job = Job()
    private val uiScope = CoroutineScope(Dispatchers.Main + job)

    fun executeSavePosts(post: List<Post>){
        uiScope.launch {
            doSavePosts(post)
        }
    }

    private suspend fun doSavePosts(post: List<Post>) {
        withContext(Dispatchers.IO){
            interactors.savePosts(post)
        }
    }
}
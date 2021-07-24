package com.crisav2.core.useCases

import com.crisav2.core.data.Post

private const val MAX_ITEMS_OPENED = 20
private const val NUMBER_CHARACTERS_SHORT_DESCRIPTION = 50

class ListPostsUseCase {

    fun setUpPostList(posts: List<Post>){
        setUpUnreadPost(posts)
        setUpShotDescription(posts)
    }

    private fun setUpShotDescription(posts: List<Post>) {
        posts.forEach{
            if(it.description.length < NUMBER_CHARACTERS_SHORT_DESCRIPTION){
                it.shortDescription = it.description
            }else{
                it.shortDescription = it.description.substring(NUMBER_CHARACTERS_SHORT_DESCRIPTION - 1 )
            }
        }
    }

    private fun setUpUnreadPost(posts: List<Post>) {
        val limit = if(posts.size < MAX_ITEMS_OPENED){
            posts.size - 1
        }else{
            MAX_ITEMS_OPENED - 1
        }
        for(i in 0..limit){
            posts[i].hasBeenOpened = false
        }
    }

    fun getOnlyFavoritePost(posts: List<Post>): List<Post>{
        return posts.filter { it.isFavorite }
    }
}
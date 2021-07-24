package com.crisav2.mobiletest3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.crisav2.core.data.Post
import com.crisav2.mobiletest3.postDetails.view.PostDetailFragment
import com.crisav2.mobiletest3.posts.view.PostsFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        replaceFragment(PostsFragment.newInstance(),"POSTS")
    }

    private fun replaceFragment(fragment: Fragment, tag: String) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, fragment,tag)
            .addToBackStack(tag)
            .commitAllowingStateLoss()
    }

    fun goToDetail(post: Post){
        replaceFragment(PostDetailFragment.newInstance(post), "POST_DETAIL")
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId){
            android.R.id.home ->{
                onBackPressed()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}
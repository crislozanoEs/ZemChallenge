package com.crisav2.mobiletest3.commons

import android.view.View
import androidx.fragment.app.Fragment
import com.crisav2.core.data.Comment
import com.crisav2.core.data.User
import com.crisav2.mobiletest3.BaseApplication
import com.crisav2.mobiletest3.di.component.ApplicationComponent
import com.crisav2.mobiletest3.repository.model.CommentNetwork
import com.crisav2.mobiletest3.repository.model.UserNetwork
import com.crisav2.mobiletest3.repository.model.asCoreModel

val Fragment.applicationComponent: ApplicationComponent
    get() =(requireActivity().application as BaseApplication).applicationComponent

fun Boolean.getVisibility(): Int {
    return if(this){
        View.VISIBLE
    }else{
        View.GONE
    }
}

fun List<UserNetwork>.asCoreModel(): List<User>{
    val userList = mutableListOf<User>()
    this.forEach {
        userList.add(it.asCoreModel())
    }
    return userList
}

fun List<CommentNetwork>.commentsAsCoreModel(): List<Comment>{
    val commentList = mutableListOf<Comment>()
    this.forEach {
        commentList.add(it.asCoreModel())
    }
    return commentList
}

package com.crisav2.mobiletest3.repository.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.crisav2.core.data.Post
import retrofit2.http.POST

@Entity(tableName = "posts_table")
data class PostTable(
    @PrimaryKey(autoGenerate = false)
    val id: Int = 0,
    @ColumnInfo(name = "description")
    val description: String = "",
    @ColumnInfo(name = "short_description")
    val shortDescription: String = "",
    @ColumnInfo(name = "user_id")
    val userId: Int = 0,
    @ColumnInfo(name = "has_been_opened")
    val hasBeenOpened: Boolean = false,
    @ColumnInfo(name = "is_favorite")
    val isFavorite: Boolean = false
)

fun PostTable.createBasedOnModel(post: Post): PostTable{
    return PostTable(
        id = post.id,
        shortDescription = post.shortDescription,
        description = post.description,
        userId = post.userID,
        hasBeenOpened = post.hasBeenOpened,
        isFavorite = post.isFavorite
    )
}

fun PostTable.asCoreModel(): Post{
    return Post(
        id = id,
        shortDescription = shortDescription,
        description = description,
        userID = userId,
        hasBeenOpened = hasBeenOpened,
        isFavorite = isFavorite
    )
}
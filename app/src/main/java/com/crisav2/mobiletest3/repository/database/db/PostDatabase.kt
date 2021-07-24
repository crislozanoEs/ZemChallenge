package com.crisav2.mobiletest3.repository.database.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.crisav2.mobiletest3.repository.model.PostTable

@Database(entities = [PostTable::class], version = 1, exportSchema = false)
abstract class PostDatabase: RoomDatabase() {
    abstract val postDao: PostDao
    companion object{
        @Volatile
        private var INSTANCE: PostDatabase?= null
        fun getInstance(context: Context): PostDatabase {
            synchronized(this){
                var instance =
                    INSTANCE
                if(instance == null){
                    instance = Room.databaseBuilder(context.applicationContext, PostDatabase::class.java, "post_database")
                        .fallbackToDestructiveMigration().build()
                    INSTANCE = instance
                }
                return instance
            }
        }
    }

}
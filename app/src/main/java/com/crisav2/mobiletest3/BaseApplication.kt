package com.crisav2.mobiletest3

import android.app.Application
import android.content.Context
import com.crisav2.mobiletest3.di.component.ApplicationComponent
import com.crisav2.mobiletest3.di.component.DaggerApplicationComponent
import com.crisav2.mobiletest3.di.module.ApplicationModule

class BaseApplication: Application() {
    companion object{
        fun get(context: Context) = context.applicationContext as BaseApplication
    }


    lateinit var applicationComponent: ApplicationComponent

    override fun onCreate() {
        super.onCreate()
        applicationComponent = DaggerApplicationComponent
            .builder()
            .applicationModule(ApplicationModule(this))
            .build()
    }
}
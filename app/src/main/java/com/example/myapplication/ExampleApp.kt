package com.example.myapplication

import android.app.Application

class ExampleApp : Application() {

    private lateinit var appComponent : AppComponent

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.create()
    }

    fun getAppComponent() : AppComponent{
        return appComponent
    }
}
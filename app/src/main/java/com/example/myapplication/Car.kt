package com.example.myapplication

import android.util.Log
import javax.inject.Inject
import javax.inject.Singleton

@PerActivity
class Car @Inject constructor(private val wheels: Wheels, private val engine: Engine, private val driver: Driver) {

    private val tag1 : String = "Car"

    fun drive(){
        engine.start()
        Log.d(tag1,"$driver drive $this")
    }
}

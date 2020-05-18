package com.example.myapplication

import android.util.Log
import javax.inject.Inject

class Car @Inject constructor(val wheels: Wheels, val engine: Engine) {

    private val tag1 : String = "Car"

    fun drive(){
        engine.start()
        Log.d(tag1,"Driving...")
    }
}

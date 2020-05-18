package com.example.myapplication

import android.util.Log
import javax.inject.Inject

class DieselEngine @Inject constructor() : Engine {
    private val tag1 :String = "Car"

    override fun start() {
        Log.d(tag1,"Diesel Engine started...")
    }
}

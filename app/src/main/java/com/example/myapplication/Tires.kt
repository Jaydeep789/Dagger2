package com.example.myapplication

import android.util.Log

class Tires {

    // We do not own this class & cannot annotate constructor with Inject

    private val tag1: String = "Car"

    fun inflated() {
        Log.d(tag1, "Tires Inflated..")
    }
}
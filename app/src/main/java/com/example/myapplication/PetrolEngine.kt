package com.example.myapplication

import android.util.Log
import javax.inject.Inject
import javax.inject.Named

class PetrolEngine @Inject constructor(@Named("horse power") private val horsepower: Int,
                                       @Named("engine capacity") private val engineCapacity : Int) : Engine {

    private val tag1: String = "Car"

    override fun start() {
        Log.d(tag1, "Petrol Engine started. HorsePower :$horsepower. Engine Capacity : $engineCapacity")
    }
}
package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dagger.internal.DaggerCollections
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    private lateinit var car: Car
    private lateinit var carComponent : CarComponent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        carComponent = DaggerCarComponent.create()

        car = carComponent.getCar()

        car.drive()

    }
}

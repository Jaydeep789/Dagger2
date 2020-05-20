package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dagger.internal.DaggerCollections
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    private lateinit var car1: Car
    private lateinit var car2: Car
    private lateinit var carComponent1 : CarComponent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        carComponent1 = DaggerCarComponent.builder().horsePower(120)
            .engineCapacity(1400)
            .build()

        car1 = carComponent1.getCar()
        car2 = carComponent1.getCar()
        car1.drive()
        car2.drive()

    }
}

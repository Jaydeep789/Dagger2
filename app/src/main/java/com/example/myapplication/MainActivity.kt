package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    private lateinit var car1: Car
    private lateinit var car2: Car
    private lateinit var activityComponent1 : ActivityComponent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        activityComponent1 = DaggerActivityComponent.builder()
            .horsePower(120)
            .engineCapacity(1400)
            .appComponent((application as ExampleApp).getAppComponent())
            .build()

        car1 = activityComponent1.getCar()
        car2 = activityComponent1.getCar()
        car1.drive()
        car2.drive()

    }
}

package com.example.myapplication

import dagger.Component

@Component
interface CarComponent {
    fun getCar() : Car

    fun inject(mainActivity: MainActivity) : Unit
}
package com.example.myapplication

import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
class DieselEngineModule constructor(private val horsePower: Int) {

    @Provides
    fun providesDieselEngine(): Engine {
        return DieselEngine(horsePower)
    }
}
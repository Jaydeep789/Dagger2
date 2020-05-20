package com.example.myapplication

import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
class DieselEngineModule constructor(private val horsePower: Int) {

    @Provides
    fun providesHorsePower(): Int {
        return horsePower
    }

    @Provides
    fun providesDieselEngine(dieselEngine: DieselEngine): Engine {
        return dieselEngine
    }
}
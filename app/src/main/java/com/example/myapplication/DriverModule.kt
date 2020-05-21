package com.example.myapplication

import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DriverModule {

    @Provides
    @Singleton
    fun provideDriver() : Driver{
        return Driver()
    }
}
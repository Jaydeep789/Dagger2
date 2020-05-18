package com.example.myapplication

import dagger.Module
import dagger.Provides

@Module
class WheelsModule {

    @Provides
    fun provideRims(): Rims {
        return Rims()
    }

    @Provides
    fun provideTires(): Tires {
        val tires = Tires()
        tires.inflated()
        return tires
    }

    @Provides
    fun providesWheels(rims: Rims, tires: Tires): Wheels {
        return Wheels(rims, tires)
    }


}
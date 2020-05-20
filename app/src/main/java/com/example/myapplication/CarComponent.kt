package com.example.myapplication

import dagger.BindsInstance
import dagger.Component
import javax.inject.Named
import javax.inject.Singleton

@Singleton
@Component(modules = [WheelsModule::class, PetrolEngineModule::class])
interface CarComponent {
    fun getCar(): Car

    fun inject(mainActivity: MainActivity): Unit

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun horsePower(@Named("horse power")horsePower: Int): Builder

        @BindsInstance
        fun engineCapacity(@Named("engine capacity")engineCapacity: Int): Builder

        fun build(): CarComponent
    }
}
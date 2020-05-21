package com.example.myapplication

import dagger.BindsInstance
import dagger.Component
import javax.inject.Named
import javax.inject.Singleton

@PerActivity
@Component(dependencies = [AppComponent::class],modules = [WheelsModule::class, PetrolEngineModule::class])
interface ActivityComponent {
    fun getCar(): Car

    fun inject(mainActivity: MainActivity): Unit

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun horsePower(@Named("horse power")horsePower: Int): Builder

        @BindsInstance
        fun engineCapacity(@Named("engine capacity")engineCapacity: Int): Builder

        fun appComponent(appComponent: AppComponent) : Builder

        fun build(): ActivityComponent
    }
}
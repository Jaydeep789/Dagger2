package com.example.myapplication

import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
abstract class PetrolEngineModule {

    @Binds
    abstract fun bindPetrolEngine(petrolEngine: PetrolEngine) : Engine
}
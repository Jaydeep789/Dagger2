package com.example.myapplication

import javax.inject.Inject

class Wheels constructor(val rims: Rims, val tires: Tires) {
    // We do not own this class & cannot annotate constructor with Inject
}
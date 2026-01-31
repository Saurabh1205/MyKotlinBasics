package com.example.mykotlinbasics.jetpack_archi_compo

import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    var count = 0

    fun getIncrement() {
        count++
    }

    fun getDecrement(){
        count--
    }

    fun getReset() {
         0.also { count = it }
    }

}
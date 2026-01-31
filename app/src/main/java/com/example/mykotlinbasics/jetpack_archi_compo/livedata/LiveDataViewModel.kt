package com.example.mykotlinbasics.jetpack_archi_compo.livedata

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LiveDataViewModel : ViewModel() {
    var factsLiveData = MutableLiveData<String>("This is a fact")

    fun updateLiveData() {
        factsLiveData.value = "Another Fact"
    }
}
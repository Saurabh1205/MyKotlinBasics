package com.example.mykotlinbasics.dagger2_example

import android.app.Application
//import com.example.mykotlinbasics.DaggerAppComponent

class UserApplication : Application() {
//    lateinit var userRegistrationComponent: UserRegistrationComponent
    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
//        userRegistrationComponent = DaggerUserRegistrationComponent.factory().create(3)
        appComponent = DaggerAppComponent.builder().build()
    }
}
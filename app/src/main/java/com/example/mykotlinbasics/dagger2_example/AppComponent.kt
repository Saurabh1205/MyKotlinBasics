package com.example.mykotlinbasics.dagger2_example

import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AnalyticsModule::class])
interface AppComponent {
//    fun getUserRegistrationComponentFactory() : UserRegistrationComponent.Factory //Using Factory
    fun getUserRegistrationComponentBuilder() : UserRegistrationComponent.Builder // Using Component Builder
//    fun getUserRegistrationComponent() : UserRegistrationComponent  //Without Factory
}
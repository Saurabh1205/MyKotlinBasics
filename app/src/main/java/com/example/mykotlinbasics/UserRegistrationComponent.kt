package com.example.mykotlinbasics

import dagger.Component


@Component(modules = [UserRepositoryModule::class, NotificationServiceModule::class])
interface UserRegistrationComponent {

    fun Inject(mainActivity: MainActivity)

}
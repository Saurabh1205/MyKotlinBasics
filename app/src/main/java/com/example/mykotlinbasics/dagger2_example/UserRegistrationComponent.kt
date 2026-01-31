package com.example.mykotlinbasics.dagger2_example

import dagger.BindsInstance
import dagger.Subcomponent

@ActivityScope   // or use @Singleton
@Subcomponent(modules = [UserRepositoryModule::class, NotificationServiceModule::class])
interface UserRegistrationComponent {

    fun Inject(mainActivity: MainActivity)

//    @Subcomponent.Factory
//    interface Factory {
//        fun create(@BindsInstance retryCount: Int): UserRegistrationComponent
//    }
    @Subcomponent.Builder
    interface Builder {
        fun build(): UserRegistrationComponent
        fun retryCount(@BindsInstance retryCount: Int): Builder
    }
}
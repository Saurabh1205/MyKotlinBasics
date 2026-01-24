package com.example.mykotlinbasics

import dagger.Module
import dagger.Provides
import kotlin.reflect.KClass

@Module
class UserRepositoryModule {
    @Provides
    fun getFirebaseRepository(): UserRepository {
        return FirebaseRepository()
    }

}

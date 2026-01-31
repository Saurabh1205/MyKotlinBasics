package com.example.mykotlinbasics.dagger2_example

import dagger.Binds
import dagger.Module

//@Module
//class UserRepositoryModule {
//    @Provides
//    fun getFirebaseRepository(): UserRepository {
//        return FirebaseRepository()
//    }


// }
@Module
abstract  class UserRepositoryModule{
    @Binds
    @ActivityScope          // or use @Singleton
    abstract fun getSQLRepository(sqlRepository: SQLRepository): UserRepository
}



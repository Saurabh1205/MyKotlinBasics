package com.example.mykotlinbasics.dagger2_example

import android.content.ContentValues.TAG
import android.util.Log
import javax.inject.Inject

/*@Inject
* use for construction injection as well as field Injection  */

interface UserRepository{
    fun saveUser(email : String, password : String)

}
@ActivityScope   // or use  @Singleton
class SQLRepository @Inject constructor(var analyticService: AnalyticService) : UserRepository{ //Constructor Injection
    override fun saveUser(email : String, password : String){
        Log.d(TAG, "User saved in database")
        analyticService.trackEvent("Save User","Create")

    }
}
class FirebaseRepository(var analyticService: AnalyticService) : UserRepository{
    override fun saveUser(email : String, password : String) {
        Log.d(TAG, "User saved in firebase")
        analyticService.trackEvent("Save User","Create")

    }
}
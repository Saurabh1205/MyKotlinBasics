package com.example.mykotlinbasics

import android.content.ContentValues.TAG
import android.util.Log
import javax.inject.Inject

/*@Inject
* use for construction injection as well as field Injection  */

interface UserRepository{
    fun saveUser(email : String, password : String)

}
class SQLRepository @Inject constructor() : UserRepository{ //Constructor Injection
    override fun saveUser(email : String, password : String){
        println("User saved in database")
        Log.d(TAG, "User saved in database")

    }
}
class FirebaseRepository : UserRepository{
    override fun saveUser(email : String, password : String) {
        println("User saved in firebase")
    }
}
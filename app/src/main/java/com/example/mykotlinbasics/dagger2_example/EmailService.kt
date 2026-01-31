package com.example.mykotlinbasics.dagger2_example

import android.content.ContentValues.TAG
import android.util.Log
import javax.inject.Inject

interface NotificationService{
    fun send(to: String, from: String, body: String?)
}
@ActivityScope  // or use @Singleton
class EmailService @Inject constructor() : NotificationService {
    override fun send(to: String, from: String, body: String?){
        println("Email sent")
    Log.d(TAG, "Email sent")

    }
}
class MessageService(private val retryCount: Int) : NotificationService {
    override fun send(to: String, from: String, body: String?) {
        println("SMS sent")
        Log.d(TAG, "SMS sent retry count = $retryCount")
    }
}
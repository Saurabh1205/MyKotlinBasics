package com.example.mykotlinbasics.dagger2_example

import android.content.ContentValues.TAG
import android.util.Log

interface AnalyticService {
    fun trackEvent(eventName: String, eventType: String)

}

class MixedPannel : AnalyticService{
    override fun trackEvent(eventName: String, eventType: String) {
        Log.d(TAG, "MixedPannel =   $eventName - $eventType")

    }

}

class FirebaseAnalytic : AnalyticService{
    override fun trackEvent(eventName: String, eventType: String) {
        Log.d(TAG, "FirebaseAnalytic =   $eventName - $eventType")
    }

}
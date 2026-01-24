package com.example.mykotlinbasics

import dagger.Module
import dagger.Provides

@Module
class NotificationServiceModule {
    @Provides
    fun getMessageService(): NotificationService {
        return MessageService()
    }

}
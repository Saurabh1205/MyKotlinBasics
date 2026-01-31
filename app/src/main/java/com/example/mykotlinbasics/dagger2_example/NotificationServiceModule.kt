package com.example.mykotlinbasics.dagger2_example

import dagger.Module
import dagger.Provides
import jakarta.inject.Named

@Module
class NotificationServiceModule() {
    @ActivityScope  // or use @Singleton
    @MessageQualifire
    @Provides
//    fun getMessageService(retryCount: Int): NotificationService {
//        return MessageService(retryCount)
//    }
    fun getMessageService(): NotificationService {
        return MessageService(3)
    }
    @Named("email")
    @Provides
    fun getEmailService(emailService: EmailService): NotificationService {
        return emailService
    }
}

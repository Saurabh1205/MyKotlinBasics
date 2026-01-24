package com.example.mykotlinbasics

import javax.inject.Inject

class UserRegistrationService @Inject constructor( //Constructor Injection
    private val userRepository: UserRepository ,
    private val notificationService: NotificationService
) {
    fun registerUser(email: String, password: String) {
        userRepository.saveUser(email, password)
        notificationService.send(
            email,
            "william.henry.harrison@example-pet-store.com",
            "User registered successfully"
        )
    }
}

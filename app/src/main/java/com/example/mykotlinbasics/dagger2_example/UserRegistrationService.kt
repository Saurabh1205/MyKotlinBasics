package com.example.mykotlinbasics.dagger2_example

import javax.inject.Inject

class UserRegistrationService @Inject constructor( //Constructor Injection
    private val userRepository: UserRepository ,
    @MessageQualifire private val notificationService: NotificationService  //Field Injection
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

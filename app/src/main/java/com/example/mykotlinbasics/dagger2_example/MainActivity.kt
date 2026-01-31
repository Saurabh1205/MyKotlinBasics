package com.example.mykotlinbasics.dagger2_example

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.mykotlinbasics.R
import javax.inject.Inject
/*@Inject Annotation
use for construction injection as well as field Injection*/
class MainActivity : AppCompatActivity() {
    @Inject //Field Injection
    lateinit var userRegistrationService: UserRegistrationService

    @Inject // Field Injection
    lateinit var emailService: EmailService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        //Manual Dependency Injection
//        val userRepository = UserRepository()
//        val emailservice = EmailService()

//        val userRegistrationService = UserRegistrationService(userRepository, emailservice)

//        val component = DaggerUserRegistrationComponent.factory().create(3)
//            .notificationServiceModule(NotificationServiceModule(3))
//            .build()
//        component.Inject(this)
//        val component = (application as UserApplication).userRegistrationComponent
//        component.Inject(this)
            val appComponent = (application as UserApplication).appComponent
//             val userRegistrationComponent = appComponent.getUserRegistrationComponentFactory().create(3) //Subcomponent
//             val userRegistrationComponent = appComponent.getUserRegistrationComponent() //Subcomponent
             val userRegistrationComponent = appComponent.getUserRegistrationComponentBuilder().retryCount(3).build() //Using Builder
                 userRegistrationComponent.Inject(this)
        userRegistrationService.registerUser("saurabh@gmai.com", "11111")
    }
}
package com.example.mykotlinbasics.dagger2_example

import jakarta.inject.Qualifier
import java.lang.annotation.Documented
import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy

@Qualifier
@Documented
@Retention(RetentionPolicy.RUNTIME)
annotation class MessageQualifire()

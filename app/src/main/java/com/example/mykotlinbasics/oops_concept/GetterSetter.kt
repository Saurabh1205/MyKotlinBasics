package com.example.mykotlinbasics.oops_concept

import kotlin.math.absoluteValue

fun main(){
val obj = Person("John", 30)
    println(obj.name)
    println(obj.age)
    obj.name = "Jane"
    obj.age = 25

}

class Person(nameParam: String, ageParam: Int){
    var name = nameParam
    get() {
        return field.uppercase()
    }
        set(value){
            if (value != "") {
                field = value
            } else print("Age cant be Negative")

        }
    var age = ageParam
        get() = field.absoluteValue
        set(value){
            if (value >= 0) {
                field = value
            } else print("Age cant be Negative")

        }


}
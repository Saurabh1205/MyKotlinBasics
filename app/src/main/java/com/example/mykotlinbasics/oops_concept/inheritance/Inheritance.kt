package com.example.mykotlinbasics.oops_concept.inheritance
/*
* In Kotlin only one Parent class Should be inherit there Property's to Child class.
* */
fun main(){
var obj = Child()
    obj.myMethod()
    obj.myMethod1()
    println(obj.name)
}
open class Parent {  // Open keyword is use to make it Public will accessible to child class
    init{
        println("Parent Constructor called")
    }

    var name : String = ""
    fun myMethod() {
        println("i am in parent class")
    }
}
class Child : Parent() {
    init{
        println("Child Constructor called")
    }
    fun myMethod1() {
        println("I am in child class")
    }
    }

package com.example.mykotlinbasics.oops_concept.inheritance
/*
* Open Any class
* Every kotlin class any has a Super Class.
* some of the common methods are equals, hashCode, toSting
* */
fun main() {
    val obj = OnePlus("Smart Phone")
    obj.display()
    val obj1 = Mobile("Simple Mobile")
    obj1.display()
    println(obj.toString())
}

open class Mobile(val type: String) {
    open val name: String = ""
    open val size: Int = 5
    fun makeCalls() = println("Calling From Mobile")
    fun powerOff() = println("Shouting Down")
    open fun display() = println("Simple Mobile Display")
}

class OnePlus(val typeParam: String) : Mobile(typeParam) {
    override val name: String = "One Plus"
    override val size: Int = 6
    override fun display(){
        super.display()  // Using Super Key word can we able to call parent class method
        println("OnePlus Display")
    }
    override fun toString(): String {
        return  "Name : $name \nSize : $size \nType : $type \nTypeParam : $typeParam"
    }
}


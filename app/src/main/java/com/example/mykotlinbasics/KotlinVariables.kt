package com.example.mykotlinbasics
/*
* Type Inference
* Type Checking
* Define Explicitly
* Type Conversion
* Type Casting
* In Kotlin we are create 2 type of variable 1. var 2. val
* */
fun main(){

/*
// Data Type of Variables
    1. Integer(Byte, Short, Int, Long)
    2. Float(Float, Double)
    3. Boolean(True, False)
    4. Char(Char,String)
*/
// Type Inference
//    ctrl + shift + P so it will show you a which type of value assign to the variables
    //    this auto adoption feature is called Type Inference
    var short = 5

//    Type Checking
    // if i am trying to re-asign a floating point value to my Short variable having type inference is Int
//    it will give me error this is call type checking.
//     short = 12.5   Assignment type mismatch: actual type is 'Double', but 'Int' was expected.

// Explicitly Define Type
    var short1 : Int = 5
    short1 = 12
    var temperature : Double = 10.5
    var isRaining : Boolean = true
    var alphabet : Char = 'A'
    var message : String = "Hello world"

// Type Conversion
    // The type conversion in Kotlin is done automatically by the compiler.
    var lites : Byte = 127
    var short2 : Short = lites.toShort()
    var int2 : Int = short2.toInt()
    var long2 : Long = int2.toLong()
    var float2 : Float = long2.toFloat()
    var double2 : Double = float2.toDouble()
    var message2 : String = int2.toString()

// Type Casting
    // The type casting in Kotlin is done using the 'as' keyword.
    var lites3 : Byte = 127
    var short3 : Short = lites3 as Short
    var int3 : Int = short3 as Int
    var long3 : Long = int3 as Long
    var float3 : Float = long3 as Float
    var double3 : Double = float3 as Double
    var message3 : String = int3 as String


}
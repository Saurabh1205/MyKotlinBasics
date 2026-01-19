package com.example.mykotlinbasics

fun main(){
 calculateExecutionSpeed { loop(10000) }
}
fun calculateExecutionSpeed(fn:()-> Unit){
    val startTime = System.currentTimeMillis()
    fn()
    val endTime = System.currentTimeMillis()
    val executionTime = endTime - startTime
    println("Execution Time : $executionTime ms")
}
fun loop(num:Long){
    for(i in 1..num){
        //
    }

}
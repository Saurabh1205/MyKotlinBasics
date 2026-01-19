package com.example.mykotlinbasics.oops_concept.polymorphism
/*
* what is Polymorphism ?
* - a parent can hold reference to its child
*  and parent can call methods of child classes (dynamic dispatch)
* */
fun main(){
val circle : Shape = Circle(5.0)
    val square : Shape = Square(5.0)
//println(circle.area())
//    println(square.area())
    val shapes = arrayOf(circle, square, Circle(10.0), Square(10.0), Triangle(10.0, 5.0))
    calculateArea(shapes)

}
fun calculateArea(shapes : Array<Shape>){
    for (shape in shapes){
        println(shape.area())
    }

}
open class Shape{
    open fun area(): Double{
        return 0.0
    }
}
class Circle(val radius: Double) : Shape(){
    override fun area(): Double{
        return Math.PI * radius * radius
    }
}
class Square(val side: Double) : Shape(){
    override fun area(): Double{
        return side * side
    }
}
class Triangle(val base: Double, val height: Double) : Shape(){
    override fun area(): Double {
        return 0.5 * base * height
    }
}
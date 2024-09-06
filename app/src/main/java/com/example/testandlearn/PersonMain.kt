package com.example.testandlearn

class PersonMain {

}

fun main(){
//    enter weight & height
    val p = Person(63.5f,145.0f)
    p.greeting()
    val my_bmi = p.calculate_bmi()
    println("My bmi is $my_bmi")
}
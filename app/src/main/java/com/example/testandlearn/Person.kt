package com.example.testandlearn

class Person constructor(val w:Float, val h:Float){
    fun greeting(){
        println("Hello")
    }
//    bmi calculate function

fun calculate_bmi(): Float {
    val m = h / 100
    val bmi = w / (m * m)

    when {
        bmi < 18.5 -> println("Underweight")
        bmi >= 18.5 && bmi < 24.9 -> println("Normal")
        bmi >= 25 && bmi < 29.9 -> println("Overweight")
        bmi >= 30 -> println("Obese")
    }

    return bmi
}
}




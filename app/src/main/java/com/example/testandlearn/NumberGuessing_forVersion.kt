package com.example.testandlearn

import kotlin.random.Random


class NumberGuessing_forVersion {
    fun NumberFor(){
        var secret = (1..10).random()
        for(i in 1..3){
            print("Please enter a number:")
            val input_num = readln().toIntOrNull() ?:0
            //check correct or not
            if(input_num == secret){
                println("You got it!")
                break
            }else {
                when{
                    input_num > secret -> println("Too high!Try again!")
                    input_num < secret -> println("Too low!Try again!")
                }
            }
            //fail when the thrird time didn't guess correct
            if (i == 3 && input_num != secret){
                println("You fail! The secret number is $secret")
            }
        }

    }
}
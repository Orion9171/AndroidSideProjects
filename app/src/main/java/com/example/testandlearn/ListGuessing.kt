package com.example.testandlearn

class ListGuessing {
    fun main(){
        var num = mutableListOf<Int>(1,2,3,4,5,6,7,8,9,10)
        num.shuffle()
        var secret = num.removeAt(0)
        var bomb = num.removeAt(0)
        var count = 0
        for (i in (1..3)){
            print("Please enter a number:")
            val input_num = readln().toIntOrNull() ?: 0
            if(input_num == secret){
                println("You got it")
                break
            }else{

                when{
                    input_num > secret -> println("Too high !")
                    input_num < secret -> println("Too low !")
                }
                count++
                println("wrong for the $count time")
            }
            if (input_num == bomb){
                println("Boom ! You Fail ! The correct answer is $secret")
                break
            }
            if(i==3 && input_num != secret){
                println("Fail ! Try again ! The correct answer is $secret")
            }
        }


    }
}
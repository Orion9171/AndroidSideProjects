package com.example.testandlearn

import androidx.annotation.Nullable

class Guess {
    fun main(){
        var num = mutableListOf <Int>(1,2,3,4,5,6,7,8,9,10)
        num.shuffle()
        var secret = num.get(0)
        var input_num = 0
        var min = num.min()
        var max = num.max()
        while(input_num != secret){
            print("Enter a number($min - $max):")
            var input_num = readln().toIntOrNull() ?:0
            if(input_num>secret){
                max = input_num
            }else if(input_num<secret){
                min = input_num
            }else{
                println("You got it!")
                break
            }
        }


    }
}
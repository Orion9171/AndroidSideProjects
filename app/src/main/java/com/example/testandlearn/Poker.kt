package com.example.testandlearn

import androidx.compose.material3.CircularProgressIndicator

fun main(){
    val deck = mutableListOf<Int>()
    for(i in 0 until 52){
        deck.add(i)
        if(i%13 == 0 && i!=0) println()
        val a = i/13
        var type = when(a){
            1 -> "C"
            2 -> "D"
            3 -> "H"
            else -> "S"
        }
        print("${(i%13)+1}$type")
    }
}
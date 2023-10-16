package com.example.diceapp

class Dice(val numside:Int) {
    fun roll():Int{
        return (1..numside).random()
    }

}
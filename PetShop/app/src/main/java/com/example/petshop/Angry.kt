package com.example.petshop

class Angry (date: String): Mood(date) {
    override fun Feeling(): String{
        return "Mad"
    }
}
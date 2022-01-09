package com.example.newworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myFunc()
    }

    private fun myFunc() {
        // WHEN (SWITCH)
        val country = "Mexico"

        when(country) {
            "Spain" ->  println("This is Spain")
            "Canada" -> println("This is Canada")
            "Mexico" -> println("This is Mexico")
            else -> println("Where i am?")
        }

    }
}
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
        sayHello()
        sayMyName("Raquel")
        val sum = sumTwoValues(8, 3)
        println(sum)
    }

    // FUNCTIONS
    // Simple
    fun sayHello() {
        println("Hola!")
    }

    // With params
    fun sayMyName(name: String){
        println("Hola, mi nombre es $name")
    }

    // Return value
    fun sumTwoValues(numA: Int, numB: Int): Int {
        return numA + numB
    }
}
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
        // LOOPS

        val crushes: List<String> = listOf("Raquel", "Aly", "Ale")
        val ages: MutableMap<String, Int> = mutableMapOf(
            "Raquel" to 21,
            "Aly" to 20,
            "Ale" to 29
        )

        // FOR
        for (crush in crushes) {
            println(crush)
        }

        for (age in ages){
            println("${age.key} is ${age.value} years old")
        }

        for(x in 0..10){
            println(x)
        }

        for(x in 0 until 10){ // exclude 10
            println(x)
        }

        for(x in 0..10 step 2) println(x)
        for(x in 0 until 10 step 3) println(x)

        // Numeric Range Array
        val numArr = (0..20) // IntRange
        println(numArr)

        // WHILE
        var x = 0

        while (x < 10) {
            println(x)
            x++
        }
    }

}
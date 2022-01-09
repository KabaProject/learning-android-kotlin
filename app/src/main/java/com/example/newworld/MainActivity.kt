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
        // ARRAY

        val name = "Raquel"
        val surname = "Sanabria"
        val company = "Twitter"
        val age = "21"

        // Creation
        val raquel: ArrayList<String> = arrayListOf<String>()

        // Add data
        raquel.add(name)
        raquel.add(name) // Accept duplicated data
        raquel.add(surname)
        raquel.add(company)
        raquel.add(age)

        // Print
        println(raquel)

        // Add a list of data
        raquel.addAll(listOf("Blacked", "Waifu"))
        raquel.addAll(raquel)
        println(raquel)

        // Data Access
        println(raquel[0])

        // Modify Data
        raquel[0] = "Raquel <3"
        println(raquel[0])

        // Remove Data
        raquel.removeAt(0)
        println(raquel)

        // Iteration
        raquel.forEach{
            println(it)
        }

        // OPERATIONS
        // Array Size
        println("Raquel length: ${raquel.count()}")

        // Clear Array
        raquel.clear()
        println("Raquel length: ${raquel.count()}")
    }
}
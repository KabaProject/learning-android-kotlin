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
        // Null Safety

        val user = "KabaProject"
        // user = null -> posible error
        println(user)

        var userSafe: String? = "KabaProject" // This string is nullable
        println(userSafe)

        // Check if it'ms nullable, if not, force it to work as non-null
        if(userSafe != null){
            println(userSafe!!) // Throw error if it's null
        }

        // Safety Call
        userSafe = null
        println(userSafe?.length) // It doesn't call the operation if it's null

        userSafe?.let{ // Runs code if isn't null
            //println(it!!)
            print("No nulo")
        } ?: run {
            println("Es nulo")
        }
    }

}
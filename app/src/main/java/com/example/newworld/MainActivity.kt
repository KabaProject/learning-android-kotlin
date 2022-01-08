package com.example.newworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        variablesYConstantes()
    }

    private fun variablesYConstantes() {
        // Variables

        var myVar= "Hello World"
        println(myVar)

        myVar = 1.toString() // Convert int to string
        println(myVar)

        // Constants

        val constant = "My Constant" // Cannot be changed
        println(constant)
    }
}
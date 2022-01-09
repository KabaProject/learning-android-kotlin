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
        // MAPS (Dictonary)

        var tiktok: Map<String, Int> = mapOf() // Inmutable Map
        println(tiktok) // Empty map

        // Add data
        tiktok = mutableMapOf( // Mutable Map
            "Raquel" to 21,
            "RealFrogg" to 24,
            "Aly" to 20
        )

        // Add value
        tiktok["Mark"] = 32
        tiktok.put("Sophie", 10)
        println(tiktok)

        // Override value
        tiktok["Mark"] = 18
        println(tiktok["Mark"])

        // Remove data
        tiktok.remove("Mark")
        println(tiktok)
    }

}
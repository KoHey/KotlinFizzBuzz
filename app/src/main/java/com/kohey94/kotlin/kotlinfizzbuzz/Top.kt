package com.kohey94.kotlin.kotlinfizzbuzz

import android.content.Intent
import android.content.IntentFilter
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Top : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_top)
        val kotlinButton = findViewById(R.id.kotlinButton) as Button
        kotlinButton.setOnClickListener { v ->
            val intent = Intent(application, MainActivity::class.java)
            startActivity(intent)
        }
    }
}

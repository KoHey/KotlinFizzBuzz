package com.kohey94.kotlin.kotlinfizzbuzz

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Top : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_top)
        val kotlinButton = findViewById(R.id.kotlinButton) as Button
        val javaButton = findViewById(R.id.javaButton) as Button
        kotlinButton.setAllCaps(false)
        javaButton.setAllCaps(false)
        kotlinButton.setOnClickListener { v ->
            val ktIntent = Intent(application, KotlinActivity::class.java)
            startActivity(ktIntent)
        }
        javaButton.setOnClickListener { v ->
            val javaIntent = Intent(application, JavaActivity::class.java)
            startActivity(javaIntent)
        }
    }
}

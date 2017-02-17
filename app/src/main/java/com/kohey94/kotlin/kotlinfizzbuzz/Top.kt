package com.kohey94.kotlin.kotlinfizzbuzz

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Top : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_top)
        val kotlinButton = findViewById(R.id.createButton) as Button
        kotlinButton.setAllCaps(false)
        kotlinButton.setOnClickListener { v ->
            //画面遷移
        }
    }
}

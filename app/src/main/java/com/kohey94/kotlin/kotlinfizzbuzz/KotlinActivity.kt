package com.kohey94.kotlin.kotlinfizzbuzz
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
class KotlinActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val inputNumber = findViewById(R.id.inputNumber) as EditText
        val outputText = findViewById(R.id.outputWord) as TextView
        val createButton = findViewById(R.id.createButton) as Button
        createButton.setAllCaps(false)
        createButton.setOnClickListener { v ->
            if(inputNumber.length() != 0){//入力チェック
                val intInputNum = inputNumber.text.toString().toInt()
                var str: String = ""
                for (x in 1..intInputNum) {
                    str += when {
                        x % 3 == 0 && x % 5 == 0 -> "FizzBuzz\n"
                        x % 3 == 0 -> "Fizz\n"
                        x % 5 == 0 -> "Buzz\n"
                        else -> "${x.toString()}\n"
                    }
                }
                outputText.text = str
            }else{
                Log.v("input","入力してください")
            }
        }
    }
}

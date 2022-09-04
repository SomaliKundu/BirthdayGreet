package com.example.birthdaygreet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class BirthdayGreetingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_greeting)

        val greet = findViewById<TextView>(R.id.greetCard)
        val name = intent.getStringExtra("name")
        greet.text = "Happy Birthday\n$name!"
    }
}
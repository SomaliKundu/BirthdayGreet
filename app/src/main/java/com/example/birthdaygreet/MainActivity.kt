package com.example.birthdaygreet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.renderscript.ScriptGroup
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val input = findViewById<EditText>(R.id.nameInput)

        val button = findViewById<Button>(R.id.createBirthdayButton)
        button.setOnClickListener{
            val name = input.editableText.toString()
            val intent  = Intent(this,BirthdayGreetingActivity::class.java)
            intent.putExtra("name",name)
            startActivity(intent)

        }
    }



}
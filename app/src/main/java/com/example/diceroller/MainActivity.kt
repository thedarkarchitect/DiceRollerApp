package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)//this inflates the activity main to show the view

        val rollButton : Button = findViewById(R.id.roll_button)

        rollButton.text = "Let's roll"
    }
}
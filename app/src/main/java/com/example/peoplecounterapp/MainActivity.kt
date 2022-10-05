package com.example.peoplecounterapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.textView)
        val clickMeButton = findViewById<Button>(R.id.clickMeButton)
        val resetButton = findViewById<Button>(R.id.resetButton)

        var timeClicked = 0

        clickMeButton.setOnClickListener {
            timeClicked++
            textView.text = "You clicked the button $timeClicked times !!"
        }

        resetButton.setOnClickListener {
            timeClicked = 0
            textView.text = "You clicked the button $timeClicked times !!"
        }
    }
}
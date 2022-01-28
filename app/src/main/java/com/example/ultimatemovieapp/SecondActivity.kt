package com.example.ultimatemovieapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val btnAction = findViewById<Button>(R.id.btn_action)
        btnAction.setOnClickListener {
            finish()
        }
    }
}
package com.example.ultimatemovieapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val texto =  findViewById<TextView>(R.id.tv_output)
        val btnAction = findViewById<Button>(R.id.btn_action)

        btnAction.setOnClickListener {
            navigateSecondActivity()
        }
    }

    private fun navigateSecondActivity(){
        val intent = Intent(this, SecondActivity::class.java)
        startActivity(intent)
    }

}
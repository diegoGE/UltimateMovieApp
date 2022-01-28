package com.example.ultimatemovieapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("Lifecycle","OnCreate")

        val texto =  findViewById<TextView>(R.id.tv_output)
        val btnAction = findViewById<Button>(R.id.btn_action)

        btnAction.setOnClickListener {
            texto.text = "Curso Android"
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("Lifecycle","OnStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Lifecycle","OnResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Lifecycle","OnPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Lifecycle","OnStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("Lifecycle","OnRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Lifecycle","OnDestroy")
    }
}
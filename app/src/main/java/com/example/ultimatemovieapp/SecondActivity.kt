package com.example.ultimatemovieapp

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class SecondActivity : AppCompatActivity() {

    private var nombre: String? = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val btnAction = findViewById<Button>(R.id.btn_action)
        val twText = findViewById<TextView>(R.id.tv_output)

        intent.extras?.let { bundle ->
            nombre = bundle.getString("name")
        }

        twText.text = nombre

        btnAction.setOnClickListener {
            val intent = Intent()
            intent.putExtra("name2", "Hola desde segunda Actvity")
            setResult(Activity.RESULT_OK,intent)
            finish()
        }
    }
}
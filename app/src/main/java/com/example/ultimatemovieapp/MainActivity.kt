package com.example.ultimatemovieapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val texto = findViewById<TextView>(R.id.txt_output)
        val boton = findViewById<Button>(R.id.btn_accion)

        boton.setOnClickListener {
            navegarSegundaActivity()
        }
    }

    private fun navegarSegundaActivity(){
        val intent = Intent(this,SegundaActivity::class.java)
        startActivity(intent)
    }
}
package com.example.ultimatemovieapp

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class SegundaActivity : AppCompatActivity() {

    private var nombre: String? = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segunda)

        val button = findViewById<Button>(R.id.btn_accion)
        val texto = findViewById<TextView>(R.id.txt_output)

        intent.extras?.let {bundle ->
            nombre = bundle.getString("nombre")
        }

        texto.text = nombre

        button.setOnClickListener {
            val intent = Intent()
            intent.putExtra("nombre2","Hola desde segunda activity")
            setResult(Activity.RESULT_OK,intent)
            finish()
        }
    }
}
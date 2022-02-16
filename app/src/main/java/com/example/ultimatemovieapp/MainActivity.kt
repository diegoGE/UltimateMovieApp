package com.example.ultimatemovieapp

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var texto:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        texto =  findViewById<TextView>(R.id.tv_output)
        val btnAction = findViewById<Button>(R.id.btn_action)

        btnAction.setOnClickListener {
            navigateSecondActivity()
        }
    }

    private fun navigateSecondActivity(){
        val intent = Intent(this, SecondActivity::class.java)
        intent.putExtra("name","Curso Android")
        startActivityForResult(intent,1)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == 1){
            if (resultCode == Activity.RESULT_OK){
                val nombre = data?.getStringExtra("name2")
                texto.text = nombre
            }
        }
    }

}
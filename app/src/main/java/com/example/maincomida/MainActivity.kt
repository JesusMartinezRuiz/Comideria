package com.example.maincomida

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var crear:Button
    lateinit var ver:Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        crear=findViewById(R.id.main_btn_crear)
        ver=findViewById(R.id.main_btn_ver)

        ver.setOnClickListener {
            val actividad = Intent(applicationContext,verPlato::class.java)
            startActivity (actividad)
        }

        crear.setOnClickListener {
            val actividad = Intent(applicationContext,crearPlato::class.java)
            startActivity (actividad)
        }
    }
}
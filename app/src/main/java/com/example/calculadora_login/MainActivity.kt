package com.example.calculadora_login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var editTextNombre: EditText
    lateinit var editTextApellidos: EditText
    lateinit var boton: Button
    lateinit var boton2: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        editTextNombre = findViewById(R.id.editTextNombre)
        editTextApellidos = findViewById(R.id.editTextApellido)
        boton = findViewById(R.id.button)
        boton2 = findViewById(R.id.button2)
        boton.setOnClickListener { entrar()}
        boton2.setOnClickListener { salir() }

    }

   fun entrar() {

        var nombre:String = editTextNombre.text.toString()
        var apellidos:String = editTextApellidos.text.toString()



            val miIntent = Intent (this, MainActivity2::class.java)
            miIntent.putExtra("nombre", nombre)
            miIntent.putExtra("apellido", apellidos)
       startActivity(miIntent)


    }
    fun salir(){

        finish()
    }
}
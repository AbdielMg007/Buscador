package com.mg.buscador

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun buscar(view: View?) {

        val buscador = findViewById<EditText>(R.id.buscador).text.toString()
        val valor: String

        if(buscador == ""){
            Toast.makeText(this, "Ingrese el producto a buscar", Toast.LENGTH_SHORT).show()
        }
        else{
            val precios = productos(buscador)
            valor = precios()

            val pasar = Intent(this, mostrar::class.java)
            pasar.putExtra("buscador", buscador)
            pasar.putExtra("precio", valor)
            startActivity(pasar)
        }
    }

}
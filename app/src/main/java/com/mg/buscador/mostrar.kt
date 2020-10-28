package com.mg.buscador

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_mostrar.*

class mostrar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mostrar)
        var precio = intent.getStringExtra("precio")
        var buscador = intent.getStringExtra("buscador")
        textView2.text = buscador
        textView3.text = precio
    }
}
package com.example.clase3app

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) //Conexión entre el XML y la Clase

        val texto1 =findViewById<EditText>(R.id.textnro1)// esta conectado con el EditText1
        val texto2 =findViewById<EditText>(R.id.textnro2) //
        val boton = findViewById<Button>(R.id.sumar)
        val resultado = findViewById<TextView>(R.id.resultado)

        boton.setOnClickListener{
            val nro1:Int =texto1.text.toString().toInt()
            val nro2: Int =texto2.text.toString().toInt()
            val suma: Int = nro1+nro2
            resultado.text="Resultado: ${suma.toString()}"
        }

    }
}
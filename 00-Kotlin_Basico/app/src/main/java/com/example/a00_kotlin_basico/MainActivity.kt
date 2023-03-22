package com.example.a00_kotlin_basico

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*************************/
        /** Variables en Kotlin **/
        /*************************/
        /*En Kotlin podemos definir valores que no pueden ser modificados*/
        //Ej
        val fecha = "01/03/23"

        /*Tambien podemos crear variables que puedan cambiar su valor*/
        //Ej
        var nombre = "Santiago"

        /* Imprimimos en consola el valor y la variable*/
        println(nombre)
        println(fecha)

    }
}
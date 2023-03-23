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
        /******************************/
        /** Tipos de datos en Kotlin **/
        /******************************/
        /*En el siguiente ejemplo, count es una variable de tipo Int asignada a un valor inicial de 10:*/
        var count: Int = 123

        /*Los strings en Kotlin son tipos de datos que van a contener cadenas de caracteres (texto)*/
        var color1: String = "rojo"

        //Impresion por consola de los tipos de datos
        println(count)
        println(color1)

    }
}
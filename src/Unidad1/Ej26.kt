package com.DAM1.ejerciciosBasicos

object Ej26 {
    fun ejecutar() {
        println("Ejecutando Ej26.kt en Unidad1")
    }
}


/*
Ejercicio 1.2.26
Escribir un programa que pregunte por consola por los productos de una cesta de la compra, separados por comas,
y muestre por pantalla cada uno de los productos en una línea distinta.
*/


fun pedirProducto(): List<String> {
    println("Introduce los productos: ")
    val productos = readLine() ?: ""
    return productos.split(","). map{ it.trim() }
}

fun mostrarProductos(productos: List<String>)  {
    println("Los productos son: ")
    for (productos in productos) {
        println(productos)
    }
}

fun main(){
    val productos = pedirProducto()
    mostrarProductos(productos)
}
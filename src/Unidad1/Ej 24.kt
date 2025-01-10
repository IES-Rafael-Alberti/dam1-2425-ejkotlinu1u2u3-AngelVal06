package com.DAM1.ejerciciosBasicos

object Ej24 {
    fun ejecutar() {
        println("Ejecutando Ej24.kt en Unidad1")
    }
}


/*
Ejercicio 1.2.24
Escribir un programa que pregunte por consola el precio de un producto en euros con dos decimales y
muestre por pantalla el número de euros y el número de céntimos del precio introducido.
 */

fun pedirnumero(msj:String): Double {
    println("$msj")
    val precioStr = readLine()
    try {
        val precio = precioStr?.toDouble() ?: throw IllegalArgumentException("El valor ingresado no es válido.")

        if (precio <=0) {
            println("Error: El precio no puede ser menor o igual a 0.")
            throw IllegalArgumentException("El precio debe ser mayor a 0.")
        }
        return precio
    }
    catch (e: Exception) {
        println("Error: $e")
        throw e
    }
}

fun preciocent(precio: Double): Double {
    return precio * 100
}

fun main() {
    try {
        println("Dime el nombre del producto")
        val nombre = readLine()
        val precio = pedirnumero("Dime el precio del producto: ")
        val precioEnCentimos = preciocent(precio)
        println("El precio en centimos es: $precioEnCentimos centimos")
    } catch (e: Exception) {
        println("El programa finalizó debido a un error.")
    }
}
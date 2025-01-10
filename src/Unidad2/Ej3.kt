package com.DAM1.ejerciciosBasicos.Unidad2

/*
Ejercicio 2.1.3¶
Escribir un programa que pida al usuario dos números y muestre por pantalla su división.
Si el divisor es cero el programa debe mostrar un error.
 */


fun main() {
    try {
        println("Dime el divisor:")
        val divisor = readLine()?.toDoubleOrNull()

        println("Dime el dividendo:")
        val dividendo = readln()?.toDoubleOrNull()

        if (divisor == null || dividendo == null) {
            println("Debes introducir números válidos.")
            return
        }

        if (divisor == 0.0) {
            println("Error no puede ser 0.")
        } else{
            val resultado = divisor / dividendo
            println("El resultado de la división es $resultado.")
        }

    } catch (e: Exception){
        println("Ocurrió un error: ${e.message}")
    }



}

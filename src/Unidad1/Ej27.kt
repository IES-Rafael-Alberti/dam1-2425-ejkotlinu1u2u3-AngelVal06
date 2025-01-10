package com.DAM1.ejerciciosBasicos

object Ej27 {
    fun ejecutar() {
        println("Ejecutando Ej27.kt en Unidad1")
    }
}


/*
Ejercicio 1.2.27
Escribir un programa que pregunte el nombre de un producto, su precio y un número de unidades y muestre por pantalla
una cadena con el nombre del producto seguido de su precio unitario con 6 dígitos enteros y 2 decimales,
el número de unidades con tres dígitos y el coste total con 8 dígitos enteros y 2 decimales.
*/

fun obtenerDatosProducto(): Triple<String, Double, Int> {
    println("Introduce el nombre del producto: ")
    val nombre = readLine() ?: ""

    println("Introduce el precio unitario del producto: ")
    val precio = readLine()?.toDoubleOrNull() ?: 0.0

    println("Introduce el número de unidades: ")
    val unidades = readLine()?.toIntOrNull() ?: 0

    return Triple(nombre, precio, unidades)
}

fun calcularCosteTotal(precio: Double, unidades: Int): Double {
    return precio * unidades
}

fun mostrarProductoFormateado(nombre: String, precio: Double, unidades: Int, costeTotal: Double) {
    println(
        "%s - Precio unitario: %06.2f, Unidades: %03d, Coste total: %08.2f".format(
            nombre, precio, unidades, costeTotal
        )
    )
}

fun main() {
    val (nombre, precio, unidades) = obtenerDatosProducto()

    val costeTotal = calcularCosteTotal(precio, unidades)

    mostrarProductoFormateado(nombre, precio, unidades, costeTotal)

}
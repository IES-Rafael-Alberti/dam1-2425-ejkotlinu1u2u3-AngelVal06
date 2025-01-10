package com.DAM1.ejerciciosBasicos

object Ej25 {
    fun ejecutar() {
        println("Ejecutando Ej25.kt en Unidad1")
    }
}


/*
Ejercicio 1.2.25
Escribir un programa que pregunte al usuario la fecha de su nacimiento en formato dd/mm/aaaa y muestra por pantalla,
el día, el mes y el año. Adaptar el programa anterior para que también funcione cuando el día o el mes se introduzcan
con un solo carácter.
*/


fun procesarFechaDeNacimiento() {
    println("Introduce tu fecha de nacimiento en formato dd/mm/aaaa: ")
    val fecha = readLine()

    if (fecha != null && fecha.isNotBlank()) {
        try {
            val (dia, mes, anio) = validarFecha(fecha)
            mostrarFecha(dia, mes, anio)
        } catch (e: Exception) {println("Error: ${e.message}")}
    } else {
        println("No ingresó una fecha de nacimiento.")
    }

}

fun validarFecha(fecha: String): Triple<Int, Int, Int> {
    val partes = fecha.trim().split("/")
    if (partes.size != 3) {throw IllegalArgumentException("El formato de la fecha debe ser dd/mm/aaaa.")}

    try {
        val dia = partes[0].toInt()
        val mes = partes[1].toInt()
        val anio = partes[2].toInt()

        validarDia(dia)
        validarMes(mes)
        validarAnio(anio)

        return Triple(dia,mes,anio)
    } catch (e: NumberFormatException) {throw IllegalArgumentException("Todos los valores deben ser números enteros.")}
}

fun validarDia(dia: Int) {
    if (dia !in 1..31) throw IllegalArgumentException("El día no debe ser menor a 1 y mayor a 31.")
}

fun validarMes(mes: Int) {
    if (mes !in 1..12) throw IllegalArgumentException("El mes de estar en 1 y 12.")
}


fun validarAnio(anio: Int) {
    if (anio <= 0) throw IllegalArgumentException("El año debe ser mayor que 0.")
}

fun mostrarFecha(dia: Int, mes: Int, anio: Int) {
    println("Fecha ingresada correctamente")
    println("Día: $dia")
    println("Mes: $mes")
    println("Año: $anio")
}

fun main() {
    procesarFechaDeNacimiento()
}
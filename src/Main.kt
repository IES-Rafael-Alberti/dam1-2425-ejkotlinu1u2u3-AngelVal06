package com.DAM1.ejerciciosBasicos

fun main() {
    val unidades = mapOf(
        "Unidad1" to listOf("Ej22", "Ej24", "Ej25", "Ej26", "Ej27")
    )

    println("Menú de unidades:")
    for ((indice, unidad) in unidades.keys.withIndex()) {
        println("${indice + 1}. $unidad")
    }

    print("Selecciona la unidad que deseas explorar (1-${unidades.size}): ")
    val seleccionUnidad = readLine()?.toIntOrNull()

    if (seleccionUnidad != null && seleccionUnidad in 1..unidades.size) {
        val unidadSeleccionada = unidades.keys.elementAt(seleccionUnidad - 1)

        val archivos = unidades[unidadSeleccionada]!!
        println("Archivos disponibles en $unidadSeleccionada:")
        for ((indice, archivo) in archivos.withIndex()) {
            println("${indice + 1}. Ejecutar $archivo.kt")
        }

        print("Selecciona el archivo que deseas ejecutar (1-${archivos.size}): ")
        val seleccionArchivo = readLine()?.toIntOrNull()

        if (seleccionArchivo != null && seleccionArchivo in 1..archivos.size) {
            val archivoSeleccionado = archivos[seleccionArchivo - 1]
            when (archivoSeleccionado) {
                "Ej22" -> Ej22.ejecutar()
                "Ej24" -> Ej24.ejecutar()
                "Ej25" -> Ej25.ejecutar()
                "Ej26" -> Ej26.ejecutar()
                "Ej27" -> Ej27.ejecutar()
                else -> println("Archivo no implementado.")
            }
        } else {
            println("Selección de archivo inválida.")
        }
    } else {
        println("Selección de unidad inválida.")
    }
}

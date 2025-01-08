import kotlin.system.exitProcess

/*
Ejercicio 1.2.22¶
Escribir un programa que pida al usuario que introduzca una frase en la consola y una vocal, y después muestre por pantalla la misma frase
pero con la vocal introducida en mayúscula.
 */

fun pedirfrase(msj:String): String {
    println(" $msj")
    val frase = readln()
    return frase
}

fun pedirvocal(msj:String): String {
    println(" $msj")
    val vocal = readln()
    try {
        if (vocal.lowercase() in listOf("a", "e", "i", "o", "u")) {
            println("La respuesta coincide con las vocales.")

        } else {println("La respuesta no coincide con una vocal.")}
    }
    catch (e: Exception) {
        println("Error: $e")

    }
    return vocal.uppercase()
}

fun main() {
    val frase = pedirfrase("Dime una frase: ")
    val vocal = pedirvocal("Dime una vocal: ")
    println("$frase" + "$vocal")
}
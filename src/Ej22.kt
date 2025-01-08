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
    val frase = readln()
    try {
        if (frase != "a, e, i, o, u") {

        }
    }
    catch (e: Exception) {
        println("Error: $e")
    }
    return frase.uppercase()
}

fun main() {
    pedirfrase("Dime una frase: ")
    pedirvocal("Dime una vocal: ")
}
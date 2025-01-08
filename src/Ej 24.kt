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

fun main() {
    val precio = pedirnumero("Dime el precio del producto: ")
}
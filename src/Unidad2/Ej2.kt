package com.DAM1.ejerciciosBasicos.Unidad2

/*
Ejercicio 2.1.2¶
Escribir un programa que almacene la cadena de caracteres contraseña en una variable, pregunte al usuario por la contraseña
e imprima por pantalla si la contraseña introducida por el usuario coincide con la guardada en la variable
sin tener en cuenta mayúsculas y minúsculas.
 */


fun main() {
    val contraseña = "contraseña"

    println("Dime cual es la contraseña: ")
    val respuesta = readln().lowercase()

    if (respuesta == contraseña) {
        println("La contraseña es correcta.")
    } else {println("La contraseña es incorrecta.")}



}
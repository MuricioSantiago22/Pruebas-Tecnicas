package com.example.pruebastecnicas

fun main() {
    var nuncaNulo: String = "¡Kotlin es tremendo!"

    println(nuncaNulo)

    println()
    //nuncaNulo = null// Produce error: no se permite asignar null a una variable String que no admite
    //valores nulos

    var nuloPosible: String? = "Kotlin es un lenguaje de programación"
    println(nuloPosible)

    println()

    nuloPosible = null

    println(nuloPosible)

    println()

    //var otraVariable: String = null// No es posible esta asignacion de null (la variable
    // no permite valores nulos).
}
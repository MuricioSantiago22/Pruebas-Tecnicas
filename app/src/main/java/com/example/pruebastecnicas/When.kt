package com.example.pruebastecnicas

//Demostrar el uso basico de la sentencia de casos when.

/*fun seleccionCaso(objeto :Any){
    when(objeto){
        1 -> println("Uno")
        "Kotlin" -> println("Lenguaje de programacion Kotlin")
        is Long -> println("Entero de 64 bits")
        !is String -> println("No es una cadena de caracteres(String")
        else -> println("Desconocido")
    }
}

class MiClase
fun main(){
    seleccionCaso("Kotlin")
    seleccionCaso(123456L)
    seleccionCaso(1.0)
    seleccionCaso(MiClase())
}*/

//Crear una expresión con la sentencia when para retornar un valor desde una función.
fun asignar(objeto: Any): Any{
    val resultado = when (objeto){
        1 -> " Uno"
        "Kotlin" -> 11
        is Long -> 10L
        else -> false
    }

    return resultado
}
 class MiClase

fun main() {
    println(asignar(20L))  //10

    println(asignar("kotlin")) //false

    println(asignar("Kotlin")) // 11

    println(asignar(MiClase())) // false

}






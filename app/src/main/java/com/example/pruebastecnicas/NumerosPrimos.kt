package com.example.pruebastecnicas

/* //Mostrar si un numero es primo

fun main(arg: Array<String>) {
    var NumPrimo: Int?
    var Cont = 0
    var Lim = 0

    println("Por favor, ingrese el número a evaluar:   ")
    NumPrimo = readLine()?.toIntOrNull()

    println()
    println("Numero ingresado:\t$NumPrimo")
    print("$NumPrimo es divisible por :\t")
    (1..NumPrimo!!).forEach { div ->
        if (NumPrimo % div == 0) {
            print("$div - ")
            Cont++
            Lim++
            if (Lim == 10) {
                print("\n\t\t\t")
                Lim = 0
            }
        }
    }
    println("Fin!!")

    when (Cont) {
        2 -> println("Si es un numero primo, tiene $Cont divisores")
        else -> println(
            "No es un numero primo, tiene $Cont divisores"
        )
    }
}


//Obtener y mostrar todos los numeros primos existentes entre dos numeros enteros


fun main(args: Array<String>) {
    var menor = 20 // observa la diferencia  entre var y val
    val mayor = 50
    print("Numeros primos entre $menor y $mayor :")
    while (menor < mayor){  // bucle para revisar el intervalo entre los numeros
        if (checkPrimo(menor)) //  evalua el retorno de la funcion  con cada valor
            print(menor.toString() + " ")
        ++menor // actualiza el valor
    }


}

fun checkPrimo(num:Int): Boolean { // funcion que retorna un booleano

    var primo = true
    for (i in 2..num/ 2){ // bucle sobre un rango
        if(num % i == 0) {// no es numero primo
            primo = false
            break // sale del bucle
        }
    }
    return primo // true o false
}*/

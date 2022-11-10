package com.example.pruebastecnicas

import java.util.*

/*class Computador(var id : Int, var marca: String, var cpu: String, var ram:Int, var ssd:Int)

fun main() {
    var computadorGamer:Computador
    computadorGamer= Computador(1001, "MSi", "Intel Core i7", 32, 720)

    println(computadorGamer.id)
    println(computadorGamer.marca)
    println(computadorGamer.cpu)
    println(computadorGamer.ram)
    println(computadorGamer.ssd)
}

//Clases Mutables

class Cliente(val id : Int, val nombre : String, var email: String, var fechaNacimiento: Date, var direccion:String)

fun main() {
     var julio =Cliente(2001, "Julio Perez", "julio@outlook.com", Date(1983,5, 23), "Carrera 110")

    println(julio.id)

    println()

    //julio.id = 2002 // No se puede cambiar el valor de la propiedad id

    println(julio.email)

    println()

    julio.email = "julio@gmail.com"

    println(julio.email)
}

class Computador(var id: Int, var marca:String, var cpu: String,  var ram : Int, var ssd: Int){
    override fun toString()= "ID: $id - Marca. $marca -CPU: $cpu -RAM : $ram - SSD: $ssd"
}

fun main() {
    var computadorGamer = Computador(1001, "MSi", "Intel Core i7", 32, 720)


    // Antes:
    //ejercicio029.Computador@28d93b30

    println(computadorGamer)

    //Despues:
}

//Jerarquia de Herencia con la palabra open

open  class  Vehiculo{
    open fun iniciar(){
        println("El vehiculo se ha iniciado.")

    }
}

class Bicicleta: Vehiculo(){
    override fun iniciar() {
        super.iniciar()

        println("La bicicleta se ha iniciado.")
    }
}

fun main() {
    val bicicletaRoja: Vehiculo = Bicicleta()

    bicicletaRoja.iniciar()
}


//Jerarquia de Herencia


 open class Vehiculo(val color: String){
     fun iniciar(){
         println("El vehiculo se ha iniciado.")
     }
 }

 class Bicicleta :Vehiculo("Negro"){
     fun parquear(){
         println("la bicicleta se esta parqueando.")

     }
 }

fun main() {
    val bicicletaNegra: Vehiculo = Bicicleta()
    bicicletaNegra.iniciar()
    println()

    (bicicletaNegra as Bicicleta).parquear()

    println()

    println(bicicletaNegra.color)
}

//Pasar argumento al constructor de una superclase de una jerarquia de herencia.

open class Vehiculo(val identificador: String, val color :String, val costo : Double ){
    fun iniciar(){
        println("Identificador: $identificador-Color: $color-Costo: $costo")
    }
}

class Bicicleta(  identificador: String, color: String, costo: Double, val esMontañera: Boolean): Vehiculo(identificador,color, costo)

fun main() {
    val bicicletaMontañera: Bicicleta = Bicicleta("1223456", "Negra", 100000.0, true)

    println(bicicletaMontañera.identificador)
    println(bicicletaMontañera.color)
    println(bicicletaMontañera.costo)
    println(bicicletaMontañera.esMontañera)
}*/

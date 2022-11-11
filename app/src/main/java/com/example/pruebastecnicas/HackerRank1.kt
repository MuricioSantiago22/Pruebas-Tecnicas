package com.example.pruebastecnicas

fun compareTriplets(a: Array<Int>, b: Array<Int>) {
    if(a==b){
        var result = true
    }
}

fun main(args: Array<String>) {

    val a = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val b = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    var result = compareTriplets(a, b)

    println(result.toString())
}
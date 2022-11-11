package com.example.pruebastecnicas

fun compareTriplets(a: Array<Int>, b: Array<Int>): Array<Int> {
    var scoreA = 0
    var scoreB = 0

    val ArrSize = a.size - 1

    for (item in 0..ArrSize) {

        if (a[item] > b[item])
            scoreA += 1

        if (a[item] < b[item])
            scoreB += 1
    }

    return arrayOf(scoreA, scoreB)
}


fun main(args: Array<String>) {

    val a = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val b = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val result = compareTriplets(a, b)

    println(result.toString())
}


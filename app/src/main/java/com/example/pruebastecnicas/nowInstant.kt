package com.example.pruebastecnicas

// Obtener la hora actual con el metodo now() de la clase Instant.

import android.os.Build
import androidx.annotation.RequiresApi
import java.time.Instant
import java.time.ZoneId

@RequiresApi(Build.VERSION_CODES.O)
fun main() {
    val horaActual = Instant.now()

    println(horaActual)

    println()

    val poloSur = horaActual.atZone(ZoneId.of("Antantirca/South_Pole"))
    println(poloSur)
}
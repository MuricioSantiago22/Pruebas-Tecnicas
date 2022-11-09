package com.example.pruebastecnicas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pruebastecnicas.databinding.ActivityMainBinding
import java.util.*
import kotlin.collections.HashMap


/*
En el ejemplo siguiente se muestran dos listas, la primera simula una lista que se obtiene de un servidor, la segunda una lista de datos que se obtiene de manera local.

Ambas listas son de objetos con dos propiedades (id, date)

Se debe completar el método "getStatusUpdate()" para poder obtener un objeto HashMap<String, Boolean> que contenga los elementos que cambiaron.

Los ids que tienen una fecha más reciente en la lista del servidor, deben devolver valor "true" en la parte booleana del elemento.

Los id que esten en la lista local pero no en la lista del servidor deberán devolver un valor "false".

Los ids que se encuentran iguales no deben regresar en el objeto HashMap






class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private var serverList: List<ObjectUpdate> = listOf(
        ObjectUpdate("1", Date(2022, 4, 1)),
        ObjectUpdate("2", Date(2022, 4, 1)),
        ObjectUpdate("3", Date(2022, 4, 3)),
        ObjectUpdate("5", Date(2022, 4, 5)),
        ObjectUpdate("6", Date(2022, 4, 8)),
        ObjectUpdate("9", Date(2022, 4, 2))
    )

    private var localList: List<ObjectUpdate> = listOf(
        ObjectUpdate("1", Date(2022, 3, 1)),
        ObjectUpdate("2", Date(2022, 3, 1)),
        ObjectUpdate("4", Date(2022, 2, 3)),
        ObjectUpdate("5", Date(2022, 3, 5)),
        ObjectUpdate("6", Date(2022, 4, 8)),
        ObjectUpdate("7", Date(2022, 2, 12))
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        getStatusUpdate(serverList, localList)
    }

    private fun getStatusUpdate(serverList: List<ObjectUpdate>, localList: List<ObjectUpdate>): HashMap<String, Boolean>{
        val result = HashMap<String, Boolean>()
        val localIdList = mutableListOf<Int>()
        val serverIdList = mutableListOf<Int>()

        for (localElement in localList) {
            localIdList.add(localElement.id.toInt())
        }

        for (serverElement in serverList) {
            serverIdList.add(serverElement.id.toInt())
        }

        localList.forEachIndexed { index, localObject ->
            if (serverIdList.contains(localObject.id.toInt())){
                if (localObject.date.before(serverList[index].date))
                    result.put(localObject.id, true)
            }
            else {
                result.put(localObject.id, false)
            }
        }

        serverList.forEachIndexed { index, serverObject ->
            if (!localIdList.contains(serverObject.id.toInt())){
                result.put(serverObject.id, true)
            }
        }

        return result
    }

    data class ObjectUpdate(var id: String, var date: Date)
}*/
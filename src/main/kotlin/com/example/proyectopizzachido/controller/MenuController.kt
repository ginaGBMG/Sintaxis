/*
package com.example.proyectopizzachido.controller


import com.example.proyectopizzachido.models.database.ConcentradoEntity
import com.example.proyectopizzachido.repositories.ConcentradoRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@CrossOrigin
@RestController

@RequestMapping("Pizza_Menu")

class MenuController {
    @Autowired
    lateinit var  concentradoRepository: ConcentradoRepository

    @GetMapping("/sabores_pizzas", produces = ["application/json"])
    fun getSaboresPizzas(): List<ConcentradoEntity>{

        val listaMasVendidos: Collection<ConcentradoEntity> = listOf(
                ConcentradoEntity("p01", "PEPERONI"),
                ConcentradoEntity("p02", "HAWAII"),
                ConcentradoEntity("p03", "QUESO"),
                ConcentradoEntity("p04", "CHORIZO"),
                ConcentradoEntity("p05", "MEXICANA"),
                ConcentradoEntity("p06", "CARNE"),
                ConcentradoEntity("p07", "HONGO"),
                ConcentradoEntity("p08", "MARISCO"),
                ConcentradoEntity("p09", "JAMON"),
                ConcentradoEntity("p10", "ATUN"),
        ) as MutableList<ConcentradoEntity>

        val listaSabores = concentradoRepository.findSabores()
        listaMasVendidos.forEach {
            listaSabores.add(0, it)
        }
        return listaSabores.distinct()
    }

    @GetMapping("/tamaños_Pizza", produces = ["application/json; charset=UTF-8"])
    fun getTamanos(@RequestParam sabor: String) : ResponseEntity<Any?>
    {
        val listaSabores = concentradoRepository.findTamaños(sabor)
        return  ResponseEntity(listaSabores, HttpStatus.OK)
    }

    @RequestMapping("/contimentos_pizzas", produces = ["application/json; charset=UTF-8"])
    fun getContPizzas(
            @RequestParam sabor: String,
            @RequestParam tamaño: String
    ): ResponseEntity<Any> {
        var i = 1
        var resp = concentradoRepository.findContPizzas(sabor, tamaño)
        return ResponseEntity(resp, HttpStatus.OK)
    }

    @RequestMapping("/Ingredientes_Pizzas", produces = ["application/json; charset=UTF-8"])
    fun getIngredientes(
            @RequestParam sabor: String,
            @RequestParam tamaño: String,
            @RequestParam contpizzas: String
    ): ResponseEntity<Any> {

        var i = 1
        var resp = concentradoRepository.findIngredientes(sabor, tamaño,contpizzas)
        return ResponseEntity(resp, HttpStatus.OK)

    }
}*/

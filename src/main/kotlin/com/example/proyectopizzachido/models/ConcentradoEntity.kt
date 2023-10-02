package com.example.proyectopizzachido.models.database

import jakarta.persistence.*

//comentarios

/*
* notas
*/

@Entity
@Table(name = "Concentrado", schema = "DBPIZZA_ATLAS")
data class ConcentradoEntity (
        @Column(name = "id")
        @Id
        var id : String = "",

        @Column(name = "text")
        var text: String? = "",

        @Column(name = "colores")
        var sabor : String = "",

        @Column(name = "tamaño")
        var tamaño: String? = "",

        @Column(name = "ingredientes")
        var ingredientes: String? = "",

       )


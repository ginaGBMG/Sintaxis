package com.example.proyectopizzachido.repositories

import com.example.proyectopizzachido.models.database.ConcentradoEntity
import org.springframework.data.jpa.repository.JpaRepository

interface ConcentradoRepository: JpaRepository<ConcentradoEntity, Long> {
//    @Query("SELECT CONCAT('m',ROW_NUMBER()Over(ORDER BY S.Sabores asc)) as id , TRIM(S.Sabores) as text from Concentrado C join Sabor S on C.idSabor = S.id JOIN ContPizzas CP ON C.idContPizzas = S.id WHERE S.Sabor  NOT IN ( 'ATUN', 'QUESO' ) AND S.idTipo = 1  GROUP BY M.Marca ORDER BY M.Marca", nativeQuery = true)
//    fun findSabores(): MutableList<ConcentradoEntity>
//
//    @Query("SELECT CONCAT('o',ROW_NUMBER()Over(ORDER BY Tm.Tamaños asc)) as id , Tm.Tamaños as text from Concentrado C join Sabor S on C.idSabor = S.id  join Tamaño Tm on C.idTamaño = Tm.id WHERE S.SABOR =:sabor GROUP BY Tm.Tamaños ORDER BY Tm.Tamaño desc ", nativeQuery = true)
//    fun findTamaños(@Param("sabores") sabores : String ) : MutableList<ConcentradoEntity>
//
//    @Query("SELECT CONCAT('s',ROW_NUMBER()Over(ORDER BY CP.ContPizzas asc)) as id , CP.ContPizzas as text from Concentrado C join Sabor S on C.idSabor = S.id join ContPizzas CP on C.idContPizzas = S.i" +
//            "d join Modelos Md on C.idModelo = Md.id WHERE M.MARCA = :marca and  Md.Modelo = :modelo AND S.idTipo = 1  GROUP BY CP.ContPizzas, CONCAT('s',ROW_NUMBER()Over(ORDER BY CP.ContPizzas asc)) ORDER BY CP.ContPizzas ", nativeQuery =  true)
//    fun findContPizzas(@Param("sabores") sabores: String, @Param("tamaño") tamaño: String ): MutableList<ConcentradoEntity>
//
//    @Query("SELECT DISTINCT Clv.Clave  as id, I.Ingredientes  as text from Concentrado C join Marcas M on C.idMarca = M.id join ContPizzas CP on C.idContPizza = S.id Join  S on C.idTamaño = Tm.id join Claves Clv on C.idClave = Clv.id join Descripciones D on C.idDescripcion = D.id join Sucursales on C.idSucursales = A.id WHERE S.SABOR = :sabor and  Tm.Tamaño = :tamaño and CP.ContPizzas =:contpizzas", nativeQuery =  true)
//    fun findIngredientes(@Param("sabores") sabores: String, @Param("tamaño") tamaño: String, @Param("contpizzas") contpizzas: String) : MutableList<ConcentradoEntity>
}
package com.example.karinaproject.data.data.model


//Criei essa classe igual ao Entity pq não quero que minha camada de apresentação tenha acesso a nada que é ligado
//diretamente ao banco de dados


data class Produto (
    private val id :Long,
    private val nome:String,
    private val valor:Double,
    private val qtd :Int
)

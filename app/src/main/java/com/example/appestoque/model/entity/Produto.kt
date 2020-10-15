package com.example.appestoque.model.entity

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize


//Criei essa classe igual ao Entity pq não quero que minha camada de apresentação tenha acesso a nada que é ligado
//diretamente ao banco de dados


@Parcelize
data class Produto (
    val nomeProduto:String,
    val valorProduto:Double,
    val qtdProduto :Int,
    val id: Long? = null
): Parcelable
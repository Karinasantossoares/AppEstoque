package com.example.karinaproject.`object`

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Produto (val nomeProduto :String , val valorProduto :Double , val qtdProduto:Int) :Parcelable{

}
package com.example.karinaproject.`object`

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class Empresa (val nome :String, val endereco :String, val listaProduto :List<Produto> = listOf()):Parcelable
package com.example.appestoque.model.entityDb

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class ProdutoEntity(
    @PrimaryKey(autoGenerate = true) var uid: Long? = null,
    @ColumnInfo var nomeProdutoEntity: String?= null,
    @ColumnInfo var valorProdutoEntity: Double? = null,
    @ColumnInfo var qtdProdutoEntity: Int? = null
)
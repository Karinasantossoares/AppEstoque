package com.example.appestoque.model.entityDb

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class EmpresaEntity(
    @PrimaryKey(autoGenerate = true)
    var uid: Long? = null,
    @ColumnInfo var nomeEmpresaEntity: String? = null,
    @ColumnInfo var enderecoEmpresaEntity: String? = null,
    @ColumnInfo var telefoneEmpresaEntity: String? = null
)
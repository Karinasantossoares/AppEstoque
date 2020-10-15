package com.example.appestoque.model.dao

import androidx.room.*
import com.example.appestoque.model.entityDb.EmpresaEntity

@Dao
interface EmpresaDao {


    //Obtenha uma lista do tipo EmpresaEntity
    @Query("SELECT * FROM empresaentity")
    fun getAll() :List<EmpresaEntity>

    @Insert
    //Insira algo do tipo EmpresaEntity
    fun insert(empresa : EmpresaEntity)

    @Delete
    //Apague algo do tipo EmpresaEntity
    fun delete (empresa: EmpresaEntity)

    @Update
    //Atualize algo do tipo Empresa
    fun update(empresa: EmpresaEntity)
}
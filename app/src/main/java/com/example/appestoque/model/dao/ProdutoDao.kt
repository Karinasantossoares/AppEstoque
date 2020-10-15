package com.example.appestoque.model.dao

import androidx.room.*
import com.example.appestoque.model.entity.Produto
import com.example.appestoque.model.entityDb.ProdutoEntity

@Dao
interface ProdutoDao {
    @Query("SELECT * FROM produtoentity")
    fun getAll(): List<ProdutoEntity>

    @Insert
    fun insert(produto: ProdutoEntity)

    @Delete
    fun delete(produto: ProdutoEntity)

    @Update
    fun update(produto: ProdutoEntity)


}
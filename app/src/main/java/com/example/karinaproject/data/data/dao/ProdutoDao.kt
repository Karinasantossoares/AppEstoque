package com.example.karinaproject.data.data.dao

import androidx.room.*
import com.example.karinaproject.data.data.db.ProdutoEntity

@Dao
interface ProdutoDao {
    @Insert(onConflict= OnConflictStrategy.REPLACE)
    fun save(produto : ProdutoEntity)

    @Query("SELECT * FROM  produto WHERE id  = :id")
    fun getUser(id:Long) : ProdutoEntity


    @Delete
    fun delete(produto: ProdutoEntity)


}
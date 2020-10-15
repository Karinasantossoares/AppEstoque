package com.example.appestoque.model.bd

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.appestoque.model.dao.EmpresaDao
import com.example.appestoque.model.dao.ProdutoDao
import com.example.appestoque.model.entity.Empresa
import com.example.appestoque.model.entityDb.EmpresaEntity
import com.example.appestoque.model.entityDb.ProdutoEntity


@Database(entities = arrayOf(ProdutoEntity::class, EmpresaEntity::class), version = 2)
abstract class AppDatabase : RoomDatabase() {

    abstract fun produtoDao(): ProdutoDao // me retorna a tabelaDao
    abstract fun empresaDao():EmpresaDao

    companion object {
        private var INSTANCE: AppDatabase? = null

        fun getDatabase(context: Context): AppDatabase? {
            if (INSTANCE == null) {
                INSTANCE = Room.databaseBuilder(
                    context,
                    AppDatabase::class.java, "ESTOQUE"
                ).allowMainThreadQueries().build()
            }
            return INSTANCE
        }
    }
}


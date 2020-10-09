package com.example.karinaproject.data.data.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.karinaproject.data.data.dao.ProdutoDao
import kotlinx.coroutines.InternalCoroutinesApi
import kotlinx.coroutines.internal.synchronized
@Database(entities = [ProdutoEntity::class], version = 1)
abstract class AppDataBase : RoomDatabase() {

    abstract fun produtoDao() :ProdutoDao

    companion object {
        @Volatile
        private var INSTANCE: AppDataBase? = null

        @InternalCoroutinesApi
        fun getDatbase(context: Context): AppDataBase {
            val tempInstance = INSTANCE
            if (tempInstance != null) {
                return tempInstance
            }
            synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    AppDataBase::class.java,
                    "app_database"
                ).build()
                INSTANCE = instance
                return instance
            }


        }
    }


}
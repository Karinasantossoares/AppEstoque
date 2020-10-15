package com.example.appestoque.controller

import android.content.Context
import com.example.appestoque.model.bd.AppDatabase
import com.example.appestoque.model.dao.EmpresaDao
import com.example.appestoque.model.entity.Empresa
import com.example.appestoque.model.entityDb.EmpresaEntity
import java.util.concurrent.Executors


//Classe que vai setar meu Database e ela vai gerenciar o relacionamento da Activity com o banco.

class EmpresaController(context: Context) {

    val tableEmpresa : EmpresaDao? = AppDatabase.getDatabase(context)?.empresaDao()

    /*Esse método está convertendo os atributos de Empresa onde o usuario digita
     e passando para EmpresaEntity para que o banco de dados tenha acesso */
    fun insertEmpresa(empresa :Empresa){
        val empresaEntity = EmpresaEntity(
            nomeEmpresaEntity = empresa.nomeEmpresa,
            enderecoEmpresaEntity = empresa.enderecoEmpresa,
            telefoneEmpresaEntity = empresa.telefoneEmpresa

        )

        Executors.newSingleThreadExecutor().execute {
            tableEmpresa?.insert(empresaEntity)
        }
    }

    fun listAllEmpresa(): List<Empresa>? {
        return tableEmpresa?.getAll()?.map {
            val nomeEmpresa = it.nomeEmpresaEntity
            val enderecoEmpresa = it.enderecoEmpresaEntity
            val telefoneEmpresa = it.telefoneEmpresaEntity
            return@map Empresa(nomeEmpresa.toString(),enderecoEmpresa.toString(),telefoneEmpresa.toString())
        }


        }

    }


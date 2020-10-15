package com.example.appestoque.controller

import android.content.Context
import com.example.appestoque.model.bd.AppDatabase
import com.example.appestoque.model.entity.Produto
import com.example.appestoque.model.entityDb.ProdutoEntity
import java.util.concurrent.Executors

class ProductController(context: Context) {
    private val tableProduto = AppDatabase.getDatabase(context)?.produtoDao()

    fun insertProduct(produto: Produto) {
        val produtoEntity = ProdutoEntity(
            nomeProdutoEntity = produto.nomeProduto,
            valorProdutoEntity = produto.valorProduto,
            qtdProdutoEntity = produto.qtdProduto
        )

        //Iniciado uma nova thread pois não podemos fazer operações com dados na MainThread (Thread com os componentes visuais)
        Executors.newSingleThreadExecutor().execute {
            tableProduto?.insert(produtoEntity)
        }
    }

    fun editarProduto(produto: Produto) {
        val produtoEntity = ProdutoEntity(
            uid = produto.id,
            nomeProdutoEntity = produto.nomeProduto,
            valorProdutoEntity = produto.valorProduto,
            qtdProdutoEntity = produto.qtdProduto
        )
        Executors.newSingleThreadExecutor().execute {
            tableProduto?.update(produtoEntity)
        }
    }

    fun listAll(): List<Produto>? {
        return tableProduto?.getAll()?.map {
            val valorProduto = it.valorProdutoEntity ?: 0.0
            val qtdProduto = it.qtdProdutoEntity ?: 0

            return@map Produto(it.nomeProdutoEntity.toString(), valorProduto, qtdProduto, it.uid)
        }
    }
}
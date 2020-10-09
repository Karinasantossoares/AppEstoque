package com.example.karinaproject.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.karinaproject.R
import kotlinx.android.synthetic.main.activity_cadastrar_produto.*

class CadastrarProdutoAtivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastrar_produto)


        btn_cadastrar.setOnClickListener {
            val nomeProduto = et_cadastro_nome_produto.toString()
            val valorProduto = et_cadastro_valor_produto.toString()
            val qtdProduto = et_cadastro_qtd_produto.toString()
            val produtoCadastrados = Produto(1, nomeProduto, valorProduto.toDouble(), qtdProduto.toInt())
            AppDatabase.INSTANCE?.produtoDao()?.insertAll(produtoCadastrados)

        }
    }
}
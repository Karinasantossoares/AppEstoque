package com.example.appestoque.view.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.appestoque.R
import com.example.appestoque.controller.ProductController
import com.example.appestoque.view.adapter.ProdutoAdapter
import kotlinx.android.synthetic.main.activity_lista_de_produtos.*

class ListaDeProdutoActivity : AppCompatActivity() {
    private val controller by lazy {
        ProductController(this)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_de_produtos)
    }

    override fun onResume() {
        super.onResume()
        controller.listAll()?.let {
            rv_lista_de_produtos.adapter = ProdutoAdapter(it) {
                startActivity(Intent(this, CadastrarProdutoAtivity::class.java).apply {
                    this.putExtra(CadastrarProdutoAtivity.EXTRA_PRODUTO, it  )
                })
            }
        }
    }
}
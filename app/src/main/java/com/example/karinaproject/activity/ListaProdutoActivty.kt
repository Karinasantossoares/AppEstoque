package com.example.karinaproject.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.karinaproject.R
import com.example.karinaproject.`object`.Produto
import com.example.karinaproject.adapter.ProdutoAdapter
import kotlinx.android.synthetic.main.activity_lista_empresa.*
import kotlinx.android.synthetic.main.activity_lista_produto.*
import kotlinx.android.synthetic.main.item_lista_produto.*

class ListaProdutoActivty : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_produto)



        val extras = intent.extras
        extras?.getParcelableArrayList<Produto>(EXTRA_PRODUTO)?.let{produtos->
            rv_recycler_produto.adapter = ProdutoAdapter(produtos.toList()){
                val intent = Intent(this,DetalheProdutoActivity::class.java).apply{
                    this.putExtra(DetalheProdutoActivity.EXTRA_DETALHE , it )
                }
                startActivity(intent)


            }

        }


    }

    companion object {
        val EXTRA_EMPRESA = "EXTRA_EMPRESA"
        val EXTRA_PRODUTO = "EXTRA-PRODUTO"
    }

}
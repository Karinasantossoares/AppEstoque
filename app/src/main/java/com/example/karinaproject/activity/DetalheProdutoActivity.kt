package com.example.karinaproject.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.karinaproject.R
import com.example.karinaproject.`object`.Empresa
import com.example.karinaproject.`object`.Produto
import com.example.karinaproject.activity.ListaProdutoActivty.Companion.EXTRA_PRODUTO
import com.example.karinaproject.adapter.ProdutoAdapter
import kotlinx.android.synthetic.main.activity_detalhe_produto.*
import kotlinx.android.synthetic.main.activity_lista_produto.*

class DetalheProdutoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalhe_produto)

       val extras= intent.extras
       extras?.getParcelable<Produto>(EXTRA_DETALHE)?.let {
           tv_detalhe1.text = it.nomeProduto
           tv_detalhe2.text= it.valorProduto.toString()
           tv_detalhe3.text=it.qtdProduto.toString()


        }




    }




    companion object{
       val EXTRA_DETALHE = "EXTRA_DETALHE"
    }
}
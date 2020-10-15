package com.example.appestoque.view.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.appestoque.R
import com.example.appestoque.controller.ProductController
import com.example.appestoque.model.entity.Produto
import kotlinx.android.synthetic.main.activity_cadastrar_produto.*

class CadastrarProdutoAtivity : AppCompatActivity() {

    private val produtoController by lazy {
        ProductController(this)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastrar_produto)

        val produtoExtra = intent.extras?.getParcelable<Produto>(EXTRA_PRODUTO)
        if(produtoExtra == null){
            btn_cadastrar.setOnClickListener {
                produtoController.insertProduct(pegarPrdutoDosCampos())
                showAlert(getString(R.string.message_success))
            }
        }else{
            et_cadastrar_nome_produto.setText(produtoExtra.nomeProduto)
            et_valor_produto.setText(produtoExtra.valorProduto.toString())
            et_qtd_produto.setText(produtoExtra.qtdProduto.toString())
            btn_cadastrar.text = getString(R.string.editar)
            btn_cadastrar.setOnClickListener {
                produtoController.editarProduto(pegarPrdutoDosCampos(produtoExtra.id))
                showAlert(getString(R.string.edit_succsses))
            }
        }



    }

    private fun pegarPrdutoDosCampos(id: Long? = null):Produto{
        val nomeProduto = et_cadastrar_nome_produto.text.toString()
        val valorProduto = et_valor_produto.text.toString().toDouble()
        val qtdProduto = et_qtd_produto.text.toString().toInt()
        return Produto(nomeProduto, valorProduto, qtdProduto, id)
    }

    private fun showAlert(mensagem: String) {
        Toast.makeText(this, mensagem, Toast.LENGTH_SHORT).show()
    }

    companion object{
        const val EXTRA_PRODUTO = "EXTRA_PRODUTO"
    }

}
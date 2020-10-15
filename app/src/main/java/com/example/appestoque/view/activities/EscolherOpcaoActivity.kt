package com.example.appestoque.view.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.appestoque.R
import kotlinx.android.synthetic.main.activity_escolher_opcao.*

class EscolherOpcaoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_escolher_opcao)

        btn_cadastrar_produto.setOnClickListener {
            val intent = Intent(this, CadastrarProdutoAtivity::class.java)
            startActivity(intent)
        }

        btn_cadastrar_empresa.setOnClickListener {
            val intent = Intent(this, CadastrarEmpresaActivity::class.java)
            startActivity(intent)
        }

        btn_lista_produto.setOnClickListener {
            val intent = Intent(this, ListaDeProdutoActivity::class.java)
            startActivity(intent)
        }


    }


}

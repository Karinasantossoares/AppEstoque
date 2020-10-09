package com.example.karinaproject.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.karinaproject.R
import kotlinx.android.synthetic.main.activity_escolher_opcao.*

class EscolherOpcaoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_escolher_opcao)

        btn_cadastrar_produto.setOnClickListener{
            val intent = Intent(this, CadastrarProdutoAtivity::class.java)
            startActivity(intent)
        }

        btn_cadastrar_empresa.setOnClickListener{
            val intent = Intent(this, CadastrarEmpresaActivity::class.java)
            startActivity(intent)
        }

        btn_visualizar_produto.setOnClickListener{
            val intent = Intent(this,Detalhe_produto::class.java)
            startActivity(intent)
        }


    }
}
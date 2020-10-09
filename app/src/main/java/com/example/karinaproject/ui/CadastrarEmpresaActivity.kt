package com.example.karinaproject.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.karinaproject.R
import kotlinx.android.synthetic.main.activity_cadastrar_empresa.*

class CadastrarEmpresaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastrar_empresa)

        btn_cadastrar_dados_empresa.setOnClickListener{
            val nomeEmpresa = et_nome_empresa.text.toString()
            val enderecoEmpresa = et_endereço_empresa.text.toString()
            val telefoneEmpresa = et_telefone_empresa.text.toString()
            val empresa = Empresa(1, nomeEmpresa,enderecoEmpresa,telefoneEmpresa)
            AppDatabase.INSTANCE?.empresaDao()?.insertAll(empresa)
        }


    }
}
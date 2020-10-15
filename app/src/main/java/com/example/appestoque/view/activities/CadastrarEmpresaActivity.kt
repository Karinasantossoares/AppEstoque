package com.example.appestoque.view.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.appestoque.R
import com.example.appestoque.controller.EmpresaController
import com.example.appestoque.model.entity.Empresa
import kotlinx.android.synthetic.main.activity_cadastrar_empresa.*


class CadastrarEmpresaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastrar_empresa)

        val empresaController by lazy {
            EmpresaController(this)
        }

        btn_cadastrar_dados_empresa.setOnClickListener {
            val nomeEmpresa = et_cadastrar_nome_empresa.text.toString()
            val enderecoEmpresa = et_endereco_empresa.text.toString()
            val telefoneEmpresa = et_telefone_empresa.text.toString()
            val empresa = Empresa(nomeEmpresa, enderecoEmpresa, telefoneEmpresa)
            empresaController.insertEmpresa(empresa)
            showAlertEmpresa("Empresa cadastrada")

        }
    }

   private fun showAlertEmpresa(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}

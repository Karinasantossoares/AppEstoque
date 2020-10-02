package com.example.karinaproject.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.karinaproject.*
import com.example.karinaproject.`object`.Empresa
import com.example.karinaproject.`object`.Produto
import com.example.karinaproject.adapter.EmpresaAdapter
import kotlinx.android.synthetic.main.activity_lista_empresa.*

class ListaEmpresaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_empresa)


        val listProduto = listOf(
            Produto("Arroz", 22.00, 200),
            Produto("feijao", 12.00, 50),
            Produto("macarrao", 5.00, 25)
        )
        val listProduto2 = listOf(Produto("Arroz", 22.00, 200))

        val list: List<Empresa> = listOf(
            Empresa("LTDA - Dia-a-Dia", "Quadra 35-Gama", listProduto),
            Empresa("Tatico", "Gama", listProduto2)
        )



        rv_recycler_empresa.adapter = EmpresaAdapter(list) {
            val intent = Intent(this, ListaProdutoActivty::class.java).apply {
                this.putParcelableArrayListExtra(ListaProdutoActivty.EXTRA_PRODUTO, ArrayList(it.listaProduto))
            }
            startActivity(intent)
        }
    }
}




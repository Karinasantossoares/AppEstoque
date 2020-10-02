package com.example.karinaproject.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.karinaproject.`object`.Empresa
import com.example.karinaproject.R
import com.example.karinaproject.`object`.Produto
import kotlinx.android.synthetic.main.item_lista_empresa.view.*
import kotlinx.android.synthetic.main.item_lista_produto.view.*

class ProdutoAdapter (val listaInformacao: List<Produto>, val eventClick :(produto : Produto)->Unit) : RecyclerView.Adapter<ProdutoAdapter.ViewHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view : View = LayoutInflater.from(parent.context).inflate(R.layout.item_lista_produto,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val produto : Produto = listaInformacao[position]
        holder.criar(produto)
    }


    override fun getItemCount(): Int {
       return listaInformacao.size
    }

 inner class ViewHolder(itemView :View) : RecyclerView.ViewHolder(itemView){
    fun criar(produto: Produto){
        itemView.tv_nome_produto.text = produto.nomeProduto
        itemView.tv_valor_produto.text = produto.valorProduto.toString()
        itemView.tv_qtd_produto.text = produto.nomeProduto



        itemView.setOnClickListener{
            eventClick(produto)
        }

    }





}

}
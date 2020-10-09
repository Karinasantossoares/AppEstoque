package com.example.karinaproject.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.karinaproject.R
import kotlinx.android.synthetic.main.item_lista_empresa.view.*

class EmpresaAdapter (val listaInformacao: List<Empresa>, val eventClick :(empresa : Empresa)->Unit) : RecyclerView.Adapter<EmpresaAdapter.ViewHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view : View = LayoutInflater.from(parent.context).inflate(R.layout.item_lista_empresa,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val empresa : Empresa = listaInformacao[position]
        holder.criar(empresa)
    }


    override fun getItemCount(): Int {
       return listaInformacao.size
    }

 inner class ViewHolder(itemView :View) : RecyclerView.ViewHolder(itemView){
    fun criar(empresa: Empresa){
        itemView.detalhe_empresa.text = empresa.nomeEmpresa


        itemView.setOnClickListener{
            eventClick(empresa)
        }

    }





}

}
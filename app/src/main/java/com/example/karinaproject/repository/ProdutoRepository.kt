package com.example.karinaproject.repository

import com.example.karinaproject.data.data.model.Produto
import com.example.karinaproject.ui.RegistrationViewParams


//ESSA CLASSE QUE SE LIGA AO BD


interface ProdutoRepository {
    //Repositório referente aos dados do Produto
    //Essa interface separa a camada de apresentação da camada de dados ou alguma API ,pois a parte interativa
    //não precisa saber de onde veio os dados.

    //Método que cria um produto
    //A classe Registrations... foi criada por mim com os atributos de produto , uma classe limpa que pode ser
    //usada quando eu mudar de banco de dados
    fun createProduto(RegistrationViewParams : RegistrationViewParams)


    //A classe Produto foi criada por mim porque ela que vai fazer a conversação com o BD
    fun getProduto(id :Long ) : Produto


}
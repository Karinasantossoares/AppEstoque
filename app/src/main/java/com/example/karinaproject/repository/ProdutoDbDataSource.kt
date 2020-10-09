package com.example.karinaproject.repository

import com.example.karinaproject.data.data.dao.ProdutoDao
import com.example.karinaproject.data.data.db.ProdutoEntity
import com.example.karinaproject.data.data.db.toProduto
import com.example.karinaproject.data.data.db.toProdutoEntity
import com.example.karinaproject.data.data.model.Produto
import com.example.karinaproject.ui.RegistrationViewParams


//Essa classe se refere ao banco de dados room.
// Aqui eu vou implementar meu ProdutoRepository que é a minha interface
//É nessa classe que eu implemento minha fonte de dados.

class ProdutoDbDataSource(
    // Aqui vou chamar a classe ProdutoDao para usar nos métodos abaixo
    private val produtoDao: ProdutoDao
) : ProdutoRepository {
    override fun createProduto(registrationViewParams: RegistrationViewParams) {
        val produtoEntity =
            registrationViewParams.toProdutoEntity() //toProdutoEnity converteu o registartion em entity , metodo criado na classe Entity


        // Nessa linha o meu metodo createProduto está como parametro um RegistrationViewParams
        //que tem apenas os atributos limpos que vem da camada de apresentação, logo temos que converter
        // o Registartion em ProdutoEntity pois o save abaixo solicita um Entity.Voltar lá na classe Entity ver a expli...
        produtoDao.save(produtoEntity)
    }

    override fun getProduto(id: Long): Produto {
        // Fiz a conversao na outra classe de Enitty para produto e por usei o toProduto para converter o id em Produto.
        return produtoDao.getUser(id).toProduto()
    }
}
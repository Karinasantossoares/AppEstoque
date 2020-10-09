package com.example.karinaproject.data.data.db

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.karinaproject.data.data.model.Produto
import com.example.karinaproject.ui.RegistrationViewParams


@Entity(tableName = "produto")
data class ProdutoEntity(
    @PrimaryKey val id: Long = 0,
    val nome: String,
    val valor: Double,
    val qtd: Int
)

fun RegistrationViewParams.toProdutoEntity(): ProdutoEntity {
    //Esse método está convertendo o Registartion em Entity.
    //A partir do objeto que foi criado (classe Registartion) posso chamar .toProdutoEntity que vai cair nesse método.
    //Essa linha do retorno dá acesso aos atributos do RegistrationViewParams
    return with(this) {
        ProdutoEntity(
            //Essa linha eu to passando meus atributo da classe Registration para o Entity
            nome = this.nome,
            valor = this.valor,
            qtd = this.qtd
        )

    }

}

fun ProdutoEntity.toProduto(): Produto {
    //Método que converte um Entity em Produto para usar no getUsder da classe ProdutoDb... que solicita um Produto.
    return Produto(
        id = this.id,
        nome = this.nome,
        valor = this.valor,
        qtd = this.qtd
    )

}


package com.salomon.appmvvm.model

class QuoteProvider {
    companion object{

        fun random():QuoteModel{
            val position = (quotesList.indices).random()
            return quotesList[position]
        }

        val quotesList = listOf<QuoteModel>(
            QuoteModel("Llorar frente a una mujer es como sangrar frente a un tiburon", "Honda"),
            QuoteModel("Todas mienten.", "Leonardo diCaprio"),
            QuoteModel("Las mujeres son como los chicles, entre mas las pisas... mas se pegan", "Albert Einstein"),
            QuoteModel("A medias solo el guaro.", "Robert deNiro")
        )
    }
}
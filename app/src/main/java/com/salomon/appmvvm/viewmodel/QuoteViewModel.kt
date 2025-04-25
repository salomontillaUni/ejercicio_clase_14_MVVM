package com.salomon.appmvvm.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.salomon.appmvvm.model.QuoteModel
import com.salomon.appmvvm.model.QuoteProvider

class QuoteViewModel : ViewModel(){
    val _quoteModel = MutableLiveData<QuoteModel>()

    fun randomQuote(){
        val currentQuote = QuoteProvider.random()
        _quoteModel.postValue(currentQuote)
    }
}
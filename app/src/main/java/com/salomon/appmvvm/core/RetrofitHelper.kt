package com.salomon.appmvvm.core

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitHelper {
    val BASE_URL = "https://drawsomething-59328-default-rtdb.europe-west1.firebasedatabase.app"
    fun getRetrofit():Retrofit{
        return Retrofit.Builder()
            .baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).build()
    }
}
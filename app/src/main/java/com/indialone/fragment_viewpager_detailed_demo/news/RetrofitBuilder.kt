package com.indialone.fragment_viewpager_detailed_demo.news

import com.indialone.fragment_viewpager_detailed_demo.utils.Constants
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitBuilder {

    fun getInstance(): Retrofit {
        return Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    val apiService : NewsApiService = getInstance().create(NewsApiService::class.java)

}
package com.indialone.fragment_viewpager_detailed_demo.news

import retrofit2.http.GET
import retrofit2.http.Query

interface NewsApiService {

    @GET("top-headlines")
    suspend fun getTopHeadlines(
        @Query("country") country : String,
        @Query("category") category : String,
        @Query("apiKey") apiKey : String
    ) : NewsEntity

}
package com.indialone.fragment_viewpager_detailed_demo.news

import androidx.annotation.WorkerThread
import com.indialone.fragment_viewpager_detailed_demo.utils.Constants

class NewsRepository {

    @WorkerThread
    suspend fun getTopHeadlines() = RetrofitBuilder
        .apiService
        .getTopHeadlines(
            Constants.COUNTRY,
            Constants.CATEGORY,
            Constants.API_KEY
        )

}
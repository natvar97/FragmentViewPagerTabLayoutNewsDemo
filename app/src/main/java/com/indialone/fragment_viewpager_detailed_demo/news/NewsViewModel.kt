package com.indialone.fragment_viewpager_detailed_demo.news

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.launch
import java.lang.Exception

class NewsViewModel(
    private val repository: NewsRepository
) : ViewModel() {

    private val newsList = MutableLiveData<NewsEntity>()

    init {
        fetchTopHeadlinesNews()
    }

    private fun fetchTopHeadlinesNews() {
        viewModelScope.launch {
            try {
                coroutineScope {
                    val news = async {
                        repository.getTopHeadlines()
                    }
                    newsList.postValue(news.await())
                }
            } catch (e: Exception) {
            }
        }
    }

    fun getAllTopHeadlines(): LiveData<NewsEntity> {
        return newsList
    }

}
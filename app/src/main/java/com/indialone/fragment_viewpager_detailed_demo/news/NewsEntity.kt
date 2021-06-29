package com.indialone.fragment_viewpager_detailed_demo.news

data class NewsEntity(
	val totalResults: Int? = null,
	val articles: List<ArticlesItem?>? = null,
	val status: String? = null
)

package com.indialone.fragment_viewpager_detailed_demo.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.indialone.fragment_viewpager_detailed_demo.R
import com.indialone.fragment_viewpager_detailed_demo.adapters.NewsItemAdapter
import com.indialone.fragment_viewpager_detailed_demo.databinding.FragmentNewsBinding
import com.indialone.fragment_viewpager_detailed_demo.news.ArticlesItem
import com.indialone.fragment_viewpager_detailed_demo.news.NewsViewModel
import com.indialone.fragment_viewpager_detailed_demo.news.ViewModelFactory

class NewsFragment : Fragment() {

    private lateinit var newsViewModel: NewsViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentNewsBinding.inflate(inflater , container , false)

        newsViewModel = ViewModelProvider(this , ViewModelFactory()).get(NewsViewModel::class.java)



        newsViewModel.getAllTopHeadlines().observe(viewLifecycleOwner){ newsEntity ->
            val recyclerView = binding.newsRecyclerView
            recyclerView.layoutManager = LinearLayoutManager(context)
            recyclerView.adapter = NewsItemAdapter(newsEntity.articles as ArrayList<ArticlesItem>)
        }

        return binding.root
    }


}
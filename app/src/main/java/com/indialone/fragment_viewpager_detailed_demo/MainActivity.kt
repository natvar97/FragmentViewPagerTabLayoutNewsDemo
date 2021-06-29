package com.indialone.fragment_viewpager_detailed_demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout
import com.indialone.fragment_viewpager_detailed_demo.adapters.ViewPagerAdapter
import com.indialone.fragment_viewpager_detailed_demo.fragments.MultiItemRecyclerView
import com.indialone.fragment_viewpager_detailed_demo.fragments.NestedRecyclerView
import com.indialone.fragment_viewpager_detailed_demo.fragments.NewsFragment

class MainActivity : AppCompatActivity() {

    private lateinit var viewPager : ViewPager
    private lateinit var tabLayout: TabLayout
    private lateinit var viewPagerAdapter: ViewPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewPager = findViewById(R.id.view_pager)
        tabLayout = findViewById(R.id.tab_layout)

        viewPagerAdapter = ViewPagerAdapter(supportFragmentManager)
        viewPagerAdapter.add(NestedRecyclerView() , "Nested")
        viewPagerAdapter.add(MultiItemRecyclerView() ,"MultiItem")
        viewPagerAdapter.add(NewsFragment() , "News")
        viewPager.adapter = viewPagerAdapter

        tabLayout.setupWithViewPager(viewPager)

    }
}
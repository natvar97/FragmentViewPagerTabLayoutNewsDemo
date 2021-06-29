package com.indialone.fragment_viewpager_detailed_demo.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.indialone.fragment_viewpager_detailed_demo.R
import com.indialone.fragment_viewpager_detailed_demo.adapters.MultiItemRecyclerViewAdapter
import com.indialone.fragment_viewpager_detailed_demo.databinding.FragmentMultiItemRecyclerViewBinding
import com.indialone.fragment_viewpager_detailed_demo.model.ActorEntity
import com.indialone.fragment_viewpager_detailed_demo.model.MovieEntity
import com.indialone.fragment_viewpager_detailed_demo.model.MultiActorEntity
import com.indialone.fragment_viewpager_detailed_demo.model.MultiActorListEntity

class MultiItemRecyclerView : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = FragmentMultiItemRecyclerViewBinding.inflate(inflater, container, false)

        view.multiItemRecyclerView.layoutManager = LinearLayoutManager(context)
        view.multiItemRecyclerView.adapter = MultiItemRecyclerViewAdapter(getArrayList())


        return view.root
    }


    fun getArrayList(): ArrayList<Any> {
        val list = ArrayList<Any>()
        list.add(
            MultiActorEntity(
                getString(R.string.master_actor1),
                "Master",
                "20 cr/movie",
                R.drawable.master_vijay
            )
        )
        list.add(
            MultiActorEntity(
                getString(R.string.master_actor2),
                "Master",
                "18 cr/movie",
                R.drawable.master_malavika
            )
        )
        list.add(
            MovieEntity(
                resources.getString(R.string.movie_master),
                resources.getString(R.string.master_imdb),
                resources.getString(R.string.master_director),
                R.drawable.master_poster,
                getActorList()
            )
        )
        list.add(MultiActorListEntity(getActorList()))
        list.add(
            MultiActorEntity(
                getString(R.string.master_actor3),
                "Master",
                "5 cr/movie",
                R.drawable.master_vijay_sethupati
            )
        )
        list.add(
            MovieEntity(
                resources.getString(R.string.movie_master),
                resources.getString(R.string.master_imdb),
                resources.getString(R.string.master_director),
                R.drawable.master_poster,
                getActorList()
            )
        )
        list.add(MultiActorListEntity(getActorList()))
        list.add(
            MultiActorEntity(
                getString(R.string.master_actor4),
                "Master",
                "10 cr/movie",
                R.drawable.master_arjun_das
            )
        )
        list.add(
            MultiActorEntity(
                getString(R.string.master_actor5),
                "Master",
                "8 cr/movie",
                R.drawable.master_andrea
            )
        )

        list.add(MultiActorListEntity(getActorList()))

        return list
    }

    private fun getActorList(): ArrayList<ActorEntity> {
        val actorList = ArrayList<ActorEntity>()
        actorList.add(
            ActorEntity(
                resources.getString(R.string.master_actor1),
                R.drawable.master_vijay
            )
        )
        actorList.add(
            ActorEntity(
                resources.getString(R.string.master_actor2),
                R.drawable.master_malavika
            )
        )
        actorList.add(
            ActorEntity(
                resources.getString(R.string.master_actor3),
                R.drawable.master_vijay_sethupati
            )
        )
        actorList.add(
            ActorEntity(
                resources.getString(R.string.master_actor4),
                R.drawable.master_arjun_das
            )
        )
        actorList.add(
            ActorEntity(
                resources.getString(R.string.master_actor5),
                R.drawable.master_andrea
            )
        )
        return actorList
    }

}
package com.indialone.fragment_viewpager_detailed_demo.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.indialone.fragment_viewpager_detailed_demo.R
import com.indialone.fragment_viewpager_detailed_demo.adapters.MovieItemAdapter
import com.indialone.fragment_viewpager_detailed_demo.databinding.FragmentNestedRecyclerViewBinding
import com.indialone.fragment_viewpager_detailed_demo.model.ActorEntity
import com.indialone.fragment_viewpager_detailed_demo.model.MovieEntity

class NestedRecyclerView : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = FragmentNestedRecyclerViewBinding.inflate(inflater , container , false)

//        val view: View? = inflater.inflate(R.layout.fragment_nested_recycler_view, container, false)

        val nestedRecyclerView = view.nestedRecyclerView
        nestedRecyclerView.layoutManager = LinearLayoutManager(context)
        nestedRecyclerView.adapter = MovieItemAdapter(getMoviesList())

        return view.root
    }

    private fun getMoviesList(): ArrayList<MovieEntity> {

        val list = ArrayList<MovieEntity>()
        list.add(
            MovieEntity(
                resources.getString(R.string.movie_master),
                resources.getString(R.string.master_imdb),
                resources.getString(R.string.master_director),
                R.drawable.master_poster,
                getActorList()
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
        list.add(
            MovieEntity(
                resources.getString(R.string.movie_master),
                resources.getString(R.string.master_imdb),
                resources.getString(R.string.master_director),
                R.drawable.master_poster,
                getActorList()
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
        list.add(
            MovieEntity(
                resources.getString(R.string.movie_master),
                resources.getString(R.string.master_imdb),
                resources.getString(R.string.master_director),
                R.drawable.master_poster,
                getActorList()
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
        list.add(
            MovieEntity(
                resources.getString(R.string.movie_master),
                resources.getString(R.string.master_imdb),
                resources.getString(R.string.master_director),
                R.drawable.master_poster,
                getActorList()
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
        list.add(
            MovieEntity(
                resources.getString(R.string.movie_master),
                resources.getString(R.string.master_imdb),
                resources.getString(R.string.master_director),
                R.drawable.master_poster,
                getActorList()
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
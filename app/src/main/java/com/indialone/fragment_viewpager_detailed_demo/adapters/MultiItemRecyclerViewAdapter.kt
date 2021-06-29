package com.indialone.fragment_viewpager_detailed_demo.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.constraintlayout.widget.ConstraintSet
import androidx.recyclerview.widget.RecyclerView
import com.indialone.fragment_viewpager_detailed_demo.databinding.MovieItemLayoutBinding
import com.indialone.fragment_viewpager_detailed_demo.databinding.MultiActorItemLayoutBinding
import com.indialone.fragment_viewpager_detailed_demo.databinding.MultiActorListLayoutBinding
import com.indialone.fragment_viewpager_detailed_demo.model.MovieEntity
import com.indialone.fragment_viewpager_detailed_demo.model.MultiActorEntity
import com.indialone.fragment_viewpager_detailed_demo.model.MultiActorListEntity
import com.indialone.fragment_viewpager_detailed_demo.viewholders.MultiActorListViewHolder
import com.indialone.fragment_viewpager_detailed_demo.viewholders.MultiActorViewHolder

class MultiItemRecyclerViewAdapter(
    private val list: ArrayList<Any>
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private val ACTOR: Int = 0
    private val MOVIE: Int = 1
    private val ACTOR_LIST: Int = 2

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {

        lateinit var viewHolder: RecyclerView.ViewHolder

        when (viewType) {
            ACTOR -> {
                val view = MultiActorItemLayoutBinding.inflate(
                    LayoutInflater.from(parent.context),
                    parent,
                    false
                )
                viewHolder = MultiActorViewHolder(view)
            }
            ACTOR_LIST -> {
                val view = MultiActorListLayoutBinding.inflate(
                    LayoutInflater.from(parent.context),
                    parent,
                    false
                )
                viewHolder = MultiActorListViewHolder(view)
            }
            MOVIE -> {
                val view = MovieItemLayoutBinding.inflate(
                    LayoutInflater.from(parent.context),
                    parent,
                    false
                )
                viewHolder = MovieItemAdapter.MovieItemViewHolder(view)
            }
        }

        return viewHolder
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder.itemViewType) {
            ACTOR -> {
                val vh = holder as MultiActorViewHolder
                configureMultiActorViewHolder(vh, position)
            }
            ACTOR_LIST -> {
                val vh = holder as MultiActorListViewHolder
                configureMultiActorListViewHolder(vh, position)
            }
            MOVIE -> {
                val vh = holder as MovieItemAdapter.MovieItemViewHolder
                configureMovieHolder(vh, position)
            }
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun getItemViewType(position: Int): Int {
        if (list.get(position) is MultiActorEntity)
            return ACTOR

        if (list.get(position) is MovieEntity)
            return MOVIE

        if (list.get(position) is MultiActorListEntity)
            return ACTOR_LIST

        return -1
    }

    fun configureMultiActorViewHolder(vh: MultiActorViewHolder, position: Int) {
        val actor = list.get(position) as MultiActorEntity
        vh.bind(actor)
    }

    fun configureMultiActorListViewHolder(vh: MultiActorListViewHolder, position: Int) {
        val actor = list.get(position) as MultiActorListEntity
        vh.bind(actor)
    }

    fun configureMovieHolder(vh: MovieItemAdapter.MovieItemViewHolder, position: Int) {
        val movie = list.get(position) as MovieEntity
        vh.bind(movie)
    }

}
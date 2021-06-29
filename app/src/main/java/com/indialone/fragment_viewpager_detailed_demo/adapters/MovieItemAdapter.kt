package com.indialone.fragment_viewpager_detailed_demo.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.indialone.fragment_viewpager_detailed_demo.R
import com.indialone.fragment_viewpager_detailed_demo.databinding.MovieItemLayoutBinding
import com.indialone.fragment_viewpager_detailed_demo.model.MovieEntity

class MovieItemAdapter(
    private val movies: ArrayList<MovieEntity>
) : RecyclerView.Adapter<MovieItemAdapter.MovieItemViewHolder>() {

    class MovieItemViewHolder(itemView: MovieItemLayoutBinding) : RecyclerView.ViewHolder(itemView.root) {
        private val movieTitle: TextView = itemView.tvMovieTitle
        private val movieIMDb: TextView = itemView.tvMovieImdb
        private val movieDirector: TextView = itemView.tvMovieDirector
        private val moviePoster: ImageView = itemView.ivPoster
        private val actorRecyclerView: RecyclerView = itemView.rvActor

        fun bind(movie: MovieEntity) {
            movieTitle.text = movie.title
            movieIMDb.text = movie.imdb
            movieDirector.text = movie.director
            Glide.with(itemView.context)
                .load(movie.poster)
                .into(moviePoster)

            val layoutManager = LinearLayoutManager(itemView.context)
            layoutManager.orientation = LinearLayoutManager.HORIZONTAL
            actorRecyclerView.layoutManager = layoutManager
            actorRecyclerView.adapter = ActorItemAdapter(movie.actors)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieItemViewHolder {
        val view = MovieItemLayoutBinding.inflate(LayoutInflater.from(parent.context) , parent , false)

        return MovieItemViewHolder(view)
    }

    override fun onBindViewHolder(holder: MovieItemViewHolder, position: Int) {
        holder.bind(movies[position])
    }

    override fun getItemCount(): Int {
        return movies.size
    }
}
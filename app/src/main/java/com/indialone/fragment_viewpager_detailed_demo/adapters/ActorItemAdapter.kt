package com.indialone.fragment_viewpager_detailed_demo.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.indialone.fragment_viewpager_detailed_demo.model.ActorEntity
import com.indialone.fragment_viewpager_detailed_demo.R
import com.indialone.fragment_viewpager_detailed_demo.databinding.ActorItemLayoutBinding

class ActorItemAdapter(
    private val actors: ArrayList<ActorEntity>
) : RecyclerView.Adapter<ActorItemAdapter.ActorViewHolder>() {
    class ActorViewHolder(itemView: ActorItemLayoutBinding) : RecyclerView.ViewHolder(itemView.root) {
        private var name: TextView = itemView.tvActorName
        private var image: ImageView = itemView.ivMasterActor

        fun bind(actor: ActorEntity) {
            name.text = actor.name
            Glide.with(itemView.context)
                .load(actor.image)
                .into(image)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ActorViewHolder {
        val view = ActorItemLayoutBinding.inflate(LayoutInflater.from(parent.context) ,parent ,false )
        return ActorViewHolder(view)
    }

    override fun onBindViewHolder(holder: ActorViewHolder, position: Int) {
        holder.bind(actors[position])
    }

    override fun getItemCount(): Int {
        return actors.size
    }
}
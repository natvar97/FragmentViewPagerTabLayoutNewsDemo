package com.indialone.fragment_viewpager_detailed_demo.viewholders

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.indialone.fragment_viewpager_detailed_demo.databinding.MultiActorItemLayoutBinding
import com.indialone.fragment_viewpager_detailed_demo.model.MultiActorEntity

class MultiActorViewHolder(itemView: MultiActorItemLayoutBinding) :
    RecyclerView.ViewHolder(itemView.root) {

    private val tvActorName = itemView.tvActorName
    private val tvActorMovie = itemView.tvActorMovie
    private val tvActorSalary = itemView.tvActorSalary
    private val ivActor = itemView.ivActor

    fun bind(actor: MultiActorEntity) {
        tvActorName.text = actor.name
        tvActorMovie.text = actor.movie
        tvActorSalary.text = actor.salary
        Glide.with(itemView.context)
            .load(actor.image)
            .into(ivActor)
    }


}
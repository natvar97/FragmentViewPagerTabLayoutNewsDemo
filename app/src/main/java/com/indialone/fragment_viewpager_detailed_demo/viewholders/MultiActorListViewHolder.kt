package com.indialone.fragment_viewpager_detailed_demo.viewholders

import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.indialone.fragment_viewpager_detailed_demo.adapters.ActorItemAdapter
import com.indialone.fragment_viewpager_detailed_demo.databinding.ActorItemLayoutBinding
import com.indialone.fragment_viewpager_detailed_demo.databinding.MultiActorItemLayoutBinding
import com.indialone.fragment_viewpager_detailed_demo.databinding.MultiActorListLayoutBinding
import com.indialone.fragment_viewpager_detailed_demo.model.ActorEntity
import com.indialone.fragment_viewpager_detailed_demo.model.MultiActorEntity
import com.indialone.fragment_viewpager_detailed_demo.model.MultiActorListEntity

class MultiActorListViewHolder(itemView: MultiActorListLayoutBinding) :
    RecyclerView.ViewHolder(itemView.root) {

    val recyclerView = itemView.rvMultiActor

    fun bind(actor: MultiActorListEntity) {
        val layoutManager = LinearLayoutManager(itemView.context)
        layoutManager.orientation = LinearLayoutManager.HORIZONTAL
        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = ActorItemAdapter(actor.list)
    }
}
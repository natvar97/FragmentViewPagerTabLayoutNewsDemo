package com.indialone.fragment_viewpager_detailed_demo.adapters

import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.indialone.fragment_viewpager_detailed_demo.databinding.NewsItemLayoutBinding
import com.indialone.fragment_viewpager_detailed_demo.news.ArticlesItem

class NewsItemAdapter(
    private val news: ArrayList<ArticlesItem>
) : RecyclerView.Adapter<NewsItemAdapter.NewsItemViewHolder>() {
    class NewsItemViewHolder(itemView: NewsItemLayoutBinding) :
        RecyclerView.ViewHolder(itemView.root) {
        private val tvTitle = itemView.tvTitle
        private val tvAuthor = itemView.tvAuthor
        private val tvPublishedAt = itemView.tvPublishedDate
        private val tvContent = itemView.tvContent
        private val tvDescription = itemView.tvDescription
        private val ivImageNews = itemView.ivImageNews

        fun bind(article: ArticlesItem) {
            tvTitle.text = article.title
            tvAuthor.text = article.author
            tvPublishedAt.text = article.publishedAt
            tvContent.text = article.content
            tvDescription.text = article.description
            Glide.with(itemView.context)
                .load(article.urlToImage)
                .centerCrop()
                .into(ivImageNews)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsItemViewHolder {
        val view = NewsItemLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return NewsItemViewHolder(view)
    }

    override fun onBindViewHolder(holder: NewsItemViewHolder, position: Int) {
        holder.bind(news[position])
        holder.itemView.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse(news[position].url)
            holder.itemView.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return news.size
    }
}
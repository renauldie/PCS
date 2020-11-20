package com.reynn.novels

import android.text.style.BackgroundColorSpan
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RelativeLayout
import androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_novel.view.*
import com.bumptech.glide.Glide


class NovelAdapter(var list: List<Novel>, val sharedPref: SharedPref) : RecyclerView.Adapter<NovelAdapter.ViewHolder>() {

    var onItemClickListener: ((Novel) -> Unit)? = null

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(novel : Novel) {
            with(itemView){
                Glide.with(this).load(novel.gambar).into(itemImage)
                itemNovel.text = novel.nama
                itemPengarang.text = novel.penulis
                itemRating.text = novel.rating.toString()
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_novel, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val novel = list.get(position)
        holder.bind(novel)
        holder.itemView.setOnClickListener{
            onItemClickListener?.invoke(novel)
        }
        holder.itemView.itemPengarang.visibility = if (sharedPref.writter) View.VISIBLE else View.GONE
        holder.itemView.itemPengn.visibility = if (sharedPref.writter) View.VISIBLE else View.GONE
        holder.itemView.packageNovel.visibility = if (sharedPref.item) View.GONE else View.VISIBLE
    }

    override fun getItemCount(): Int {
        return list.size
    }

}
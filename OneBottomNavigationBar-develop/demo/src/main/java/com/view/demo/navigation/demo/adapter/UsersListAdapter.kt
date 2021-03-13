package com.view.demo.navigation.demo.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.view.bottomview.demo.R
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.view_item_card_view_coin.view.*


class UsersListAdapter(val partItemList: List<String>, val clickListener: (String) -> Unit) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.view_item_card_view_coin, parent, false)
        return PartViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as PartViewHolder).bind(partItemList[position], clickListener)
    }

    override fun getItemCount() = partItemList.size

    class PartViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(part: String, clickListener: (String) -> Unit) {
            Glide
                .with(itemView.icon)
                .load("https://event.12cm.com.tw/starbucks/img/siren-l.png")
                .centerCrop()
                .into(itemView.icon);
//            itemView.login_text_view.text = part.login
            itemView.setOnClickListener { clickListener(part) }
        }
    }
}
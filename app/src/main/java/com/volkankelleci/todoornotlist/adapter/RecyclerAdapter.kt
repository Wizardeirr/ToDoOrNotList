package com.volkankelleci.todoornotlist.adapter

import android.graphics.Bitmap
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.volkankelleci.todoornotlist.R

class RecyclerAdapter(val yapilacaklarListesi:Array<String>,val alinacakResim:Bitmap): RecyclerView.Adapter<RecyclerAdapter.yapilacaklarViewHolder>() {
    class yapilacaklarViewHolder(itemView:View):RecyclerView.ViewHolder(itemView) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): yapilacaklarViewHolder {
        val inflater=LayoutInflater.from(parent.context)
        val view=inflater.inflate(R.layout.recycler_raw,parent,false)
        return yapilacaklarViewHolder(view)
    }

    override fun onBindViewHolder(holder: yapilacaklarViewHolder, position: Int) {


    }

    override fun getItemCount(): Int {
        return yapilacaklarListesi.size
    }
}
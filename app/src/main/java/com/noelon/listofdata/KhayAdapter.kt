package com.noelon.listofdata

import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class KhayAdapter (val bookcollection: ArrayList<FavouriteBook>) :
    RecyclerView.Adapter<KhayAdapter.Khayholder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): KhayAdapter.Khayholder {
        val inflatedView = parent.inflate(R.layout.rv_item, false)
        return Khayholder(inflatedView)
    }

    override fun getItemCount(): Int {
        return bookcollection.size
    }

    override fun onBindViewHolder(holder: KhayAdapter.Khayholder, position: Int) {
        val book = bookcollection[position]
        holder.details(book)
    }

    class Khayholder(v: View) : RecyclerView.ViewHolder(v) {
        private var view: View = v
        private var prose: FavouriteBook? = null

        fun details(book: FavouriteBook) {
            this.prose = book
            view.findViewById<TextView>(R.id.nameTV).text = book.name
            view.findViewById<TextView>(R.id.ratingTV).text = book.rating.toString()
            view.findViewById<TextView>(R.id.authorTV).text = book.author
        }

    }
}
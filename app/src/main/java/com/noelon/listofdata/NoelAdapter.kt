package com.noelon.listofdata

import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class NoelAdapter(private val books: ArrayList<FavouriteBook>) :
    RecyclerView.Adapter<NoelAdapter.Noelholder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Noelholder {
        val inflatedView = parent.inflate(R.layout.rv_item, false)
        return Noelholder(inflatedView)
    }

    override fun getItemCount(): Int {
        return books.size
    }


    override fun onBindViewHolder(holder: Noelholder, position: Int) {
        val bookItem = books[position]
        holder.bind(bookItem)
    }

    class Noelholder(v: View) : RecyclerView.ViewHolder(v) {
        private var view: View = v
        private var book: FavouriteBook? = null

        fun bind(book: FavouriteBook) {
            this.book = book
            view.findViewById<TextView>(R.id.nameTV).text = book.name
            view.findViewById<TextView>(R.id.ratingTV).text = book.rating.toString()
            view.findViewById<TextView>(R.id.authorTV).text = book.author
        }

    }
}
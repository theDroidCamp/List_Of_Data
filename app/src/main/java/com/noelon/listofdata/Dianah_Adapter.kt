package com.noelon.listofdata

import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Dianah_Adapter(private val books: ArrayList<FavouriteBook>) :
    RecyclerView.Adapter<Dianah_Adapter.Dianah_Holder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Dianah_Adapter.Dianah_Holder {
        val inflatedView = parent.inflate(R.layout.rv_item, false)
        return Dianah_Adapter.Dianah_Holder(inflatedView)
    }

    override fun onBindViewHolder(holder: Dianah_Adapter.Dianah_Holder, position: Int) {
        val bookItem = books[position]
        holder.bind(bookItem)
    }

    override fun getItemCount(): Int {
        return books.size
    }

    class Dianah_Holder(v:View) : RecyclerView.ViewHolder(v) {
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
package com.noelon.listofdata

import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ChibufirstAdapter(private val books: ArrayList<FavouriteBook>) :
    RecyclerView.Adapter<ChibufirstAdapter.ChibufirstViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChibufirstViewHolder {
        return ChibufirstViewHolder(parent.inflate(R.layout.rv_item, false))
    }

    override fun onBindViewHolder(holder: ChibufirstViewHolder, position: Int) {
        val book = books[position]
        holder.bind(book)
    }

    override fun getItemCount(): Int = books.size

    class ChibufirstViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val nameTv: TextView = itemView.findViewById(R.id.nameTV)
        private val ratingTv: TextView = itemView.findViewById(R.id.ratingTV)
        private val authorTv: TextView = itemView.findViewById(R.id.authorTV)

        fun bind(book: FavouriteBook) {
            nameTv.text = book.name
            ratingTv.text = book.rating.toString()
            authorTv.text = book.author
        }
    }
}
package com.noelon.listofdata

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.sultan_activity.view.*

class SultanAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

        private var books: List<FavouriteBook> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return sultanViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.sultan_activity, parent, false)
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when(holder){
            is sultanViewHolder -> {
                holder.bind(books.get(position))
            }
        }
    }

    override fun getItemCount(): Int {
        return books.size
    }
    fun submitList(favouriteBook: List<FavouriteBook>){
        books = favouriteBook
    }

    class sultanViewHolder constructor(
        itemView: View
    ): RecyclerView.ViewHolder(itemView) {
        val authorName = itemView.authorName
        val rating = itemView.rating
        val nameOfBook = itemView.nameOfBook

        fun bind(book: FavouriteBook){
            nameOfBook.setText(book.name)
            rating.setText(book.rating.toString())
            authorName.setText(book.author)
        }
    }
}
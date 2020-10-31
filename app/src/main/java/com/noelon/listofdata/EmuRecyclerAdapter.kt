package com.noelon.listofdata

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.rv_item.view.*

class EmuRecyclerAdapter(private val books: ArrayList<FavouriteBook>): RecyclerView.Adapter<EmuRecyclerAdapter.EmuHolder> (){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EmuHolder {
      return EmuHolder(
          LayoutInflater.from(parent.context).inflate(R.layout.rv_item,parent,false)
      )
    }

    override fun getItemCount(): Int {
        return books.size
    }

    override fun onBindViewHolder(holder: EmuHolder, position: Int) {
        val bookItem = books[position]
        holder.bind(bookItem)
    }
    // Creating custom viewHolder
    class EmuHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        //Getting the Views from the xml and storing in variables
        val book_author = itemView.authorTV
        val book_ratings = itemView.ratingTV
        val book_name = itemView.nameTV

        //Binding or populating with Values
        fun bind(book: FavouriteBook){
            book_author.text = book.author
            book_name.text = book.name
            book_ratings.text = book.rating.toString()
        }
    }
}
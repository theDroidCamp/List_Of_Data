package com.noelon.listofdata

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.rv_item.view.*

class TaofeeqAdapter(private val books: ArrayList<FavouriteBook>
    ): RecyclerView.Adapter<TaofeeqAdapter.TaofeeqHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TaofeeqHolder {
        return TaofeeqHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.rv_item, parent, false)
        )
    }

    override fun onBindViewHolder(holder: TaofeeqHolder, position: Int) {
        val bookItem = books
        when(holder){

            is TaofeeqHolder ->{
                holder.bind(bookItem.get(position))
            }
        }
    }

    override fun getItemCount(): Int {
        return books.size
    }



    class TaofeeqHolder constructor(
        itemView: View
    ): RecyclerView.ViewHolder(itemView){

        val author_tv = itemView.authorTV
        val rating_tv = itemView.ratingTV
        val naming_tv = itemView.nameTV

        fun bind(book: FavouriteBook){

            author_tv.setText(book.author)
            rating_tv.setText(book.rating.toString())
            naming_tv.setText(book.name)
        }

    }
}
package com.noelon.listofdata

import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Beryladapter(private val books: ArrayList<FavouriteBook>) :
    RecyclerView.Adapter<Beryladapter.Beryl_holder>(){
    class Beryl_holder(v: View) : RecyclerView.ViewHolder(v){
        private var view: View = v
        private var book: FavouriteBook? = null
        fun bind(book: FavouriteBook) {
           this.book = book
            view.findViewById<TextView>(R.id.nameTV).text = book.name
            view.findViewById<TextView>(R.id.ratingTV).text = book.rating.toString()
            view.findViewById<TextView>(R.id.authorTV).text = book.author
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Beryl_holder {
        TODO("Not yet implemented")
        val inflatedView = parent.inflate(R.layout.rv_item,false)
        return Beryl_holder(inflatedView)
    }

    override fun onBindViewHolder(holder: Beryl_holder, position: Int) {
        TODO("Not yet implemented")
        val bookItem = books[position]
        holder.bind(bookItem)

    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
        return books.size
    }


}
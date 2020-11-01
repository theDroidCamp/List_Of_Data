package com.noelon.listofdata.oscar

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.noelon.listofdata.Dianah_Adapter
import com.noelon.listofdata.FavouriteBook
import com.noelon.listofdata.R
import com.noelon.listofdata.inflate

class OscarAdapter(private val books: ArrayList<FavouriteBook>, private val context:Context):
    RecyclerView.Adapter<OscarAdapter.OscarViewHolder>() {


    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): OscarAdapter.OscarViewHolder {

        val layoutInflater:LayoutInflater = LayoutInflater.from(context)
        val view:View = layoutInflater.inflate(R.layout.oscar_list, parent, false)
        return OscarViewHolder(view)
    }

    override fun getItemCount(): Int {
        return  books.size
    }

    override fun onBindViewHolder(holder: OscarAdapter.OscarViewHolder, position: Int) {
       val book:FavouriteBook = books[position]
        holder.bindTo(book)
    }

    class OscarViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val name:TextView = itemView.findViewById(R.id.textView_oscar_name)
        val author:TextView = itemView.findViewById(R.id.textView_oscar_author)
        val rating:TextView = itemView.findViewById(R.id.textView_oscar_ratings)


        fun bindTo(book: FavouriteBook){
            name.text = book.name
            author.text = book.author
            rating.text = " Ratings: ${book.rating.toString()}"
    }




}
}
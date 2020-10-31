package com.noelon.listofdata

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.noelon.listofdata.databinding.RvItemBinding
import kotlin.collections.ArrayList

class CarlaAdapter(private val myBooks: ArrayList<FavouriteBook>) :
    RecyclerView.Adapter<CarlaAdapter.CarlaHolder>() {




    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarlaHolder {
        val inflater = LayoutInflater.from(parent.context)
        val itemBinding : RvItemBinding = RvItemBinding.inflate(inflater, parent, false)
        return CarlaHolder(itemBinding)
    }

    override fun onBindViewHolder(holder: CarlaHolder, position: Int) {
        val bookIns = myBooks[position]
        holder.bindView(bookIns)
    }

    override fun getItemCount(): Int {

        return myBooks.size

    }


    class CarlaHolder(itemBinding: RvItemBinding) : ViewHolder(itemBinding.root) {

        private lateinit var itemBinding : RvItemBinding

        private var book: FavouriteBook? = null

        fun bindView(book: FavouriteBook?) {
            this.book = book
            if (book != null) {
                itemBinding.nameTV.text = book.name
                itemBinding.ratingTV.text = book.rating.toString()
                itemBinding.authorTV.text =book.author
            }

        }
    }


}
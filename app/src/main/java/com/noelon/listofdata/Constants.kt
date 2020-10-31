package com.noelon.listofdata

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes

data class FavouriteBook(
    val name: String,
    val rating: Int,
    val author: String
) {
    object favouriteBookList {

    }
}


val favouriteBookList = arrayListOf<FavouriteBook>(
    FavouriteBook("HarryPotter", 5, "JK rowling"),
    FavouriteBook("Life of pi", 3, "Yann Martel"),
    FavouriteBook("Davinci code", 4, "Dan brown"),
    FavouriteBook("Memoirs of a geisha", 4, "Arthur Golden"),
    FavouriteBook("A man called ove", 5, "Fredrick Backman"),
    FavouriteBook("Twilight", 1, "Stephenie Meyer"),
    FavouriteBook("The book thief", 2, "Markus Zusak"),
    FavouriteBook("Gone girl", 2, "Gillian Flynn"),
    FavouriteBook("The help", 1, "Kathryn Stockett"),
    FavouriteBook("Fight club", 4, "Chuck palahniuk")
)


fun ViewGroup.inflate(@LayoutRes layoutRes: Int, attachToRoot: Boolean = false): View {
    return LayoutInflater.from(context).inflate(layoutRes, this, attachToRoot)
}
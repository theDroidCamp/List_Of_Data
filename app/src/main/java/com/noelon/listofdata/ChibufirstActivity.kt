package com.noelon.listofdata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_chibufirst.*

class ChibufirstActivity : AppCompatActivity() {
    lateinit var adapter: ChibufirstAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chibufirst)

        adapter = ChibufirstAdapter(favouriteBookList)

        recycler_books.layoutManager = LinearLayoutManager(this)
        recycler_books.adapter = adapter
    }
}
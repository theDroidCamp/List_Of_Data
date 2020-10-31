package com.noelon.listofdata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class Dianah_Activity : AppCompatActivity() {
    private lateinit var adapter: Dianah_Adapter
    private lateinit var linearLayoutManager: LinearLayoutManager
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        adapter = Dianah_Adapter(favouriteBookList)
        linearLayoutManager = LinearLayoutManager(this)

        recycler_view.adapter = adapter
        recycler_view.layoutManager = linearLayoutManager

    }
}
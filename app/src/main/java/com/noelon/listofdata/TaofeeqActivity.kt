package com.noelon.listofdata

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_taofeeq.recycler_view

class TaofeeqActivity : AppCompatActivity() {

    private lateinit var bookAdapter: TaofeeqAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_taofeeq)

        myRecyclerView()

    }

        private fun myRecyclerView() {
            recycler_view.apply {
                layoutManager = LinearLayoutManager(this@TaofeeqActivity)
                bookAdapter = TaofeeqAdapter(favouriteBookList)
                adapter = bookAdapter
            }
    }
}

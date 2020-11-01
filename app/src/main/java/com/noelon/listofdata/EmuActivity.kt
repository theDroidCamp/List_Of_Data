package com.noelon.listofdata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_emu.*
import kotlinx.android.synthetic.main.activity_main.*

class EmuActivity : AppCompatActivity() {
    private lateinit var bookAdapter: EmuRecyclerAdapter
    private lateinit var linearLayout: LinearLayoutManager
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_emu)

        bookAdapter = EmuRecyclerAdapter(favouriteBookList)
        linearLayout = LinearLayoutManager(this)

        rv.adapter = bookAdapter
        rv.layoutManager = linearLayout


    }

}
package com.noelon.listofdata.oscar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.noelon.listofdata.FavouriteBook
import com.noelon.listofdata.R
import com.noelon.listofdata.favouriteBookList

class OscarActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_oscar)

        val actionBar = supportActionBar
        if (actionBar != null) {
            actionBar.title = "Oscar ListOfData"
        }

        setUpRv()

    }

    fun setUpRv(){
        val rV:RecyclerView = findViewById(R.id.oscarRv)
        val adapter:OscarAdapter = OscarAdapter(favouriteBookList, this)
        val lM:LinearLayoutManager = LinearLayoutManager(this)
        rV.adapter = adapter
        rV.layoutManager = lM

    }

}
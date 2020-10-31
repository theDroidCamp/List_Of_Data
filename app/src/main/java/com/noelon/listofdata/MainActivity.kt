package com.noelon.listofdata

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import com.noelon.listofdata.oscar.OscarActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var adapter: ElonAdapter
    private lateinit var linearLayoutManager: LinearLayoutManager
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        adapter = ElonAdapter(favouriteBookList)
        linearLayoutManager = LinearLayoutManager(this)

        recycler_view.adapter = adapter
        recycler_view.layoutManager = linearLayoutManager


    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return  true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item.itemId
        // add your menu here to navigate to ur activity
        if (id == R.id.item_go){
            val intent = Intent(this, OscarActivity::class.java)
            startActivity(intent)
        }

        return true
    }
}
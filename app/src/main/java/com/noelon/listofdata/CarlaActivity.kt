package com.noelon.listofdata

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.noelon.listofdata.databinding.ActivityCarlaBinding


class CarlaActivity : AppCompatActivity() {

    private lateinit var binding : ActivityCarlaBinding
    private lateinit var recyclerView : RecyclerView
    private lateinit var myAdapter : CarlaAdapter
    private lateinit var myLayout : LinearLayoutManager
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCarlaBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        recyclerView = binding.carlasRecyclerview
        myAdapter = CarlaAdapter(favouriteBookList)
        myLayout = LinearLayoutManager(this)

        recyclerView.adapter = myAdapter
        recyclerView.layoutManager = myLayout



    }



}
package com.hfad.beeradviser

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AlertDialog
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity(){
    lateinit var recyclerView: RecyclerView
    lateinit var adapter: CountriesAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    recyclerView = findViewById(R.id.recyclerView)
        var countryNameList = ArrayList<String>()
        var detailsList = ArrayList<String>()
        var imageList = ArrayList<Int>()
        /*
        implimentation :
        this / this@MainActivity -> context
        recyclerView.layoutManager = LinearLayoutManager(this)
        LinearLayoutManager -> single column from top to bottom
        recyclerView.layoutManager = GridLayoutManager(this,2)
        2 : span count = number of columns
        * */
         /*
         * param1 : span count
         * param2 : orientation
         * in case of staggered grid layout if
         * orientation -> vertical span count = no of columns
         *             -> horizontal span count = no of rows
         * */
       // recyclerView.layoutManager = StaggeredGridLayoutManager(2,
        //    StaggeredGridLayoutManager.VERTICAL)
    recyclerView.layoutManager = LinearLayoutManager(this@MainActivity)
        countryNameList.add("United Kingdom")
        countryNameList.add("Germany")
        countryNameList.add("USA")
        detailsList.add("This is the United Kingdom Flag")
        detailsList.add("This is the Germany Flag")
        detailsList.add("This is the USA Flag")
        imageList.add(R.drawable.unitedkingdom)
        imageList.add(R.drawable.germany)
        imageList.add(R.drawable.usa)
        adapter = CountriesAdapter(countryNameList,detailsList,imageList,this@MainActivity)
    recyclerView.adapter = adapter
    }
}
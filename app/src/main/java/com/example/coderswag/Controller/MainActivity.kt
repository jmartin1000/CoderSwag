package com.example.coderswag.Controller

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.example.coderswag.Adapters.CategoryRecycleAdapter
import com.example.coderswag.R
import com.example.coderswag.Services.DataService
import com.example.coderswag.Utilities.EXTRA_CATEGORY
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter : CategoryRecycleAdapter
    lateinit var layoutManager: LinearLayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryRecycleAdapter(this, DataService.categories) { category ->
            val productIntent = Intent(this, ProductsActivity::class.java)
            productIntent.putExtra(EXTRA_CATEGORY, category.title)
            startActivity(productIntent)
        }
        categoryListView.adapter = adapter

        layoutManager = LinearLayoutManager(this)
        categoryListView.layoutManager = layoutManager
        categoryListView.setHasFixedSize(true)



//      this works for list view, not recycler view
//      categoryListView.setOnItemClickListener { adapterView, view, i, l ->
//            val category = DataService.categories[i]
//            Toast.makeText(this, "You clicked on the ${category.title} cell", Toast.LENGTH_SHORT ).show()
//        }

    }
}

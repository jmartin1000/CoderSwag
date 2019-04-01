package com.example.coderswag.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.coderswag.R
import com.example.coderswag.Services.DataService
import com.example.coderswag.Utilities.EXTRA_CATEGORY
import com.example.coderswag.Utilities.EXTRA_PRODUCT
import kotlinx.android.synthetic.main.activity_product_detail.*
import kotlinx.android.synthetic.main.product_list_item.*

class ProductDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_detail)

        val selectedProductTitle = intent.getStringExtra(EXTRA_PRODUCT)
        val selectedCategoryTitle = intent.getStringExtra(EXTRA_CATEGORY)

        val selectedProduct = DataService.getSelectedProduct(selectedCategoryTitle, selectedProductTitle)
        val resourceId = resources.getIdentifier(selectedProduct.image, "drawable", packageName)
//        selectedProductImage.setImageResource(resourceId)
//        selectedProductName.text = selectedProduct.title
//        selectedProductDescription.text = selectedProduct.price




    }
}

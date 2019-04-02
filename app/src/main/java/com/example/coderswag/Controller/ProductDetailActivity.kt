package com.example.coderswag.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.coderswag.Model.Product
import com.example.coderswag.R
import com.example.coderswag.Services.DataService
import com.example.coderswag.Utilities.EXTRA_CATEGORY
import com.example.coderswag.Utilities.EXTRA_PRODUCT
import kotlinx.android.synthetic.main.activity_product_detail.*
import kotlinx.android.synthetic.main.product_list_item.*

class ProductDetailActivity : AppCompatActivity() {

    lateinit var selectedProduct : Product

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_detail)

        val selectedProductTitle = intent.getStringExtra(EXTRA_PRODUCT)
        val selectedCategoryTitle = intent.getStringExtra(EXTRA_CATEGORY)

        selectedProduct = DataService.getSelectedProduct(selectedCategoryTitle, selectedProductTitle)
        val resourceId = resources.getIdentifier(selectedProduct.image, "drawable", packageName)
        selectedProductDetailName.text = selectedProduct.title
        selectedProductDetailImage.setImageResource(resourceId)
        selectedProductDetailDescription.text = "this ${selectedProduct.title} can be yours for ${selectedProduct.price}"
    }

    fun buyButtonClicked(view: View) {
        Toast.makeText(this, "You added a ${selectedProduct.title} to your cart for ${selectedProduct.price}", Toast.LENGTH_LONG).show()
    }
}

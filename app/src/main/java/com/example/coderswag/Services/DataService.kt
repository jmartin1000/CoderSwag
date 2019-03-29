package com.example.coderswag.Services

import com.example.coderswag.Model.Category
import com.example.coderswag.Model.Product

object DataService {


    val categories = listOf(
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL", "digitalgoodsimage")

    )

    val hats = listOf(
        Product( "Devslopes Graphic Beanie", "$18", "hat01"),
        Product( "Devslopes Hat Black", "$20", "hat02"),
        Product( "Devslopes Hat White", "$18", "hat03"),
        Product( "Devslopes Hat Snapback", "$22", "hat04")
    )

    val hoodies = listOf(
        Product( "Devslopes Graphic Beanie", "$18", "hat01"),
        Product( "Devslopes Hat Black", "$20", "hat02"),
        Product( "Devslopes Hat White", "$18", "hat03"),
        Product( "Devslopes Hat Snapback", "$22", "hat04"))

    val shirts = listOf(
        Product( "Devslopes Graphic Beanie", "$18", "hat01"),
        Product( "Devslopes Hat Black", "$20", "hat02"),
        Product( "Devslopes Hat White", "$18", "hat03"),
        Product( "Devslopes Hat Snapback", "$22", "hat04"))
}
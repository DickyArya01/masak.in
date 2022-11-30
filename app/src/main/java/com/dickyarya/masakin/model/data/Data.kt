package com.dickyarya.masakin.model.data

import android.graphics.drawable.AdaptiveIconDrawable

//Image Data
data class ImageData(
    val imageUrl: String
)

val listImageData = arrayListOf<ImageData>(
    ImageData("https://images.unsplash.com/photo-1546069901-ba9599a7e63c?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1480&q=80"),
    ImageData("https://images.unsplash.com/photo-1504674900247-0877df9cc836?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=870&q=80"),
    ImageData("https://images.unsplash.com/photo-1512621776951-a57141f2eefd?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=870&q=80"),
    )

//Category Data
data class CategoryData(
    val categoryName: String
)

val listCategoryData = arrayListOf<CategoryData>(
    CategoryData("Meat"),
    CategoryData("Vegan"),
    CategoryData("Cake"),
    CategoryData("Ice cream"),
    CategoryData("Cookies"),
)

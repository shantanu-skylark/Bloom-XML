package com.example.bloomxml

import androidx.annotation.DrawableRes

data class ListCardItem(
    @DrawableRes val resId: Int,
    val caption: String
)
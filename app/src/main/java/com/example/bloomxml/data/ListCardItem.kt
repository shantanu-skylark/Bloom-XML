package com.example.bloomxml.data

import androidx.annotation.DrawableRes

data class ListCardItem(
    @DrawableRes val resId: Int,
    val caption: String
)
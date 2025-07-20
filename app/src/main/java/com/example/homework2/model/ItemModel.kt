package com.example.homework2.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class ItemModel(
    val id: Int,
    var imageRes: Int,
    val title: String,
    val description: String
) : Parcelable
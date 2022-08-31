package com.axiel7.mydrobe.models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Clothing(
    @PrimaryKey(autoGenerate = true) var id: Int = 0,
    var name: String,
    @ColumnInfo(name = "photoUri") var photoUri: String? = null,
    var colors: MutableList<String> = mutableListOf(),
    var type: MutableList<Category> = mutableListOf(Category.NONE),
    var material: MutableList<Materials> = mutableListOf(Materials.NONE),
    var price: Int,
    var isFavorite: Boolean,
    var seasons: MutableList<Season> = mutableListOf(Season.NONE),
    var lastUsed: Long = 0
)

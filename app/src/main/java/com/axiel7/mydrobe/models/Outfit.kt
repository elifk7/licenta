package com.axiel7.mydrobe.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Outfit(
    @PrimaryKey(autoGenerate = true) var id: Int = 0,
    var name: String,
    var top: String,
    var topPhotoUri: String? = null,
    var bottom: String,
    var bottomPhotoUri: String? = null,
    var shoes: String,
    var shoesPhotoUri: String? = null,
    var season: MutableList<Season> = mutableListOf(Season.NONE),
    var data: String
)
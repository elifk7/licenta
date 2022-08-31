package com.axiel7.mydrobe.repository

import com.axiel7.mydrobe.models.Outfit
import com.axiel7.mydrobe.room.OutfitDao

class OutfitRepository(private val outfitDao: OutfitDao) {

    fun getOutfits(order: String) = outfitDao.getOutfits(order)

    suspend fun createOutfit(outfit: Outfit) {
        outfitDao.addOutfit(outfit)
    }

    suspend fun updateOutfit(outfit: Outfit) {
        outfitDao.updateOutfit(outfit)
    }

    suspend fun removeOutfit(outfit: Outfit) {
        outfitDao.removeOutfit(outfit)
    }
    
}
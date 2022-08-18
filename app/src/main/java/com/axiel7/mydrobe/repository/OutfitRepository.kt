package com.axiel7.mydrobe.repository

import com.axiel7.mydrobe.models.Outfit
import com.axiel7.mydrobe.room.OutfitDao

class OutfitRepository(private val outfitDao: OutfitDao) {
    
    fun getOutfits() = outfitDao.getOutfits()

    fun getOutfits(order: String) = outfitDao.getOutfits(order)
    
    fun getItemById(id: Int) = outfitDao.getItemById(id)
    
    fun searchTop(top: String) = outfitDao.searchTop(top)
    
    fun searchBottom(bottom: String) = outfitDao.searchTop(bottom)
    
    fun searchShoes(shoes: String) = outfitDao.searchTop(shoes)
    
    fun getOutfitsBySeason(season: String) = outfitDao.getOutfitsBySeason(season)

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
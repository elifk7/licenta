package com.axiel7.mydrobe.room

import androidx.room.*
import com.axiel7.mydrobe.models.Clothing
import com.axiel7.mydrobe.models.Outfit
import kotlinx.coroutines.flow.Flow

@Dao
interface OutfitDao {
    @Query("SELECT * FROM outfit")
    fun getOutfits(): Flow<List<Outfit>>

    @Query("SELECT * FROM outfit ORDER BY CASE WHEN :order = 'id' THEN id END DESC, CASE WHEN :order = 'name' THEN name END")
    fun getOutfits(order: String): Flow<List<Outfit>>

    @Query("SELECT * FROM outfit WHERE id=:id")
    fun getItemById(id: Int): Flow<Outfit>

    @Query("SELECT * FROM outfit WHERE LOWER(top) LIKE LOWER(:top)")
    fun searchTop(top: String): Flow<List<Outfit>>

    @Query("SELECT * FROM outfit WHERE LOWER(bottom) LIKE LOWER(:bottom)")
    fun searchBottom(bottom: String): Flow<List<Outfit>>

    @Query("SELECT * FROM outfit WHERE LOWER(shoes) LIKE LOWER(:shoes)")
    fun searchShoes(shoes: String): Flow<List<Outfit>>

    @Query("SELECT * FROM outfit WHERE season LIKE :season")
    fun getOutfitsBySeason(season: String): Flow<List<Clothing>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addOutfit(outfit: Outfit?)

    @Update
    suspend fun updateOutfit(outfit: Outfit?)

    @Delete
    suspend fun removeOutfit(outfit: Outfit)
}
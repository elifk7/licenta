package com.axiel7.mydrobe.room;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\bg\u0018\u00002\u00020\u0001J\u001b\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\b2\u0006\u0010\t\u001a\u00020\nH\'J\u0014\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\f0\bH\'J\u001c\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\f0\b2\u0006\u0010\r\u001a\u00020\u000eH\'J\u001c\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\f0\b2\u0006\u0010\u0010\u001a\u00020\u000eH\'J\u0019\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u001c\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\f0\b2\u0006\u0010\u0013\u001a\u00020\u000eH\'J\u001c\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\f0\b2\u0006\u0010\u0015\u001a\u00020\u000eH\'J\u001c\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\f0\b2\u0006\u0010\u0017\u001a\u00020\u000eH\'J\u001b\u0010\u0018\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0019"}, d2 = {"Lcom/axiel7/mydrobe/room/OutfitDao;", "", "addOutfit", "", "outfit", "Lcom/axiel7/mydrobe/models/Outfit;", "(Lcom/axiel7/mydrobe/models/Outfit;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getItemById", "Lkotlinx/coroutines/flow/Flow;", "id", "", "getOutfits", "", "order", "", "getOutfitsBySeason", "season", "removeOutfit", "searchBottom", "bottom", "searchShoes", "shoes", "searchTop", "top", "updateOutfit", "app_debug"})
public abstract interface OutfitDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM outfit")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.axiel7.mydrobe.models.Outfit>> getOutfits();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM outfit ORDER BY CASE WHEN :order = \'id\' THEN id END DESC, CASE WHEN :order = \'name\' THEN name END")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.axiel7.mydrobe.models.Outfit>> getOutfits(@org.jetbrains.annotations.NotNull()
    java.lang.String order);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM outfit WHERE id=:id")
    public abstract kotlinx.coroutines.flow.Flow<com.axiel7.mydrobe.models.Outfit> getItemById(int id);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM outfit WHERE LOWER(top) LIKE LOWER(:top)")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.axiel7.mydrobe.models.Outfit>> searchTop(@org.jetbrains.annotations.NotNull()
    java.lang.String top);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM outfit WHERE LOWER(bottom) LIKE LOWER(:bottom)")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.axiel7.mydrobe.models.Outfit>> searchBottom(@org.jetbrains.annotations.NotNull()
    java.lang.String bottom);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM outfit WHERE LOWER(shoes) LIKE LOWER(:shoes)")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.axiel7.mydrobe.models.Outfit>> searchShoes(@org.jetbrains.annotations.NotNull()
    java.lang.String shoes);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM outfit WHERE season LIKE :season")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.axiel7.mydrobe.models.Outfit>> getOutfitsBySeason(@org.jetbrains.annotations.NotNull()
    java.lang.String season);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract java.lang.Object addOutfit(@org.jetbrains.annotations.Nullable()
    com.axiel7.mydrobe.models.Outfit outfit, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Update()
    public abstract java.lang.Object updateOutfit(@org.jetbrains.annotations.Nullable()
    com.axiel7.mydrobe.models.Outfit outfit, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Delete()
    public abstract java.lang.Object removeOutfit(@org.jetbrains.annotations.NotNull()
    com.axiel7.mydrobe.models.Outfit outfit, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
}
package com.axiel7.mydrobe.room;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\u001b\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0014\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\t0\bH\'J\u001c\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\'J\u001c\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\t0\b2\u0006\u0010\r\u001a\u00020\u000bH\'J$\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\t0\b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000bH\'J\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\b2\u0006\u0010\u000f\u001a\u00020\u0010H\'J\u0019\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u001c\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\t0\b2\u0006\u0010\u0013\u001a\u00020\u000bH\'J\u001b\u0010\u0014\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0015"}, d2 = {"Lcom/axiel7/mydrobe/room/ClothesDao;", "", "addClothing", "", "clothing", "Lcom/axiel7/mydrobe/models/Clothing;", "(Lcom/axiel7/mydrobe/models/Clothing;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getClothes", "Lkotlinx/coroutines/flow/Flow;", "", "order", "", "getClothesBySeason", "season", "getItemById", "id", "", "removeClothing", "searchClothes", "query", "updateClothing", "app_debug"})
public abstract interface ClothesDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM clothing")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.axiel7.mydrobe.models.Clothing>> getClothes();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM clothing ORDER BY CASE WHEN :order = \'id\' THEN id END DESC, CASE WHEN :order = \'name\' THEN name END")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.axiel7.mydrobe.models.Clothing>> getClothes(@org.jetbrains.annotations.NotNull()
    java.lang.String order);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM clothing WHERE id=:id")
    public abstract kotlinx.coroutines.flow.Flow<com.axiel7.mydrobe.models.Clothing> getItemById(int id);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM clothing WHERE LOWER(name) LIKE LOWER(:query)")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.axiel7.mydrobe.models.Clothing>> searchClothes(@org.jetbrains.annotations.NotNull()
    java.lang.String query);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM clothing WHERE seasons LIKE :season")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.axiel7.mydrobe.models.Clothing>> getClothesBySeason(@org.jetbrains.annotations.NotNull()
    java.lang.String season);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM clothing WHERE seasons LIKE :season ORDER BY CASE WHEN :order = \'id\' THEN id END DESC, CASE WHEN :order = \'name\' THEN name END")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.axiel7.mydrobe.models.Clothing>> getClothesBySeason(@org.jetbrains.annotations.NotNull()
    java.lang.String season, @org.jetbrains.annotations.NotNull()
    java.lang.String order);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract java.lang.Object addClothing(@org.jetbrains.annotations.Nullable()
    com.axiel7.mydrobe.models.Clothing clothing, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Update()
    public abstract java.lang.Object updateClothing(@org.jetbrains.annotations.Nullable()
    com.axiel7.mydrobe.models.Clothing clothing, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Delete()
    public abstract java.lang.Object removeClothing(@org.jetbrains.annotations.NotNull()
    com.axiel7.mydrobe.models.Clothing clothing, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
}
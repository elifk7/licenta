package com.axiel7.mydrobe.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u001a\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\f0\u000b2\u0006\u0010\r\u001a\u00020\u000eJ\"\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\f0\u000b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eJ\u0012\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\f0\u000bJ\u001a\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\f0\u000b2\u0006\u0010\u000f\u001a\u00020\u000eJ\u0019\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u001a\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\f0\u000b2\u0006\u0010\u0013\u001a\u00020\u000eJ\u0019\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0015"}, d2 = {"Lcom/axiel7/mydrobe/repository/ClothesRepository;", "", "clothesDao", "Lcom/axiel7/mydrobe/room/ClothesDao;", "(Lcom/axiel7/mydrobe/room/ClothesDao;)V", "createClothing", "", "clothing", "Lcom/axiel7/mydrobe/models/Clothing;", "(Lcom/axiel7/mydrobe/models/Clothing;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getClothesBySeason", "Lkotlinx/coroutines/flow/Flow;", "", "season", "", "order", "getClothing", "removeClothing", "searchClothing", "query", "updateClothing", "app_debug"})
public final class ClothesRepository {
    private final com.axiel7.mydrobe.room.ClothesDao clothesDao = null;
    
    public ClothesRepository(@org.jetbrains.annotations.NotNull()
    com.axiel7.mydrobe.room.ClothesDao clothesDao) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.axiel7.mydrobe.models.Clothing>> getClothing() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.axiel7.mydrobe.models.Clothing>> getClothing(@org.jetbrains.annotations.NotNull()
    java.lang.String order) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.axiel7.mydrobe.models.Clothing>> searchClothing(@org.jetbrains.annotations.NotNull()
    java.lang.String query) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.axiel7.mydrobe.models.Clothing>> getClothesBySeason(@org.jetbrains.annotations.NotNull()
    java.lang.String season) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.axiel7.mydrobe.models.Clothing>> getClothesBySeason(@org.jetbrains.annotations.NotNull()
    java.lang.String season, @org.jetbrains.annotations.NotNull()
    java.lang.String order) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object createClothing(@org.jetbrains.annotations.NotNull()
    com.axiel7.mydrobe.models.Clothing clothing, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object updateClothing(@org.jetbrains.annotations.NotNull()
    com.axiel7.mydrobe.models.Clothing clothing, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object removeClothing(@org.jetbrains.annotations.NotNull()
    com.axiel7.mydrobe.models.Clothing clothing, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
}
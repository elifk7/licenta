package com.axiel7.mydrobe.room;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0007J\u001c\u0010\t\u001a\u0004\u0018\u00010\u00062\u0010\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\nH\u0007J\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0010\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\nH\u0007J\u001c\u0010\r\u001a\u0004\u0018\u00010\u00062\u0010\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\nH\u0007J\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00062\u0010\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\nH\u0007J\u0014\u0010\u0010\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\fH\u0007J\u0014\u0010\u0011\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u000eH\u0007J\u0014\u0010\u0012\u001a\u0004\u0018\u00010\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0006H\u0007J\u001c\u0010\u0014\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0006H\u0007J\u001c\u0010\u0015\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0006H\u0007J\u001c\u0010\u0016\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0006H\u0007J\u001c\u0010\u0017\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0006H\u0007J\u0014\u0010\u0018\u001a\u0004\u0018\u00010\f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0006H\u0007J\u0014\u0010\u0019\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0006H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/axiel7/mydrobe/room/TypeConverters;", "", "()V", "gson", "Lcom/google/gson/Gson;", "categoryToString", "", "someObject", "Lcom/axiel7/mydrobe/models/Category;", "listCategoryToString", "", "listMaterialToString", "Lcom/axiel7/mydrobe/models/Materials;", "listSeasonToString", "Lcom/axiel7/mydrobe/models/Season;", "listStringToString", "materialToString", "seasonToString", "stringToCategory", "data", "stringToListCatgory", "stringToListMaterial", "stringToListSeason", "stringToListString", "stringToMaterial", "stringToSeason", "app_debug"})
public final class TypeConverters {
    private final com.google.gson.Gson gson = null;
    
    public TypeConverters() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.TypeConverter()
    public final com.axiel7.mydrobe.models.Season stringToSeason(@org.jetbrains.annotations.Nullable()
    java.lang.String data) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.TypeConverter()
    public final java.lang.String seasonToString(@org.jetbrains.annotations.Nullable()
    com.axiel7.mydrobe.models.Season someObject) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.TypeConverter()
    public final java.util.List<com.axiel7.mydrobe.models.Season> stringToListSeason(@org.jetbrains.annotations.Nullable()
    java.lang.String data) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.TypeConverter()
    public final java.lang.String listSeasonToString(@org.jetbrains.annotations.Nullable()
    java.util.List<? extends com.axiel7.mydrobe.models.Season> someObject) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.TypeConverter()
    public final java.util.List<java.lang.String> stringToListString(@org.jetbrains.annotations.Nullable()
    java.lang.String data) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.TypeConverter()
    public final java.lang.String listStringToString(@org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> someObject) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.TypeConverter()
    public final com.axiel7.mydrobe.models.Category stringToCategory(@org.jetbrains.annotations.Nullable()
    java.lang.String data) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.TypeConverter()
    public final java.lang.String categoryToString(@org.jetbrains.annotations.Nullable()
    com.axiel7.mydrobe.models.Category someObject) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.TypeConverter()
    public final java.util.List<com.axiel7.mydrobe.models.Category> stringToListCatgory(@org.jetbrains.annotations.Nullable()
    java.lang.String data) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.TypeConverter()
    public final java.lang.String listCategoryToString(@org.jetbrains.annotations.Nullable()
    java.util.List<? extends com.axiel7.mydrobe.models.Category> someObject) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.TypeConverter()
    public final com.axiel7.mydrobe.models.Materials stringToMaterial(@org.jetbrains.annotations.Nullable()
    java.lang.String data) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.TypeConverter()
    public final java.lang.String materialToString(@org.jetbrains.annotations.Nullable()
    com.axiel7.mydrobe.models.Materials someObject) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.TypeConverter()
    public final java.util.List<com.axiel7.mydrobe.models.Materials> stringToListMaterial(@org.jetbrains.annotations.Nullable()
    java.lang.String data) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.TypeConverter()
    public final java.lang.String listMaterialToString(@org.jetbrains.annotations.Nullable()
    java.util.List<? extends com.axiel7.mydrobe.models.Materials> someObject) {
        return null;
    }
}
package com.axiel7.mydrobe.room;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0010\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\bH\u0007J\u001c\u0010\n\u001a\u0004\u0018\u00010\u00062\u0010\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\bH\u0007J\u0014\u0010\u000b\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\tH\u0007J\u001c\u0010\f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\b2\b\u0010\r\u001a\u0004\u0018\u00010\u0006H\u0007J\u001c\u0010\u000e\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\b2\b\u0010\r\u001a\u0004\u0018\u00010\u0006H\u0007J\u0014\u0010\u000f\u001a\u0004\u0018\u00010\t2\b\u0010\r\u001a\u0004\u0018\u00010\u0006H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/axiel7/mydrobe/room/TypeConverters;", "", "()V", "gson", "Lcom/google/gson/Gson;", "listSeasonToString", "", "someObject", "", "Lcom/axiel7/mydrobe/models/Season;", "listStringToString", "seasonToString", "stringToListSeason", "data", "stringToListString", "stringToSeason", "app_debug"})
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
}
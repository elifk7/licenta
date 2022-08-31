package com.axiel7.mydrobe.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u001a\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\f0\u000b2\u0006\u0010\r\u001a\u00020\u000eJ\u0019\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0019\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0011"}, d2 = {"Lcom/axiel7/mydrobe/repository/OutfitRepository;", "", "outfitDao", "Lcom/axiel7/mydrobe/room/OutfitDao;", "(Lcom/axiel7/mydrobe/room/OutfitDao;)V", "createOutfit", "", "outfit", "Lcom/axiel7/mydrobe/models/Outfit;", "(Lcom/axiel7/mydrobe/models/Outfit;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getOutfits", "Lkotlinx/coroutines/flow/Flow;", "", "order", "", "removeOutfit", "updateOutfit", "app_debug"})
public final class OutfitRepository {
    private final com.axiel7.mydrobe.room.OutfitDao outfitDao = null;
    
    public OutfitRepository(@org.jetbrains.annotations.NotNull()
    com.axiel7.mydrobe.room.OutfitDao outfitDao) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.axiel7.mydrobe.models.Outfit>> getOutfits(@org.jetbrains.annotations.NotNull()
    java.lang.String order) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object createOutfit(@org.jetbrains.annotations.NotNull()
    com.axiel7.mydrobe.models.Outfit outfit, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object updateOutfit(@org.jetbrains.annotations.NotNull()
    com.axiel7.mydrobe.models.Outfit outfit, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object removeOutfit(@org.jetbrains.annotations.NotNull()
    com.axiel7.mydrobe.models.Outfit outfit, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
}
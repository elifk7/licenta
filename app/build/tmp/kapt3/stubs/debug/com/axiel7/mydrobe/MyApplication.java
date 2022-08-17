package com.axiel7.mydrobe;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \b2\u00020\u00012\u00020\u0002:\u0001\bB\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0007H\u0016\u00a8\u0006\t"}, d2 = {"Lcom/axiel7/mydrobe/MyApplication;", "Landroid/app/Application;", "Lcoil/ImageLoaderFactory;", "()V", "newImageLoader", "Lcoil/ImageLoader;", "onCreate", "", "Companion", "app_debug"})
public final class MyApplication extends android.app.Application implements coil.ImageLoaderFactory {
    @org.jetbrains.annotations.NotNull()
    public static final com.axiel7.mydrobe.MyApplication.Companion Companion = null;
    public static com.axiel7.mydrobe.room.DrobeDatabase drobeDb;
    public static com.axiel7.mydrobe.repository.ClothesRepository clothesRepository;
    
    public MyApplication() {
        super();
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public coil.ImageLoader newImageLoader() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u000f"}, d2 = {"Lcom/axiel7/mydrobe/MyApplication$Companion;", "", "()V", "clothesRepository", "Lcom/axiel7/mydrobe/repository/ClothesRepository;", "getClothesRepository", "()Lcom/axiel7/mydrobe/repository/ClothesRepository;", "setClothesRepository", "(Lcom/axiel7/mydrobe/repository/ClothesRepository;)V", "drobeDb", "Lcom/axiel7/mydrobe/room/DrobeDatabase;", "getDrobeDb", "()Lcom/axiel7/mydrobe/room/DrobeDatabase;", "setDrobeDb", "(Lcom/axiel7/mydrobe/room/DrobeDatabase;)V", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.axiel7.mydrobe.room.DrobeDatabase getDrobeDb() {
            return null;
        }
        
        public final void setDrobeDb(@org.jetbrains.annotations.NotNull()
        com.axiel7.mydrobe.room.DrobeDatabase p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.axiel7.mydrobe.repository.ClothesRepository getClothesRepository() {
            return null;
        }
        
        public final void setClothesRepository(@org.jetbrains.annotations.NotNull()
        com.axiel7.mydrobe.repository.ClothesRepository p0) {
        }
    }
}
package com.axiel7.mydrobe.models;

import java.lang.System;

@androidx.room.Entity()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b.\b\u0087\b\u0018\u00002\u00020\u0001B}\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\b\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\b\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\b\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\b\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013\u00a2\u0006\u0002\u0010\u0014J\t\u00102\u001a\u00020\u0003H\u00c6\u0003J\t\u00103\u001a\u00020\u0013H\u00c6\u0003J\t\u00104\u001a\u00020\u0005H\u00c6\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000f\u00106\u001a\b\u0012\u0004\u0012\u00020\u00050\bH\u00c6\u0003J\u000f\u00107\u001a\b\u0012\u0004\u0012\u00020\n0\bH\u00c6\u0003J\u000f\u00108\u001a\b\u0012\u0004\u0012\u00020\f0\bH\u00c6\u0003J\t\u00109\u001a\u00020\u0003H\u00c6\u0003J\t\u0010:\u001a\u00020\u000fH\u00c6\u0003J\u000f\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00110\bH\u00c6\u0003J\u0087\u0001\u0010<\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\b2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\b2\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\b2\b\b\u0002\u0010\u0012\u001a\u00020\u0013H\u00c6\u0001J\u0013\u0010=\u001a\u00020\u000f2\b\u0010>\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010?\u001a\u00020\u0003H\u00d6\u0001J\t\u0010@\u001a\u00020\u0005H\u00d6\u0001R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0016\"\u0004\b%\u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\'\"\u0004\b(\u0010)R \u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\'\"\u0004\b+\u0010)R\u001a\u0010\r\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u001a\"\u0004\b-\u0010\u001cR \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0016\"\u0004\b/\u0010\u0018R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u0016\"\u0004\b1\u0010\u0018\u00a8\u0006A"}, d2 = {"Lcom/axiel7/mydrobe/models/Clothing;", "", "id", "", "name", "", "photoUri", "colors", "", "type", "Lcom/axiel7/mydrobe/models/Category;", "material", "Lcom/axiel7/mydrobe/models/Materials;", "price", "isFavorite", "", "seasons", "Lcom/axiel7/mydrobe/models/Season;", "lastUsed", "", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;IZLjava/util/List;J)V", "getColors", "()Ljava/util/List;", "setColors", "(Ljava/util/List;)V", "getId", "()I", "setId", "(I)V", "()Z", "setFavorite", "(Z)V", "getLastUsed", "()J", "setLastUsed", "(J)V", "getMaterial", "setMaterial", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getPhotoUri", "setPhotoUri", "getPrice", "setPrice", "getSeasons", "setSeasons", "getType", "setType", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "app_debug"})
public final class Clothing {
    @androidx.room.PrimaryKey(autoGenerate = true)
    private int id;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String name;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "photoUri")
    private java.lang.String photoUri;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<java.lang.String> colors;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.axiel7.mydrobe.models.Category> type;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.axiel7.mydrobe.models.Materials> material;
    private int price;
    private boolean isFavorite;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.axiel7.mydrobe.models.Season> seasons;
    private long lastUsed;
    
    @org.jetbrains.annotations.NotNull()
    public final com.axiel7.mydrobe.models.Clothing copy(int id, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    java.lang.String photoUri, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> colors, @org.jetbrains.annotations.NotNull()
    java.util.List<com.axiel7.mydrobe.models.Category> type, @org.jetbrains.annotations.NotNull()
    java.util.List<com.axiel7.mydrobe.models.Materials> material, int price, boolean isFavorite, @org.jetbrains.annotations.NotNull()
    java.util.List<com.axiel7.mydrobe.models.Season> seasons, long lastUsed) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public Clothing(int id, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    java.lang.String photoUri, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> colors, @org.jetbrains.annotations.NotNull()
    java.util.List<com.axiel7.mydrobe.models.Category> type, @org.jetbrains.annotations.NotNull()
    java.util.List<com.axiel7.mydrobe.models.Materials> material, int price, boolean isFavorite, @org.jetbrains.annotations.NotNull()
    java.util.List<com.axiel7.mydrobe.models.Season> seasons, long lastUsed) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    public final int getId() {
        return 0;
    }
    
    public final void setId(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    public final void setName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPhotoUri() {
        return null;
    }
    
    public final void setPhotoUri(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getColors() {
        return null;
    }
    
    public final void setColors(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.axiel7.mydrobe.models.Category> component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.axiel7.mydrobe.models.Category> getType() {
        return null;
    }
    
    public final void setType(@org.jetbrains.annotations.NotNull()
    java.util.List<com.axiel7.mydrobe.models.Category> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.axiel7.mydrobe.models.Materials> component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.axiel7.mydrobe.models.Materials> getMaterial() {
        return null;
    }
    
    public final void setMaterial(@org.jetbrains.annotations.NotNull()
    java.util.List<com.axiel7.mydrobe.models.Materials> p0) {
    }
    
    public final int component7() {
        return 0;
    }
    
    public final int getPrice() {
        return 0;
    }
    
    public final void setPrice(int p0) {
    }
    
    public final boolean component8() {
        return false;
    }
    
    public final boolean isFavorite() {
        return false;
    }
    
    public final void setFavorite(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.axiel7.mydrobe.models.Season> component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.axiel7.mydrobe.models.Season> getSeasons() {
        return null;
    }
    
    public final void setSeasons(@org.jetbrains.annotations.NotNull()
    java.util.List<com.axiel7.mydrobe.models.Season> p0) {
    }
    
    public final long component10() {
        return 0L;
    }
    
    public final long getLastUsed() {
        return 0L;
    }
    
    public final void setLastUsed(long p0) {
    }
}
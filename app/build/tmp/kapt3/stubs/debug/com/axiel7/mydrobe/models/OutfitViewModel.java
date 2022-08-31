package com.axiel7.mydrobe.models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\nJ\u000e\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\nJ\u0010\u0010\u0018\u001a\u00020\u00152\b\u0010\u0019\u001a\u0004\u0018\u00010\nJ\u000e\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u0007J\u000e\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\nR\u001c\u0010\u0005\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R&\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\r0\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000f\u00a8\u0006\u001e"}, d2 = {"Lcom/axiel7/mydrobe/models/OutfitViewModel;", "Landroidx/lifecycle/ViewModel;", "outfitRepository", "Lcom/axiel7/mydrobe/repository/OutfitRepository;", "(Lcom/axiel7/mydrobe/repository/OutfitRepository;)V", "_order", "Landroidx/lifecycle/MutableLiveData;", "", "kotlin.jvm.PlatformType", "_selectedItem", "Lcom/axiel7/mydrobe/models/Outfit;", "outfits", "Landroidx/lifecycle/LiveData;", "", "getOutfits", "()Landroidx/lifecycle/LiveData;", "setOutfits", "(Landroidx/lifecycle/LiveData;)V", "selectedItem", "getSelectedItem", "addOutfit", "", "outfit", "deleteOutfit", "selectItem", "item", "setOrder", "sort", "updateOutfit", "Companion", "app_debug"})
public final class OutfitViewModel extends androidx.lifecycle.ViewModel {
    private final com.axiel7.mydrobe.repository.OutfitRepository outfitRepository = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> _order = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.LiveData<java.util.List<com.axiel7.mydrobe.models.Outfit>> outfits;
    @org.jetbrains.annotations.NotNull()
    public static final com.axiel7.mydrobe.models.OutfitViewModel.Companion Companion = null;
    private final androidx.lifecycle.MutableLiveData<com.axiel7.mydrobe.models.Outfit> _selectedItem = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.axiel7.mydrobe.models.Outfit> selectedItem = null;
    
    public OutfitViewModel(@org.jetbrains.annotations.NotNull()
    com.axiel7.mydrobe.repository.OutfitRepository outfitRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.axiel7.mydrobe.models.Outfit>> getOutfits() {
        return null;
    }
    
    public final void setOutfits(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<java.util.List<com.axiel7.mydrobe.models.Outfit>> p0) {
    }
    
    public final void addOutfit(@org.jetbrains.annotations.NotNull()
    com.axiel7.mydrobe.models.Outfit outfit) {
    }
    
    public final void updateOutfit(@org.jetbrains.annotations.NotNull()
    com.axiel7.mydrobe.models.Outfit outfit) {
    }
    
    public final void deleteOutfit(@org.jetbrains.annotations.NotNull()
    com.axiel7.mydrobe.models.Outfit outfit) {
    }
    
    public final void setOrder(@org.jetbrains.annotations.NotNull()
    java.lang.String sort) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.axiel7.mydrobe.models.Outfit> getSelectedItem() {
        return null;
    }
    
    public final void selectItem(@org.jetbrains.annotations.Nullable()
    com.axiel7.mydrobe.models.Outfit item) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/axiel7/mydrobe/models/OutfitViewModel$Companion;", "", "()V", "provideFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "outfitRepository", "Lcom/axiel7/mydrobe/repository/OutfitRepository;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.lifecycle.ViewModelProvider.Factory provideFactory(@org.jetbrains.annotations.NotNull()
        com.axiel7.mydrobe.repository.OutfitRepository outfitRepository) {
            return null;
        }
    }
}
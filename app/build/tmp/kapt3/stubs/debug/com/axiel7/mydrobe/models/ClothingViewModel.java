package com.axiel7.mydrobe.models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0007J\u000e\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0007J\u0010\u0010\u0013\u001a\u00020\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u0007J\u000e\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0007R\u0016\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\n0\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0019\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f\u00a8\u0006\u0017"}, d2 = {"Lcom/axiel7/mydrobe/models/ClothingViewModel;", "Landroidx/lifecycle/ViewModel;", "clothesRepository", "Lcom/axiel7/mydrobe/repository/ClothesRepository;", "(Lcom/axiel7/mydrobe/repository/ClothesRepository;)V", "_selectedItem", "Landroidx/lifecycle/MutableLiveData;", "Lcom/axiel7/mydrobe/models/Clothing;", "clothes", "Landroidx/lifecycle/LiveData;", "", "getClothes", "()Landroidx/lifecycle/LiveData;", "selectedItem", "getSelectedItem", "addClothing", "", "clothing", "deleteClothing", "selectItem", "item", "updateClothing", "Companion", "app_debug"})
public final class ClothingViewModel extends androidx.lifecycle.ViewModel {
    private final com.axiel7.mydrobe.repository.ClothesRepository clothesRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.axiel7.mydrobe.models.Clothing>> clothes = null;
    private final androidx.lifecycle.MutableLiveData<com.axiel7.mydrobe.models.Clothing> _selectedItem = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.axiel7.mydrobe.models.Clothing> selectedItem = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.axiel7.mydrobe.models.ClothingViewModel.Companion Companion = null;
    
    public ClothingViewModel(@org.jetbrains.annotations.NotNull()
    com.axiel7.mydrobe.repository.ClothesRepository clothesRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.axiel7.mydrobe.models.Clothing>> getClothes() {
        return null;
    }
    
    public final void addClothing(@org.jetbrains.annotations.NotNull()
    com.axiel7.mydrobe.models.Clothing clothing) {
    }
    
    public final void updateClothing(@org.jetbrains.annotations.NotNull()
    com.axiel7.mydrobe.models.Clothing clothing) {
    }
    
    public final void deleteClothing(@org.jetbrains.annotations.NotNull()
    com.axiel7.mydrobe.models.Clothing clothing) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.axiel7.mydrobe.models.Clothing> getSelectedItem() {
        return null;
    }
    
    public final void selectItem(@org.jetbrains.annotations.Nullable()
    com.axiel7.mydrobe.models.Clothing item) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/axiel7/mydrobe/models/ClothingViewModel$Companion;", "", "()V", "provideFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "clothesRepository", "Lcom/axiel7/mydrobe/repository/ClothesRepository;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.lifecycle.ViewModelProvider.Factory provideFactory(@org.jetbrains.annotations.NotNull()
        com.axiel7.mydrobe.repository.ClothesRepository clothesRepository) {
            return null;
        }
    }
}
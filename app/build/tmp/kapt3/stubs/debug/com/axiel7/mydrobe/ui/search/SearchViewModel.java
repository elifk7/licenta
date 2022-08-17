package com.axiel7.mydrobe.ui.search;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0007R\u001c\u0010\u0005\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R&\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/axiel7/mydrobe/ui/search/SearchViewModel;", "Landroidx/lifecycle/ViewModel;", "clothesRepository", "Lcom/axiel7/mydrobe/repository/ClothesRepository;", "(Lcom/axiel7/mydrobe/repository/ClothesRepository;)V", "_query", "Landroidx/lifecycle/MutableLiveData;", "", "kotlin.jvm.PlatformType", "clothes", "Landroidx/lifecycle/LiveData;", "", "Lcom/axiel7/mydrobe/models/Clothing;", "getClothes", "()Landroidx/lifecycle/LiveData;", "setClothes", "(Landroidx/lifecycle/LiveData;)V", "search", "", "query", "Companion", "app_debug"})
public final class SearchViewModel extends androidx.lifecycle.ViewModel {
    private final com.axiel7.mydrobe.repository.ClothesRepository clothesRepository = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.LiveData<java.util.List<com.axiel7.mydrobe.models.Clothing>> clothes;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> _query = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.axiel7.mydrobe.ui.search.SearchViewModel.Companion Companion = null;
    
    public SearchViewModel(@org.jetbrains.annotations.NotNull()
    com.axiel7.mydrobe.repository.ClothesRepository clothesRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.axiel7.mydrobe.models.Clothing>> getClothes() {
        return null;
    }
    
    public final void setClothes(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<java.util.List<com.axiel7.mydrobe.models.Clothing>> p0) {
    }
    
    public final void search(@org.jetbrains.annotations.NotNull()
    java.lang.String query) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/axiel7/mydrobe/ui/search/SearchViewModel$Companion;", "", "()V", "provideFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "clothesRepository", "Lcom/axiel7/mydrobe/repository/ClothesRepository;", "app_debug"})
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
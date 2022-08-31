package com.axiel7.mydrobe.ui.today;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0007R\u001c\u0010\u0005\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0013"}, d2 = {"Lcom/axiel7/mydrobe/ui/today/TodayViewModel;", "Landroidx/lifecycle/ViewModel;", "outfitRepository", "Lcom/axiel7/mydrobe/repository/OutfitRepository;", "(Lcom/axiel7/mydrobe/repository/OutfitRepository;)V", "_order", "Landroidx/lifecycle/MutableLiveData;", "", "kotlin.jvm.PlatformType", "outfits", "Landroidx/lifecycle/LiveData;", "", "Lcom/axiel7/mydrobe/models/Outfit;", "getOutfits", "()Landroidx/lifecycle/LiveData;", "setOrder", "", "sort", "Companion", "app_debug"})
public final class TodayViewModel extends androidx.lifecycle.ViewModel {
    private final com.axiel7.mydrobe.repository.OutfitRepository outfitRepository = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> _order = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.axiel7.mydrobe.models.Outfit>> outfits = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.axiel7.mydrobe.ui.today.TodayViewModel.Companion Companion = null;
    
    public TodayViewModel(@org.jetbrains.annotations.NotNull()
    com.axiel7.mydrobe.repository.OutfitRepository outfitRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.axiel7.mydrobe.models.Outfit>> getOutfits() {
        return null;
    }
    
    public final void setOrder(@org.jetbrains.annotations.NotNull()
    java.lang.String sort) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/axiel7/mydrobe/ui/today/TodayViewModel$Companion;", "", "()V", "provideFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "outfitRepository", "Lcom/axiel7/mydrobe/repository/OutfitRepository;", "app_debug"})
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
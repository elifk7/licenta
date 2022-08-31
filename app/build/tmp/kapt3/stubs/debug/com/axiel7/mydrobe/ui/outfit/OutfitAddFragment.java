package com.axiel7.mydrobe.ui.outfit;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\"\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\u0010\u0010&\u001a\u00020 2\u0006\u0010\'\u001a\u00020\u001cH\u0016J\u0012\u0010(\u001a\u00020 2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J$\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u0001002\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\b\u00101\u001a\u00020 H\u0016J\u001a\u00102\u001a\u00020 2\u0006\u00103\u001a\u00020,2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\b\u00104\u001a\u00020 H\u0002J\b\u00105\u001a\u00020 H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001a\u0010\u000f\u001a\u0004\b\u0018\u0010\u0019R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u00066"}, d2 = {"Lcom/axiel7/mydrobe/ui/outfit/OutfitAddFragment;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "()V", "_binding", "Lcom/axiel7/mydrobe/databinding/OutfitItemAddBinding;", "binding", "getBinding", "()Lcom/axiel7/mydrobe/databinding/OutfitItemAddBinding;", "bottomViewPagerAdapter", "Lcom/axiel7/mydrobe/adapters/ViewPagerAdapter;", "clothingViewModel", "Lcom/axiel7/mydrobe/models/ClothingViewModel;", "getClothingViewModel", "()Lcom/axiel7/mydrobe/models/ClothingViewModel;", "clothingViewModel$delegate", "Lkotlin/Lazy;", "currentPhotoPath", "", "isNewItem", "", "newItem", "Lcom/axiel7/mydrobe/models/Outfit;", "outfitViewModel", "Lcom/axiel7/mydrobe/models/OutfitViewModel;", "getOutfitViewModel", "()Lcom/axiel7/mydrobe/models/OutfitViewModel;", "outfitViewModel$delegate", "safeContext", "Landroid/content/Context;", "shoesViewPagerAdapter", "topViewPagerAdapter", "onActivityResult", "", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onAttach", "context", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroy", "onViewCreated", "view", "saveItem", "setUpViewPager", "app_debug"})
public final class OutfitAddFragment extends com.google.android.material.bottomsheet.BottomSheetDialogFragment {
    private final kotlin.Lazy outfitViewModel$delegate = null;
    private final kotlin.Lazy clothingViewModel$delegate = null;
    private com.axiel7.mydrobe.databinding.OutfitItemAddBinding _binding;
    private boolean isNewItem = false;
    private com.axiel7.mydrobe.models.Outfit newItem;
    private android.content.Context safeContext;
    private java.lang.String currentPhotoPath = "";
    private com.axiel7.mydrobe.adapters.ViewPagerAdapter topViewPagerAdapter;
    private com.axiel7.mydrobe.adapters.ViewPagerAdapter bottomViewPagerAdapter;
    private com.axiel7.mydrobe.adapters.ViewPagerAdapter shoesViewPagerAdapter;
    
    public OutfitAddFragment() {
        super();
    }
    
    private final com.axiel7.mydrobe.models.OutfitViewModel getOutfitViewModel() {
        return null;
    }
    
    private final com.axiel7.mydrobe.models.ClothingViewModel getClothingViewModel() {
        return null;
    }
    
    private final com.axiel7.mydrobe.databinding.OutfitItemAddBinding getBinding() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onAttach(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    private final void saveItem() {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    private final void setUpViewPager() {
    }
}
package com.axiel7.mydrobe.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0011B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\u001c\u0010\t\u001a\u00020\n2\n\u0010\u000b\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\f\u001a\u00020\bH\u0016J\u001c\u0010\r\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\bH\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/axiel7/mydrobe/adapters/ViewPagerAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/axiel7/mydrobe/adapters/ViewPagerAdapter$ViewPagerViewHolder;", "imageUrlList", "", "", "(Ljava/util/List;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewPagerViewHolder", "app_debug"})
public final class ViewPagerAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.axiel7.mydrobe.adapters.ViewPagerAdapter.ViewPagerViewHolder> {
    private final java.util.List<java.lang.String> imageUrlList = null;
    
    public ViewPagerAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> imageUrlList) {
        super();
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.axiel7.mydrobe.adapters.ViewPagerAdapter.ViewPagerViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.axiel7.mydrobe.adapters.ViewPagerAdapter.ViewPagerViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000b"}, d2 = {"Lcom/axiel7/mydrobe/adapters/ViewPagerAdapter$ViewPagerViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/axiel7/mydrobe/databinding/ImageItemBinding;", "(Lcom/axiel7/mydrobe/adapters/ViewPagerAdapter;Lcom/axiel7/mydrobe/databinding/ImageItemBinding;)V", "getBinding", "()Lcom/axiel7/mydrobe/databinding/ImageItemBinding;", "setData", "", "imageUrl", "", "app_debug"})
    public final class ViewPagerViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.axiel7.mydrobe.databinding.ImageItemBinding binding = null;
        
        public ViewPagerViewHolder(@org.jetbrains.annotations.NotNull()
        com.axiel7.mydrobe.databinding.ImageItemBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.axiel7.mydrobe.databinding.ImageItemBinding getBinding() {
            return null;
        }
        
        public final void setData(@org.jetbrains.annotations.NotNull()
        java.lang.String imageUrl) {
        }
    }
}
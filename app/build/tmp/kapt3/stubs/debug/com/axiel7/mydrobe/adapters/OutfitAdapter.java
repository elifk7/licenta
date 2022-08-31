package com.axiel7.mydrobe.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B\'\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0006\u00a2\u0006\u0002\u0010\nJ\b\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u000eH\u0016J\u0018\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000eH\u0016J\u0014\u0010\u0016\u001a\u00020\t2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/axiel7/mydrobe/adapters/OutfitAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/axiel7/mydrobe/adapters/OutfitAdapter$ViewHolder;", "context", "Landroid/content/Context;", "onClickListener", "Lkotlin/Function2;", "Landroid/view/View;", "Lcom/axiel7/mydrobe/models/Outfit;", "", "(Landroid/content/Context;Lkotlin/jvm/functions/Function2;)V", "outfitList", "", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setData", "list", "ViewHolder", "app_debug"})
public final class OutfitAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.axiel7.mydrobe.adapters.OutfitAdapter.ViewHolder> {
    private final android.content.Context context = null;
    private final kotlin.jvm.functions.Function2<android.view.View, com.axiel7.mydrobe.models.Outfit, kotlin.Unit> onClickListener = null;
    private java.util.List<com.axiel7.mydrobe.models.Outfit> outfitList;
    
    public OutfitAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super android.view.View, ? super com.axiel7.mydrobe.models.Outfit, kotlin.Unit> onClickListener) {
        super();
    }
    
    public final void setData(@org.jetbrains.annotations.NotNull()
    java.util.List<com.axiel7.mydrobe.models.Outfit> list) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.axiel7.mydrobe.adapters.OutfitAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.axiel7.mydrobe.adapters.OutfitAdapter.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004\u00a8\u0006\b"}, d2 = {"Lcom/axiel7/mydrobe/adapters/OutfitAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemBinding", "Lcom/axiel7/mydrobe/databinding/ItemOutfitBinding;", "(Lcom/axiel7/mydrobe/databinding/ItemOutfitBinding;)V", "getItemBinding", "()Lcom/axiel7/mydrobe/databinding/ItemOutfitBinding;", "setItemBinding", "app_debug"})
    public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private com.axiel7.mydrobe.databinding.ItemOutfitBinding itemBinding;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        com.axiel7.mydrobe.databinding.ItemOutfitBinding itemBinding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.axiel7.mydrobe.databinding.ItemOutfitBinding getItemBinding() {
            return null;
        }
        
        public final void setItemBinding(@org.jetbrains.annotations.NotNull()
        com.axiel7.mydrobe.databinding.ItemOutfitBinding p0) {
        }
    }
}
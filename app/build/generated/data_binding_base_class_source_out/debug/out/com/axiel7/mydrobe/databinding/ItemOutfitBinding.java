// Generated by view binder compiler. Do not edit!
package com.axiel7.mydrobe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.axiel7.mydrobe.R;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemOutfitBinding implements ViewBinding {
  @NonNull
  private final MaterialCardView rootView;

  @NonNull
  public final ShapeableImageView bottomItem;

  @NonNull
  public final ImageView fallIcon;

  @NonNull
  public final AppCompatTextView outfitName;

  @NonNull
  public final ShapeableImageView shoeItem;

  @NonNull
  public final ImageView springIcon;

  @NonNull
  public final ImageView summerIcon;

  @NonNull
  public final ShapeableImageView topItem;

  @NonNull
  public final ImageView winterIcon;

  private ItemOutfitBinding(@NonNull MaterialCardView rootView,
      @NonNull ShapeableImageView bottomItem, @NonNull ImageView fallIcon,
      @NonNull AppCompatTextView outfitName, @NonNull ShapeableImageView shoeItem,
      @NonNull ImageView springIcon, @NonNull ImageView summerIcon,
      @NonNull ShapeableImageView topItem, @NonNull ImageView winterIcon) {
    this.rootView = rootView;
    this.bottomItem = bottomItem;
    this.fallIcon = fallIcon;
    this.outfitName = outfitName;
    this.shoeItem = shoeItem;
    this.springIcon = springIcon;
    this.summerIcon = summerIcon;
    this.topItem = topItem;
    this.winterIcon = winterIcon;
  }

  @Override
  @NonNull
  public MaterialCardView getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemOutfitBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemOutfitBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_outfit, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemOutfitBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.bottomItem;
      ShapeableImageView bottomItem = ViewBindings.findChildViewById(rootView, id);
      if (bottomItem == null) {
        break missingId;
      }

      id = R.id.fall_icon;
      ImageView fallIcon = ViewBindings.findChildViewById(rootView, id);
      if (fallIcon == null) {
        break missingId;
      }

      id = R.id.outfit_name;
      AppCompatTextView outfitName = ViewBindings.findChildViewById(rootView, id);
      if (outfitName == null) {
        break missingId;
      }

      id = R.id.shoeItem;
      ShapeableImageView shoeItem = ViewBindings.findChildViewById(rootView, id);
      if (shoeItem == null) {
        break missingId;
      }

      id = R.id.spring_icon;
      ImageView springIcon = ViewBindings.findChildViewById(rootView, id);
      if (springIcon == null) {
        break missingId;
      }

      id = R.id.summer_icon;
      ImageView summerIcon = ViewBindings.findChildViewById(rootView, id);
      if (summerIcon == null) {
        break missingId;
      }

      id = R.id.topItem;
      ShapeableImageView topItem = ViewBindings.findChildViewById(rootView, id);
      if (topItem == null) {
        break missingId;
      }

      id = R.id.winter_icon;
      ImageView winterIcon = ViewBindings.findChildViewById(rootView, id);
      if (winterIcon == null) {
        break missingId;
      }

      return new ItemOutfitBinding((MaterialCardView) rootView, bottomItem, fallIcon, outfitName,
          shoeItem, springIcon, summerIcon, topItem, winterIcon);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}

// Generated by view binder compiler. Do not edit!
package com.axiel7.mydrobe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.axiel7.mydrobe.R;
import com.google.android.material.chip.Chip;
import java.lang.NullPointerException;
import java.lang.Override;

public final class ChipColorBinding implements ViewBinding {
  @NonNull
  private final Chip rootView;

  @NonNull
  public final Chip addColorChip;

  private ChipColorBinding(@NonNull Chip rootView, @NonNull Chip addColorChip) {
    this.rootView = rootView;
    this.addColorChip = addColorChip;
  }

  @Override
  @NonNull
  public Chip getRoot() {
    return rootView;
  }

  @NonNull
  public static ChipColorBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ChipColorBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.chip_color, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ChipColorBinding bind(@NonNull View rootView) {
    if (rootView == null) {
      throw new NullPointerException("rootView");
    }

    Chip addColorChip = (Chip) rootView;

    return new ChipColorBinding((Chip) rootView, addColorChip);
  }
}

// Generated by view binder compiler. Do not edit!
package com.axiel7.mydrobe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.view.PreviewView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.axiel7.mydrobe.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentCameraBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final FloatingActionButton captureButton;

  @NonNull
  public final ImageButton closeButton;

  @NonNull
  public final ImageButton galleryButton;

  @NonNull
  public final PreviewView viewFinder;

  private FragmentCameraBinding(@NonNull ConstraintLayout rootView,
      @NonNull FloatingActionButton captureButton, @NonNull ImageButton closeButton,
      @NonNull ImageButton galleryButton, @NonNull PreviewView viewFinder) {
    this.rootView = rootView;
    this.captureButton = captureButton;
    this.closeButton = closeButton;
    this.galleryButton = galleryButton;
    this.viewFinder = viewFinder;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentCameraBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentCameraBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_camera, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentCameraBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.capture_button;
      FloatingActionButton captureButton = ViewBindings.findChildViewById(rootView, id);
      if (captureButton == null) {
        break missingId;
      }

      id = R.id.close_button;
      ImageButton closeButton = ViewBindings.findChildViewById(rootView, id);
      if (closeButton == null) {
        break missingId;
      }

      id = R.id.gallery_button;
      ImageButton galleryButton = ViewBindings.findChildViewById(rootView, id);
      if (galleryButton == null) {
        break missingId;
      }

      id = R.id.view_finder;
      PreviewView viewFinder = ViewBindings.findChildViewById(rootView, id);
      if (viewFinder == null) {
        break missingId;
      }

      return new FragmentCameraBinding((ConstraintLayout) rootView, captureButton, closeButton,
          galleryButton, viewFinder);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}

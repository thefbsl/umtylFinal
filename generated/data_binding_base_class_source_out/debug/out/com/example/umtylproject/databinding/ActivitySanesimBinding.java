// Generated by view binder compiler. Do not edit!
package com.example.umtylproject.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.VideoView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.umtylproject.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivitySanesimBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final TextView TextView11;

  @NonNull
  public final VideoView myVideoView;

  private ActivitySanesimBinding(@NonNull RelativeLayout rootView, @NonNull TextView TextView11,
      @NonNull VideoView myVideoView) {
    this.rootView = rootView;
    this.TextView11 = TextView11;
    this.myVideoView = myVideoView;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivitySanesimBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivitySanesimBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_sanesim, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivitySanesimBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.TextView11;
      TextView TextView11 = ViewBindings.findChildViewById(rootView, id);
      if (TextView11 == null) {
        break missingId;
      }

      id = R.id.myVideoView;
      VideoView myVideoView = ViewBindings.findChildViewById(rootView, id);
      if (myVideoView == null) {
        break missingId;
      }

      return new ActivitySanesimBinding((RelativeLayout) rootView, TextView11, myVideoView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}

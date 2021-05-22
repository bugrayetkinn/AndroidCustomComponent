package com.yetkin.androidcustomcomponent.util.extension

import android.graphics.drawable.Drawable
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide

@BindingAdapter("loadDrawable")
fun ImageView.loadDrawable(drawable: Drawable?) {
    Glide.with(this).load(drawable).into(this)
}
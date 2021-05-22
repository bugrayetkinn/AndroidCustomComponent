package com.yetkin.androidcustomcomponent.customview

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.FrameLayout
import com.yetkin.androidcustomcomponent.R
import com.yetkin.androidcustomcomponent.databinding.CustomMenuItemBinding

class CustomMenuItem @JvmOverloads constructor(
    context: Context,
    attributes: AttributeSet? = null,
    defAttr: Int = 0
) : FrameLayout(context, attributes, defAttr) {

    private val binding: CustomMenuItemBinding

    init {
        val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        binding = CustomMenuItemBinding.inflate(inflater)
        addView(binding.root)

        val attrs = context.obtainStyledAttributes(attributes, R.styleable.CustomMenuItem)

        binding.apply {
            txtTitle = attrs.getString(R.styleable.CustomMenuItem_txtTitle)
            txtDescription = attrs.getString(R.styleable.CustomMenuItem_txtDescription)
            icon = attrs.getDrawable(R.styleable.CustomMenuItem_menuIcon)
            executePendingBindings()
        }
        attrs.recycle()
    }
}
package com.agency.utils.customviews

import android.content.Context
import android.support.v7.widget.AppCompatImageView
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.RelativeLayout
import com.agency.R
import kotlinx.android.synthetic.main.drawable_edit_text_layout.view.*

/**
 * Created by Farshid
 * since 10/22/2018.
 * contact farshidabazari@gmail.com
 */
class DrawableEditText @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyle: Int = 0
) : RelativeLayout(context, attrs, defStyle) {
    init {
        LayoutInflater.from(context)
            .inflate(R.layout.drawable_edit_text_layout, this, true)

        attrs?.let {
            val typeArray = context.obtainStyledAttributes(
                it,
                R.styleable.DrawableEditText
            )

            val hintText = typeArray.getString(R.styleable.DrawableEditText_drawableEditTextImage)
            val iconResId = typeArray.getResourceId(R.styleable.DrawableEditText_drawableEditTextHint, 0)

            if (iconResId > 0)
                drawableEditText_image.setImageResource(iconResId)

            drawableEditText_editText.hint = hintText

            typeArray.recycle()
        }
    }

    public fun getEditText(): XeiEditText {
        return drawableEditText_editText
    }

    public fun getDrawable(): AppCompatImageView {
        return drawableEditText_image
    }
}

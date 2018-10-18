package com.agency.utils.customviews

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.RelativeLayout
import com.agency.R
import kotlinx.android.synthetic.main.main_page_items.view.*

/**
 * Created by Farshid
 * since 10/18/2018.
 * contact farshidabazari@gmail.com
 */
class MainPageItemView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyle: Int = 0
) : RelativeLayout(context, attrs, defStyle) {

    init {
        LayoutInflater.from(context)
            .inflate(R.layout.main_page_items, this, true)

        attrs?.let {
            val typeArray = context.obtainStyledAttributes(it,
                R.styleable.MainPageItemView)

            val titleText = typeArray.getString(R.styleable.MainPageItemView_text)
            val iconResId = typeArray.getResourceId(R.styleable.MainPageItemView_image, 0)


            mainPageItem_Image.setImageResource(iconResId)
            mainPageItem_text.text = titleText

            typeArray.recycle()
        }
    }
}
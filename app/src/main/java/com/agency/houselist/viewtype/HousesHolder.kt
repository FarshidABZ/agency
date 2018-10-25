package com.agency.houselist.viewtype

import android.support.v7.widget.AppCompatImageView
import android.support.v7.widget.RecyclerView
import android.view.View
import com.agency.R
import com.agency.utils.customviews.XeiTextView

/**
 * Created by Farshid
 * since 10/24/2018.
 * contact farshidabazari@gmail.com
 */
class HousesHolder(view: View) : RecyclerView.ViewHolder(view) {
    var contentHousesImage: AppCompatImageView = view.findViewById(R.id.contentHousesImage)
    var contentHouseTitle: XeiTextView = view.findViewById(R.id.contentHouseTitle)
    var contentHouseDescription: XeiTextView = view.findViewById(R.id.contentHouseDescription)
    var contentHousePrice: XeiTextView = view.findViewById(R.id.contentHousePrice)
}
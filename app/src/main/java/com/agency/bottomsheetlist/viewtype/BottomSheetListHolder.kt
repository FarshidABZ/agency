package com.agency.bottomsheetlist.viewtype

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.TextView
import com.agency.R

class BottomSheetListHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var contentBottomSheetListDescription: TextView = itemView.findViewById(R.id.contentBottomSheetListDescription)
    var contentBottomSheetListTitle: TextView = itemView.findViewById(R.id.contentBottomSheetListTitle)
}
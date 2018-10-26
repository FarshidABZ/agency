package com.agency.bottomsheetlist.viewtype

import com.agency.OnItemClickListener
import com.agency.R
import ir.coderz.ghostadapter.BindItem
import ir.coderz.ghostadapter.Binder

@BindItem(layout = R.layout.content_bottom_sheet_list, holder = BottomSheetListHolder::class)
class BottomSheetListItem(var item: Any,
                          private var onItemClickListener: OnItemClickListener) {

    @Binder
    public fun binder(holder: BottomSheetListHolder) {
        holder.run {
            contentBottomSheetListTitle.text = ""
            contentBottomSheetListDescription.text = ""

            itemView.setOnClickListener { onItemClickListener.onItemClicked("", adapterPosition) }
        }
    }
}
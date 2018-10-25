package com.agency.houselist.viewtype

import androidx.navigation.Navigation
import com.agency.BaseModel
import com.agency.R
import com.bumptech.glide.Glide
import ir.coderz.ghostadapter.BindItem
import ir.coderz.ghostadapter.Binder

/**
 * Created by Farshid
 * since 10/24/2018.
 * contact farshidabazari@gmail.com
 */
@BindItem(layout = R.layout.content_houses_list, holder = HousesHolder::class)
class HousesItemAdapter(var baseModel: BaseModel) {

    @Binder
    fun binder(holder: HousesHolder) {
        holder.run {
            Glide.with(itemView.context)
                .load(baseModel.message)
                .into(contentHousesImage)

            contentHousePrice.text = baseModel.message
            contentHouseTitle.text = baseModel.message
            contentHouseDescription.text = baseModel.message

            itemView.setOnClickListener {
                Navigation
                    .findNavController(itemView)
                    .navigate(R.id.houseDetailFragment)
            }
        }
    }
}
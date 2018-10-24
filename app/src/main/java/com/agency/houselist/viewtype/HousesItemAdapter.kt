package com.agency.houselist.viewtype

import com.agency.R
import ir.coderz.ghostadapter.BindItem
import ir.coderz.ghostadapter.Binder

/**
 * Created by Farshid
 * since 10/24/2018.
 * contact farshidabazari@gmail.com
 */
@BindItem(layout = R.layout.content_houses_list, holder = HousesHolder::class)
class HousesItemAdapter {

    @Binder
    fun binder(holder: HousesHolder) {

    }
}
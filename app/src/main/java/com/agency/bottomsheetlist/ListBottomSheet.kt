package com.agency.bottomsheetlist

import android.os.Bundle
import android.support.design.widget.BottomSheetDialogFragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.agency.OnItemClickListener
import com.agency.R
import com.agency.bottomsheetlist.viewtype.BottomSheetListItem
import ir.coderz.ghostadapter.GhostAdapter
import kotlinx.android.synthetic.main.bottom_sheet_list.*

class ListBottomSheet : BottomSheetDialogFragment() {
    enum class typeOfList {
        AREA,
        ADV_TYPE
    }

    private lateinit var onItemClickListener: OnItemClickListener

    private var adapter = GhostAdapter()
    private var items = ArrayList<Any>()

    companion object {
        @JvmStatic
        fun newInstance(typeName: typeOfList): ListBottomSheet {
            return ListBottomSheet().apply {
                this.arguments = Bundle().apply {
                    this.putString("type", typeName.name)
                }
            }
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.bottom_sheet_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        listBottomSheetClose.setOnClickListener { dismiss() }
        initRecyclerView()

        getItems()
    }

    fun setOnItemClickListener(onItemClickListener: OnItemClickListener) {
        this.onItemClickListener = onItemClickListener
    }

    private fun initRecyclerView() {
        listBottomSheetList.adapter = adapter
        listBottomSheetList.layoutManager = LinearLayoutManager(context,
                LinearLayoutManager.VERTICAL, false)
    }

    private fun getItems() {
        val type = arguments?.getString("type")
        when (type) {
            typeOfList.AREA.name -> getAreaList()
            typeOfList.ADV_TYPE.name -> getAdvTypesList()
        }
    }

    private fun getAreaList() {
    }

    private fun getAdvTypesList() {
    }

    private fun fillListView(arrayList: ArrayList<Any>) {
        for (item in arrayList) {
            items.add(BottomSheetListItem(item, itemClickListener))
        }

        adapter.setItems(items)
    }

    private var itemClickListener = object : OnItemClickListener {
        override fun onItemClicked(obj: Any, position: Int) {
            onItemClickListener.onItemClicked(obj, position)
            dismiss()
        }
    }
}
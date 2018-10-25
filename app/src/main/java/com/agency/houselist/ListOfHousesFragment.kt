package com.agency.houselist

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.agency.R
import ir.coderz.ghostadapter.GhostAdapter
import kotlinx.android.synthetic.main.fragment_list_of_houses.*


/**
 * A simple [Fragment] subclass.
 *
 */
class ListOfHousesFragment : Fragment() {

    var adapter = GhostAdapter()
    var listOfHouses = ArrayList<Any>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_list_of_houses, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initRecyclerView()
        getListOfHouses(0)
    }

    private fun initRecyclerView() {
        listOfHousesFragmentRecyclerView.adapter = adapter
        listOfHousesFragmentRecyclerView.layoutManager =
                LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
    }

    private fun getListOfHouses(pageNumber: Int) {
    }

    private fun addItemsToView(items: ArrayList<Any>) {
        adapter.addItems(items)
        listOfHouses.add(items)
    }
}

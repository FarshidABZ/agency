package com.agency.mainfragment

import android.content.Context
import android.os.Bundle
import android.support.annotation.IdRes
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.agency.R
import kotlinx.android.synthetic.main.fragment_first_page.*

/**
 * Created by Farshid
 * since 10/18/2018.
 * contact farshidabazari@gmail.com
 */
class FirstPageFragment : Fragment() {
    var mainView: MainView? = null

    override fun onAttach(context: Context?) {
        super.onAttach(context)
        context?.let {
            mainView = it as MainView
        }
    }
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_first_page, container, false);
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        bindClickListeners()
    }

    private fun bindClickListeners() {
        firstPageItem_advList.setOnClickListener { navigateTo(firstPageItem_advList, R.id.listOfAgenciesFragment) }
        firstPageItem_search.setOnClickListener { navigateTo(firstPageItem_search, R.id.searchFragment) }
        firstPageItem_agencies.setOnClickListener { navigateTo(firstPageItem_agencies, R.id.listOfAgenciesFragment) }
        firstPageItem_submitAdv.setOnClickListener { navigateTo(firstPageItem_submitAdv, R.id.submitHouse) }
        imgBackEditProfile.setOnClickListener {  mainView?.openCloseNavigationBar() }
    }

    private fun navigateTo(view: View, @IdRes fragmentId: Int) {
        Navigation.findNavController(view).navigate(fragmentId)
    }
}
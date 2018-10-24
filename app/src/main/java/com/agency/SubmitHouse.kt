package com.agency

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.agency.mainfragment.MainView
import kotlinx.android.synthetic.main.fragment_submit_house.*

class SubmitHouse : Fragment() {

    private var mainView: MainView? = null

    override fun onAttach(context: Context?) {
        super.onAttach(context)
        context?.let {
            mainView = it as MainView
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_submit_house, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        imgBackSubmitAdv.setOnClickListener { mainView?.onBackButtonPressed() }
    }
}

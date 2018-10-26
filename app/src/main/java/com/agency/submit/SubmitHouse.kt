package com.agency.submit

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.agency.OnItemClickListener
import com.agency.R
import com.agency.bottomsheetlist.ListBottomSheet
import com.agency.mainfragment.MainView
import kotlinx.android.synthetic.main.fragment_submit_house.*
import kotlinx.android.synthetic.main.submit_adv_content.*

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
        fragmentSubmit_button_submit.setOnClickListener { submitHouse() }
        submitAdv_editText_location.setOnClickListener { showAreaSelectionView() }
        submitAdv_editText_advType.setOnClickListener { showTypeSelectionView() }
    }

    private fun showTypeSelectionView() {
        val listBottomSheet = ListBottomSheet
                .newInstance(ListBottomSheet.typeOfList.ADV_TYPE).apply {
                    setOnItemClickListener(object : OnItemClickListener {
                        override fun onItemClicked(obj: Any, position: Int) {

                        }
                    })
                }.show(fragmentManager, "listBottomSheet")
    }

    private fun showAreaSelectionView() {
        val listBottomSheet = ListBottomSheet
                .newInstance(ListBottomSheet.typeOfList.AREA).apply {
                    setOnItemClickListener(object : OnItemClickListener {
                        override fun onItemClicked(obj: Any, position: Int) {

                        }
                    })
                }.show(fragmentManager, "listBottomSheet")
    }

    private fun submitHouse() {
        if (isDataValid()) {

        }
    }

    private fun isDataValid(): Boolean {
        if (submitAdv_editText_firstAndLastName.text.isNullOrEmpty()) {
            showMessage("نام و نام خانوادگی را وارد نمایید")
            return false
        }

        if (submitAdv_editText_location.text.isNullOrEmpty()) {
            showMessage("موقعیت مکانی ملک را انتخاب کنید")
            return false
        }

        if (submitAdv_editText_cellPhone.text.isNullOrEmpty()) {
            showMessage("شماره تلفن را وارد نمایید")
            return false
        }

        if (submitAdv_editText_advType.text.isNullOrEmpty()) {
            showMessage("نوع آگهی را انتخاب کنید")
            return false
        }

        if (submitAdv_editText_description.text.isNullOrEmpty()) {
            showMessage("توضیحات را کامل کنید")
            return false
        }

        if (requestType.checkedRadioButtonId == -1) {
            showMessage("نوع درخواست را مشخص کنید")
            return false
        }

        if (houseTypeRadioGroup.checkedRadioButtonId == -1) {
            showMessage("نوع ملک را انتخاب کنید")
            return false
        }

        if (submitAdv_editText_cellPhone.text?.length != 11) {
            showMessage("شماره تلفن را وارد کنید")
            return false
        }

        return true
    }

    private fun showMessage(message: String) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }
}

package com.agency.mainfragment

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter

/**
 * Created by Farshid
 * since 10/18/2018.
 * contact farshidabazari@gmail.com
 */
class MainFragmentPagerAdapter(fm: FragmentManager) : FragmentStatePagerAdapter(fm) {
    override fun getItem(position: Int): Fragment {
        return FirstPageFragment()
    }

    override fun getCount(): Int {
        return 1
    }
}
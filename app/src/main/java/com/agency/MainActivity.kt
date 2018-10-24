package com.agency

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.Gravity
import androidx.navigation.Navigation.findNavController
import com.agency.mainfragment.MainView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), MainView {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onSupportNavigateUp() =
        findNavController(this, R.id.mainActivity_navHostFragment).navigateUp()

    override fun openCloseNavigationBar() {
        when (mainActivity_DrawerLayout.isDrawerOpen(Gravity.START)) {
            true -> mainActivity_DrawerLayout.closeDrawer(Gravity.START)
            false -> mainActivity_DrawerLayout.openDrawer(Gravity.START)
        }
    }

    override fun onBackButtonPressed() {
        onBackPressed()
    }
}

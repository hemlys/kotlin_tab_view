package com.view.demo.navigation.demo.activity

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.view.bottomview.demo.R
import com.view.demo.navigation.demo.fragment.FirstFragment
import com.view.demo.navigation.demo.fragment.FiveFragment
import com.view.demo.navigation.demo.fragment.MoreFragment
import kotlinx.android.synthetic.main.activity_main.oneBottomLayout
import kotlinx.android.synthetic.main.activity_main_viewpager.*

class MainViewPagerActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main_viewpager)

        oneBottomLayout.setMenu(R.menu.navigation_menu)

        oneBottomLayout.attachViewPager(supportFragmentManager,viewPager, listOf(FirstFragment(), FiveFragment(), FirstFragment(), MoreFragment()))
        oneBottomLayout.setFloatingEnable(true)
        oneBottomLayout.setTopLineColor(Color.RED)
        oneBottomLayout.setItemColorStateList(R.drawable.item_check)
        oneBottomLayout.setMsgCount(4, 1)
        oneBottomLayout.setOnItemSelectedListener { item, position ->
//            if (position == 1) {
//                oneBottomLayout.setFloatingEnable(true)
//            } else {
//                oneBottomLayout.setFloatingEnable(false)
//            }
            false
        }



    }


}
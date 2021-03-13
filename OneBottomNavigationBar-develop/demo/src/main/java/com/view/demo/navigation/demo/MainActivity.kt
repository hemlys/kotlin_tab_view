package com.view.demo.navigation.demo

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.view.bottomview.demo.R
import com.view.demo.navigation.demo.fragment.FirstFragment
import com.view.demo.navigation.demo.fragment.FiveFragment
import com.view.demo.navigation.demo.fragment.FourFragment
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        oneBottomLayout.setMenu(R.menu.navigation_menu)
        oneBottomLayout.setFragmentManager(supportFragmentManager, mainFragment )
        oneBottomLayout.isReplace = false
        oneBottomLayout.addFragment(R.id.tab1, FirstFragment())
        oneBottomLayout.addFragment(R.id.tab4, FourFragment())
        oneBottomLayout.addFragment(R.id.tab5, FiveFragment())
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

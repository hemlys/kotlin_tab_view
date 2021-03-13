package com.view.demo.navigation.demo.adapter

import androidx.viewpager2.adapter.FragmentStateAdapter
import com.view.demo.navigation.demo.fragment.MoreFragment
import com.view.demo.navigation.demo.fragment.ListFragment

class WalletAdapter(fa: MoreFragment) : FragmentStateAdapter(fa) {

    override fun getItemCount() = 2

    override fun createFragment(position: Int) = ListFragment()


}
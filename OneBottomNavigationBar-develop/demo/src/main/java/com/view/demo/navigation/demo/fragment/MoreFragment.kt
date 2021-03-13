package com.view.demo.navigation.demo.fragment

import android.graphics.Color
import android.os.Build
import android.os.Bundle
import android.view.*
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.viewpager2.widget.ViewPager2
import com.bumptech.glide.Glide
import com.google.android.material.tabs.TabLayoutMediator
import com.sample.demo.myapplication.bean.UsersList
import com.sample.demo.myapplication.net.InfoViewModel
import com.view.bottomview.demo.R
import com.view.demo.navigation.demo.adapter.UsersListAdapter
import com.view.demo.navigation.demo.adapter.WalletAdapter
import com.view.demo.navigation.ui.ProgressbarFragment
import io.reactivex.Observer
import kotlinx.android.synthetic.main.fragment_list.*
import kotlinx.android.synthetic.main.fragment_more.*
import org.koin.androidx.viewmodel.ext.android.viewModel


/**
 * @author onestravel
 * @createTime 2019-08-04 11:52
 * @description TODO
 */
class MoreFragment : BaseFragment() {


    private lateinit var demoCollectionAdapter: WalletAdapter
    private lateinit var viewPager: ViewPager2


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_more, container, false)
        return view
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) { // 5.0
            val window: Window? = activity?.getWindow()
            window?.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS) // 確認取消半透明設置。
            window?.decorView?.systemUiVisibility = (View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN // 全螢幕顯示，status bar 不隱藏，activity 上方 layout 會被 status bar 覆蓋。
                    or View.SYSTEM_UI_FLAG_LAYOUT_STABLE) // 配合其他 flag 使用，防止 system bar 改變後 layout 的變動。
            window?.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS) // 跟系統表示要渲染 system bar 背景。
            window?.statusBarColor = Color.TRANSPARENT
        }

        Glide.with(account_icon)
                .load("https://event.12cm.com.tw/starbucks/img/siren-l.png")
                .centerCrop()
                .into(account_icon);
        Glide.with(icons)
                .load("https://event.12cm.com.tw/starbucks/img/siren-l.png")
                .centerCrop()
                .into(icons);



        demoCollectionAdapter = WalletAdapter(this)
        viewPager = view.findViewById(R.id.view_pager2)
        viewPager.adapter = demoCollectionAdapter

        TabLayoutMediator(tab_layout, viewPager) { tab, position ->
            tab.text = when (position) {
                0 -> "容幣紀錄"
                1 -> "兌換券"
                else -> "111"
            }
            viewPager.currentItem = tab.position
        }.attach()




    }



}

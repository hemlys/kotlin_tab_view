package com.view.demo.navigation.demo.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.sample.demo.myapplication.bean.UsersList
import com.sample.demo.myapplication.net.InfoViewModel

import com.view.bottomview.demo.R
import com.view.demo.navigation.demo.adapter.UsersListAdapter
import com.view.demo.navigation.ui.ProgressbarFragment
import io.reactivex.Observer
import kotlinx.android.synthetic.main.fragment_list.*
import org.koin.androidx.viewmodel.ext.android.viewModel

/**
 * @author onestravel
 * @createTime 2019-08-04 11:52
 * @description TODO
 */
class ListFragment : BaseFragment() {
    private lateinit var list : RecyclerView
    private val infoViewModel: InfoViewModel by viewModel()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_list, container, false)

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        init()
    }

    fun init() {
        val arrayList = ArrayList<String>()
        for (i in 0..10) {
            arrayList.add("x"+i)
        }

        list = rv_animal_list
        list.layoutManager = LinearLayoutManager(activity)
        list.adapter = UsersListAdapter(arrayList) { partItem: String -> partItemClicked(partItem) }


    }

    private fun partItemClicked(partItem: String) {

    }
}

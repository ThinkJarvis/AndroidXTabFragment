package com.kotlin.androidxtabfragment

import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.fragment_main.*


class MainFragment : BaseFragment() {
    override val layoutId = R.layout.fragment_main

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        layout_table.setupWithViewPager(view_pager, childFragmentManager)
    }
}
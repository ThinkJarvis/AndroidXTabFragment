package com.kotlin.androidxtabfragment

import android.content.Context
import android.graphics.Color
import android.util.AttributeSet
import androidx.annotation.StringRes
import kotlinx.android.synthetic.main.layout_custom_tab.view.*


abstract class CustomTabLayout : MaterialTabLayout {


    override fun addTabs() {
        for (i in 0 until tabs.size) {
            var customTabView = CustomTabView(context)
            customTabView.setText(tabs[i].tagId)
            addTab(newTab().setCustomView(customTabView))
        }
    }

    override fun onTabSelected(tab: Tab) {
        super.onTabSelected(tab)
        (tab.customView as CustomTabView).setTextSelectedStyle()
    }

    override fun onTabUnselected(tab: Tab) {
        super.onTabUnselected(tab)
        (tab.customView as CustomTabView).setTextUnSelectedStyle()
    }

    constructor(context: Context) : super(context)

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs)


    class CustomTabView : MaterialTabView {

        override var layoutId: Int
            get() = R.layout.layout_custom_tab
            set(value) {
                layoutId = R.layout.layout_custom_tab
            }

        constructor(context: Context) : super(context)

        fun setText(@StringRes resId: Int) {
            title.setText(resId)
            setTextUnSelectedStyle()
        }

        fun setTextSelectedStyle() {
            title.setTextColor(Color.LTGRAY)
        }

        fun setTextUnSelectedStyle() {
            title.setTextColor(Color.BLACK)
        }

    }

}
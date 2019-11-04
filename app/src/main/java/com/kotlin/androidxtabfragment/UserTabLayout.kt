package com.kotlin.androidxtabfragment

import android.content.Context
import android.util.AttributeSet

class UserTabLayout : CustomTabLayout {
    override fun setUpTabs() {
        addCustomTab(R.string.tab_1, Tab1Fragment::class.java.name)
        addCustomTab(R.string.tab_2, Tab2Fragment::class.java.name)
    }


    constructor(context: Context) : super(context)

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs)
}
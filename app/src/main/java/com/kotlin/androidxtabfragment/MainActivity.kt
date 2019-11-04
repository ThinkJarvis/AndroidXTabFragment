package com.kotlin.androidxtabfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragment = supportFragmentManager.fragmentFactory.instantiate(
            classLoader,
            MainFragment::class.java.name
        )

        supportFragmentManager.beginTransaction().replace(R.id.main_container, fragment).commit()
    }
}

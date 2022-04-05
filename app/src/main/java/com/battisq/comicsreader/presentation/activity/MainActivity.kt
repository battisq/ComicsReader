package com.battisq.comicsreader.presentation.activity

import android.os.Bundle
import com.battisq.comicsreader.R
import com.battisq.comicsreader.presentation.fragment.home.HomeFragment
import dagger.android.support.DaggerAppCompatActivity

class MainActivity : DaggerAppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        openFragment()
    }

    private fun openFragment() {
        val fragment = HomeFragment()
        val transaction = supportFragmentManager.beginTransaction().replace(
            R.id.fragmentContainer,
            fragment
        )

        transaction.commitNow()
    }
}
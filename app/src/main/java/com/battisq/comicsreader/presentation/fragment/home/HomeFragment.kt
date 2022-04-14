package com.battisq.comicsreader.presentation.fragment.home

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.battisq.comicsreader.R
import com.battisq.comicsreader.presentation.fragment.base.fragment.BaseVMFragment
import com.battisq.comicsreader.presentation.fragment.title.list.TitleListFragment

class HomeFragment : BaseVMFragment<HomeViewModel>() {

    override val layoutId: Int = R.layout.fragment_home

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val fragment = TitleListFragment()

        parentFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainer, fragment)
            .commitNow()
    }
}
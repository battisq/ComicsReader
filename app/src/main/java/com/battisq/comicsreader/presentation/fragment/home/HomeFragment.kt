package com.battisq.comicsreader.presentation.fragment.home

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.battisq.comicsreader.R
import com.battisq.comicsreader.presentation.fragment.base.fragment.BaseVMFragment

class HomeFragment : BaseVMFragment<HomeViewModel>() {

    override val layoutId: Int = R.layout.fragment_home

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        requireActivity().findViewById<Button>(R.id.actionButton).setOnClickListener {
            requireActivity().findViewById<TextView>(R.id.title).text =
                viewModel.getNumber().toString()
        }
    }
}
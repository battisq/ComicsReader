package com.battisq.comicsreader.presentation.fragment.title.list

import android.os.Bundle
import android.view.View
import by.kirich1409.viewbindingdelegate.viewBinding
import com.battisq.comicsreader.R
import com.battisq.comicsreader.databinding.FragmentTitleListBinding
import com.battisq.comicsreader.presentation.fragment.base.fragment.BaseVMFragment
import com.battisq.comicsreader.presentation.fragment.title.list.recycler.TitleListAdapter

class TitleListFragment: BaseVMFragment<TitleListViewModel>() {

    override val layoutId: Int = R.layout.fragment_title_list
    private val binding by viewBinding(FragmentTitleListBinding::bind)

    private lateinit var adapter: TitleListAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    private fun setUpAdapter() {
        adapter = TitleListAdapter(emptyList())
        binding.titleRecycler.adapter = adapter
    }
}
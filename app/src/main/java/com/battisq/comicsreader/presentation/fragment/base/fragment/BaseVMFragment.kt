package com.battisq.comicsreader.presentation.fragment.base.fragment

import com.battisq.comicsreader.presentation.fragment.base.BaseViewModel
import javax.inject.Inject

abstract class BaseVMFragment<VM: BaseViewModel>: BaseFragment() {

    @Inject
    lateinit var viewModel: VM
}
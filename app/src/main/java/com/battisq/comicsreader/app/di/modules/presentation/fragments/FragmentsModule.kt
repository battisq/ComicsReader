package com.battisq.comicsreader.app.di.modules.presentation.fragments

import com.battisq.comicsreader.app.di.modules.presentation.fragments.home.HomeModule
import com.battisq.comicsreader.presentation.fragment.home.HomeFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
interface FragmentsModule {

    @ContributesAndroidInjector(modules = [HomeModule::class])
    fun homeFragment(): HomeFragment
}
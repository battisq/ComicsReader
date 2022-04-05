package com.battisq.comicsreader.app.di.modules.presentation.activities

import com.battisq.comicsreader.app.di.modules.presentation.fragments.FragmentsModule
import com.battisq.comicsreader.presentation.activity.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
interface ActivitiesModule {

    @ContributesAndroidInjector(
        modules = [
            FragmentsModule::class
        ]
    )
    fun mainActivity(): MainActivity
}
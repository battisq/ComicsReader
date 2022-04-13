package com.battisq.comicsreader.app.di.modules.presentation

import com.battisq.comicsreader.app.di.modules.presentation.activities.ActivitiesModule
import com.battisq.comicsreader.app.di.modules.presentation.fragments.FragmentsModule
import com.battisq.comicsreader.presentation.activity.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module(
    includes = [
        ActivitiesModule::class
    ]
)
interface PresentationModule
package com.battisq.comicsreader.app.ui

import android.app.Application
import com.battisq.comicsreader.app.di.components.AppComponent
import com.battisq.comicsreader.app.di.components.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication

class App : DaggerApplication() {

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> =
        DaggerAppComponent.builder()
            .application(this)
            .build()
}


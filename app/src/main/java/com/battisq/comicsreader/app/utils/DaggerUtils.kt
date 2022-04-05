package com.battisq.comicsreader.app.utils

import android.content.Context
import com.battisq.comicsreader.app.di.components.AppComponent
import com.battisq.comicsreader.app.ui.App

object DaggerUtils {

    val Context.appComponent: AppComponent
        get() = when(this) {
            is App -> appComponent
            else -> applicationContext.appComponent
        }
}
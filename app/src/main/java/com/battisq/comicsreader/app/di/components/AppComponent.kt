package com.battisq.comicsreader.app.di.components

import com.battisq.comicsreader.app.di.modules.presentation.activities.ActivitiesModule
import com.battisq.comicsreader.app.di.modules.presentation.app.AppModule
import com.battisq.comicsreader.app.ui.App
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AndroidSupportInjectionModule::class,
        AndroidInjectionModule::class,
        AppModule::class,
        ActivitiesModule::class
    ]
)
interface AppComponent: AndroidInjector<App> {

    override fun inject(instance: App)

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(app: App): Builder

        fun build(): AppComponent
    }
}
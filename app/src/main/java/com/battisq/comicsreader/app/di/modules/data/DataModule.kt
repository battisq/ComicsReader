package com.battisq.comicsreader.app.di.modules.data

import com.battisq.comicsreader.app.di.modules.data.local.DataLocalModule
import dagger.Module

@Module(
    includes = [
        DataLocalModule::class
    ]
)
interface DataModule
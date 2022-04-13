package com.battisq.comicsreader.app.di.modules.data.local

import com.battisq.comicsreader.app.di.modules.data.local.database.PrimaryDatabaseModule
import com.battisq.comicsreader.app.di.modules.data.local.repository.PrimaryRepositoryModule
import dagger.Module

@Module(
    includes = [
        PrimaryDatabaseModule::class,
        PrimaryRepositoryModule::class
    ]
)
interface DataLocalModule
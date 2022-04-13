package com.battisq.comicsreader.app.di.modules.data.local.database

import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase
import com.battisq.comicsreader.data.local.database.PrimaryDatabase
import dagger.Module
import dagger.Provides
import dagger.Reusable

@Module
object PrimaryDatabaseModule {

    fun provideDatabase(context: Context) =
        context.buildDatabase(PrimaryDatabase::class.java, PrimaryDatabase.Config.DATABASE_NAME)

    @Provides
    @Reusable
    fun provideChapterDao(database: PrimaryDatabase) = database.chapterDao

    @Provides
    @Reusable
    fun provideChapterMatchDao(database: PrimaryDatabase) = database.chapterMatchDao

    @Provides
    @Reusable
    fun providePageLinkDao(database: PrimaryDatabase) = database.pageLinkDao

    @Provides
    @Reusable
    fun providePageMatchDao(database: PrimaryDatabase) = database.pageMatchDao


    private fun <T : RoomDatabase> Context.buildDatabase(
        clazz: Class<T>,
        name: String
    ): T = Room.databaseBuilder(this, clazz, name)
        .fallbackToDestructiveMigration()
        .build()
}
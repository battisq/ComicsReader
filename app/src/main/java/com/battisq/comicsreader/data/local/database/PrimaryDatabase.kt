package com.battisq.comicsreader.data.local.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.battisq.comicsreader.data.local.database.PrimaryDatabase.Config.DATABASE_VERSION
import com.battisq.comicsreader.data.local.database.dao.DaoContract
import com.battisq.comicsreader.data.local.database.entity.chapter.ChapterEntity
import com.battisq.comicsreader.data.local.database.entity.chapter_match.ChapterMatchEntity
import com.battisq.comicsreader.data.local.database.entity.page_link.PageLinkEntity
import com.battisq.comicsreader.data.local.database.entity.page_match.PageMatchEntity

@Database(
    entities = [
        ChapterEntity::class,
        ChapterMatchEntity::class,
        PageLinkEntity::class,
        PageMatchEntity::class
    ],
    version = DATABASE_VERSION
)
abstract class PrimaryDatabase : RoomDatabase(), DaoContract {

    object Tables {
        const val CHAPTER = "chapter"
        const val CHAPTER_MATCH = "chapter_match"
        const val PAGE_LINK = "page_link"
        const val PAGE_MATCH = "page_match"
    }

    object Config {
        const val DATABASE_NAME = "ranobe_database"
        const val DATABASE_VERSION = 1
    }
}
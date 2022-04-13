package com.battisq.comicsreader.data.local.database.dao.dao

import androidx.room.Dao
import androidx.room.RawQuery
import androidx.sqlite.db.SupportSQLiteQuery
import com.battisq.comicsreader.data.local.database.dao.base.BaseRxDao
import com.battisq.comicsreader.data.local.database.entity.chapter_match.ChapterMatchEntity
import io.reactivex.rxjava3.core.Single

@Dao
interface ChapterMatchDao: BaseRxDao<ChapterMatchEntity> {

    @RawQuery(observedEntities = [ChapterMatchEntity::class])
    override fun getAll(query: SupportSQLiteQuery): Single<List<ChapterMatchEntity>>

    @RawQuery(observedEntities = [ChapterMatchEntity::class])
    override fun getItem(query: SupportSQLiteQuery): Single<ChapterMatchEntity>
}
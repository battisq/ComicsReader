package com.battisq.comicsreader.data.local.database.dao.dao

import androidx.room.Dao
import androidx.room.RawQuery
import androidx.sqlite.db.SupportSQLiteQuery
import com.battisq.comicsreader.data.local.database.dao.base.BaseRxDao
import com.battisq.comicsreader.data.local.database.entity.chapter.ChapterEntity
import io.reactivex.rxjava3.core.Single

@Dao
interface ChapterDao: BaseRxDao<ChapterEntity> {

    @RawQuery(observedEntities = [ChapterEntity::class])
    override fun getAll(query: SupportSQLiteQuery): Single<List<ChapterEntity>>

    @RawQuery(observedEntities = [ChapterEntity::class])
    override fun getItem(query: SupportSQLiteQuery): Single<ChapterEntity>
}
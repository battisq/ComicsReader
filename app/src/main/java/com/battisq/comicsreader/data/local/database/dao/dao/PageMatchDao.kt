package com.battisq.comicsreader.data.local.database.dao.dao

import androidx.room.Dao
import androidx.room.RawQuery
import androidx.sqlite.db.SupportSQLiteQuery
import com.battisq.comicsreader.data.local.database.dao.base.BaseRxDao
import com.battisq.comicsreader.data.local.database.entity.page_match.PageMatchEntity
import io.reactivex.rxjava3.core.Single

@Dao
interface PageMatchDao: BaseRxDao<PageMatchEntity> {

    @RawQuery(observedEntities = [PageMatchEntity::class])
    override fun getAll(query: SupportSQLiteQuery): Single<List<PageMatchEntity>>

    @RawQuery(observedEntities = [PageMatchEntity::class])
    override fun getItem(query: SupportSQLiteQuery): Single<PageMatchEntity>
}
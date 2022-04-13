package com.battisq.comicsreader.data.local.database.dao.dao

import androidx.room.Dao
import androidx.room.RawQuery
import androidx.sqlite.db.SupportSQLiteQuery
import com.battisq.comicsreader.data.local.database.dao.base.BaseRxDao
import com.battisq.comicsreader.data.local.database.entity.page_link.PageLinkEntity
import io.reactivex.rxjava3.core.Single

@Dao
interface PageLinkDao: BaseRxDao<PageLinkEntity> {

    @RawQuery(observedEntities = [PageLinkEntity::class])
    override fun getAll(query: SupportSQLiteQuery): Single<List<PageLinkEntity>>

    @RawQuery(observedEntities = [PageLinkEntity::class])
    override fun getItem(query: SupportSQLiteQuery): Single<PageLinkEntity>
}
package com.battisq.comicsreader.data.local.repository.repository.page_match

import com.battisq.comicsreader.data.local.database.PrimaryDatabase
import com.battisq.comicsreader.data.local.database.dao.dao.PageMatchDao
import com.battisq.comicsreader.data.local.database.entity.page_match.PageMatchEntity
import com.battisq.comicsreader.data.local.repository.base.BaseRxRepositoryImpl
import com.battisq.comicsreader.data.local.repository.repository.RxRepositoryContract

class PageMatchRepositoryImpl(dao: PageMatchDao): BaseRxRepositoryImpl<PageMatchEntity>(dao),
    RxRepositoryContract.PageMatchRepository {

    override val tableName: String = PrimaryDatabase.Tables.PAGE_MATCH
}
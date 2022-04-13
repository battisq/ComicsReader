package com.battisq.comicsreader.data.local.repository.repository.page_link

import com.battisq.comicsreader.data.local.database.PrimaryDatabase
import com.battisq.comicsreader.data.local.database.dao.dao.PageLinkDao
import com.battisq.comicsreader.data.local.database.entity.page_link.PageLinkEntity
import com.battisq.comicsreader.data.local.repository.base.BaseRxRepositoryImpl
import com.battisq.comicsreader.data.local.repository.repository.RxRepositoryContract

class PageLinkRepositoryImpl(dao: PageLinkDao): BaseRxRepositoryImpl<PageLinkEntity>(dao),
    RxRepositoryContract.PageLinkRepository {

    override val tableName: String = PrimaryDatabase.Tables.PAGE_LINK
}
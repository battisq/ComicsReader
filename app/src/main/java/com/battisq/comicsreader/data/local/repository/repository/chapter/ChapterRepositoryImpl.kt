package com.battisq.comicsreader.data.local.repository.repository.chapter

import com.battisq.comicsreader.data.local.database.PrimaryDatabase
import com.battisq.comicsreader.data.local.database.dao.dao.ChapterDao
import com.battisq.comicsreader.data.local.database.entity.chapter.ChapterEntity
import com.battisq.comicsreader.data.local.repository.base.BaseRxRepositoryImpl
import com.battisq.comicsreader.data.local.repository.repository.RxRepositoryContract

class ChapterRepositoryImpl(dao: ChapterDao) : BaseRxRepositoryImpl<ChapterEntity>(dao),
    RxRepositoryContract.ChapterRepository {

    override val tableName: String = PrimaryDatabase.Tables.CHAPTER
}
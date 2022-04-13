package com.battisq.comicsreader.data.local.repository.repository.chapter_match

import com.battisq.comicsreader.data.local.database.PrimaryDatabase
import com.battisq.comicsreader.data.local.database.dao.dao.ChapterDao
import com.battisq.comicsreader.data.local.database.dao.dao.ChapterMatchDao
import com.battisq.comicsreader.data.local.database.entity.chapter.ChapterEntity
import com.battisq.comicsreader.data.local.database.entity.chapter_match.ChapterMatchEntity
import com.battisq.comicsreader.data.local.repository.base.BaseRxRepositoryImpl
import com.battisq.comicsreader.data.local.repository.repository.RxRepositoryContract

class ChapterMatchRepositoryImpl(dao: ChapterMatchDao) : BaseRxRepositoryImpl<ChapterMatchEntity>(dao),
    RxRepositoryContract.ChapterMatchRepository {

    override val tableName: String = PrimaryDatabase.Tables.CHAPTER_MATCH
}
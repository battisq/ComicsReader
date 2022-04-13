package com.battisq.comicsreader.data.local.repository.repository

import com.battisq.comicsreader.data.local.database.entity.chapter.ChapterEntity
import com.battisq.comicsreader.data.local.database.entity.chapter_match.ChapterMatchEntity
import com.battisq.comicsreader.data.local.database.entity.page_link.PageLinkEntity
import com.battisq.comicsreader.data.local.database.entity.page_match.PageMatchEntity
import com.battisq.comicsreader.data.local.repository.base.BaseRxRepository

interface RxRepositoryContract {

    interface ChapterRepository: BaseRxRepository<ChapterEntity>
    interface ChapterMatchRepository: BaseRxRepository<ChapterMatchEntity>
    interface PageLinkRepository: BaseRxRepository<PageLinkEntity>
    interface PageMatchRepository: BaseRxRepository<PageMatchEntity>
}
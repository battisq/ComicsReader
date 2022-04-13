package com.battisq.comicsreader.data.local.database.dao

import com.battisq.comicsreader.data.local.database.dao.dao.ChapterDao
import com.battisq.comicsreader.data.local.database.dao.dao.ChapterMatchDao
import com.battisq.comicsreader.data.local.database.dao.dao.PageLinkDao
import com.battisq.comicsreader.data.local.database.dao.dao.PageMatchDao

interface DaoContract {

    val chapterDao: ChapterDao
    val chapterMatchDao: ChapterMatchDao
    val pageLinkDao: PageLinkDao
    val pageMatchDao: PageMatchDao
}
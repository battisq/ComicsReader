package com.battisq.comicsreader.app.di.modules.data.local.repository

import com.battisq.comicsreader.data.local.database.dao.dao.ChapterDao
import com.battisq.comicsreader.data.local.database.dao.dao.ChapterMatchDao
import com.battisq.comicsreader.data.local.database.dao.dao.PageLinkDao
import com.battisq.comicsreader.data.local.database.dao.dao.PageMatchDao
import com.battisq.comicsreader.data.local.repository.repository.RxRepositoryContract
import com.battisq.comicsreader.data.local.repository.repository.chapter.ChapterRepositoryImpl
import com.battisq.comicsreader.data.local.repository.repository.chapter_match.ChapterMatchRepositoryImpl
import com.battisq.comicsreader.data.local.repository.repository.page_link.PageLinkRepositoryImpl
import com.battisq.comicsreader.data.local.repository.repository.page_match.PageMatchRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.Reusable

@Module
object PrimaryRepositoryModule {

    @Provides
    @Reusable
    fun provideChapterRepository(
        chapterDao: ChapterDao
    ): RxRepositoryContract.ChapterRepository = ChapterRepositoryImpl(chapterDao)

    @Provides
    @Reusable
    fun provideChapterMatchRepository(
        chapterMatchDao: ChapterMatchDao
    ): RxRepositoryContract.ChapterMatchRepository = ChapterMatchRepositoryImpl(chapterMatchDao)

    @Provides
    @Reusable
    fun providePageLinkRepository(
        pageLinkDao: PageLinkDao
    ): RxRepositoryContract.PageLinkRepository = PageLinkRepositoryImpl(pageLinkDao)

    @Provides
    @Reusable
    fun providePageMatchRepository(
        pageMatchDao: PageMatchDao
    ): RxRepositoryContract.PageMatchRepository = PageMatchRepositoryImpl(pageMatchDao)
}
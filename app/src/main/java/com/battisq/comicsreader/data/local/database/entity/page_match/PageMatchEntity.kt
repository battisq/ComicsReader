package com.battisq.comicsreader.data.local.database.entity.page_match

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import com.battisq.comicsreader.data.local.database.PrimaryDatabase
import com.battisq.comicsreader.data.local.database.entity.chapter.ChapterEntity
import com.battisq.comicsreader.data.local.database.entity.page_link.PageLinkEntity
import com.battisq.comicsreader.data.local.database.entity.page_match.PageMatchEntity.Fields.CHAPTER_ID
import com.battisq.comicsreader.data.local.database.entity.page_match.PageMatchEntity.Fields.PAGE_LINK

@Entity(
    tableName = PrimaryDatabase.Tables.PAGE_MATCH,
    primaryKeys = [CHAPTER_ID],
    foreignKeys = [
        ForeignKey(
            entity = ChapterEntity::class,
            parentColumns = arrayOf(ChapterEntity.Fields.ID),
            childColumns = arrayOf(CHAPTER_ID)
        ),
        ForeignKey(
            entity = PageLinkEntity::class,
            parentColumns = arrayOf(PageLinkEntity.Fields.LINK),
            childColumns = arrayOf(PAGE_LINK)
        )
    ]
)
class PageMatchEntity(
    @ColumnInfo(name = CHAPTER_ID) val chapterId: Int,
    @ColumnInfo(name = PAGE_LINK) val pageLink: String
) {
    object Fields {
        const val CHAPTER_ID = "chapter_id"
        const val PAGE_LINK = "page_link"
    }
}
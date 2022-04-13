package com.battisq.comicsreader.data.local.database.entity.chapter_match

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import com.battisq.comicsreader.data.local.database.PrimaryDatabase
import com.battisq.comicsreader.data.local.database.entity.chapter.ChapterEntity
import com.battisq.comicsreader.data.local.database.entity.chapter_match.ChapterMatchEntity.Fields.CHAPTER_ID
import com.battisq.comicsreader.data.local.database.entity.chapter_match.ChapterMatchEntity.Fields.NEXT_CHAPTER_ID
import com.battisq.comicsreader.data.local.database.entity.chapter_match.ChapterMatchEntity.Fields.PREVIOUS_CHAPTER_ID

@Entity(
    tableName = PrimaryDatabase.Tables.CHAPTER_MATCH,
    primaryKeys = [CHAPTER_ID],
    foreignKeys = [
        ForeignKey(
            entity = ChapterEntity::class,
            parentColumns = arrayOf(ChapterEntity.Fields.ID),
            childColumns = arrayOf(NEXT_CHAPTER_ID)
        ),
        ForeignKey(
            entity = ChapterEntity::class,
            parentColumns = arrayOf(ChapterEntity.Fields.ID),
            childColumns = arrayOf(PREVIOUS_CHAPTER_ID)
        )
    ]
)
data class ChapterMatchEntity(
    @ColumnInfo(name = CHAPTER_ID) val chapterId: Int,
    @ColumnInfo(name = NEXT_CHAPTER_ID) val nextChapterId: Int?,
    @ColumnInfo(name = PREVIOUS_CHAPTER_ID) val previousChapterId: Int?
) {

    object Fields {
        const val CHAPTER_ID = "chapter_id"
        const val NEXT_CHAPTER_ID = "next_chapter_id"
        const val PREVIOUS_CHAPTER_ID = "previous_chapter_id"
    }
}
package com.battisq.comicsreader.data.local.database.entity.chapter

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.battisq.comicsreader.data.local.database.PrimaryDatabase

@Entity(tableName = PrimaryDatabase.Tables.CHAPTER)
data class ChapterEntity(
    @PrimaryKey
    val id: Int,
    val name: String,
    val text: String
) {

    object Fields {
        const val ID = "id"
        const val NAME = "name"
        const val TEXT = "text"
    }
}

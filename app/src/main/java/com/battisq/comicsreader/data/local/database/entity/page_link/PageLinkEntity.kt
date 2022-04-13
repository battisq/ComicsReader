package com.battisq.comicsreader.data.local.database.entity.page_link

import androidx.room.ColumnInfo
import androidx.room.Entity
import com.battisq.comicsreader.data.local.database.PrimaryDatabase
import com.battisq.comicsreader.data.local.database.entity.page_link.PageLinkEntity.Fields.LINK
import com.battisq.comicsreader.data.local.database.entity.page_link.PageLinkEntity.Fields.ORDINAL

@Entity(
    tableName = PrimaryDatabase.Tables.PAGE_LINK,
    primaryKeys = [ORDINAL, LINK],
)
data class PageLinkEntity(
    @ColumnInfo(name = ORDINAL) val ordinal: Int,
    @ColumnInfo(name = LINK) val link: String
) {
    object Fields {
        const val ORDINAL = "ordinal"
        const val LINK = "link"
    }
}
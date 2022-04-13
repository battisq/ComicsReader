package com.battisq.comicsreader.data.local.repository.utils

import androidx.sqlite.db.SimpleSQLiteQuery

object QueryBuilderUtils {


    fun String.toQuery() = let(::SimpleSQLiteQuery)
}
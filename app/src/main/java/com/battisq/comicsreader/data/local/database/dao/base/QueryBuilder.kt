package com.battisq.comicsreader.data.local.database.dao.base

import com.battisq.comicsreader.data.local.database.dao.base.QueryBuilder.Expressions.ALL
import com.battisq.comicsreader.data.local.database.dao.base.QueryBuilder.Expressions.FROM
import com.battisq.comicsreader.data.local.database.dao.base.QueryBuilder.Expressions.LIMIT
import com.battisq.comicsreader.data.local.database.dao.base.QueryBuilder.Expressions.OFFSET
import com.battisq.comicsreader.data.local.database.dao.base.QueryBuilder.Expressions.SELECT
import com.battisq.comicsreader.data.local.repository.utils.QueryBuilderUtils.toQuery

object QueryBuilder {

    fun getAll(tableName: String) =
        "$SELECT $ALL $FROM $tableName".toQuery()

    fun getAll(tableName: String, skip: Int, limit: Int) =
        "$SELECT $ALL $FROM $tableName $LIMIT $limit $OFFSET $skip".toQuery()

    object Direction {
        const val ASCENDING = "ASC"
        const val DESCENDING = "DESC"
    }

    object Operators {
        const val EQUAL_TO = "="
        const val IN = "IN"
        const val NOT_EQUAL_TO = "!="
        const val BIGGER_THAN = ">"
        const val LESS_THAN = "<"
        const val BIGGER_THAN_OR_EQUAL_TO = ">="
        const val LESS_THAN_OR_EQUAL_TO = "<="
    }

    object Expressions {
        const val WHERE = "WHERE"
        const val AND = "AND"
        const val OR = "OR"
        const val SELECT = "SELECT"
        const val DELETE = "DELETE"
        const val ALL = "*"
        const val FROM = "FROM"
        const val LIMIT = "LIMIT"
        const val OFFSET = "OFFSET"
        const val LIKE = "LIKE"
        const val ORDER_BY = "ORDER BY"
        const val INNER_JOIN = "INNER JOIN"
        const val ON = "ON"
        const val IS_NULL = "IS NULL"
        const val IS_NOT_NULL = "IS NOT NULL"
    }
}
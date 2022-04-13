package com.battisq.comicsreader.data.local.repository.base

import com.battisq.comicsreader.data.local.database.dao.base.BaseRxDao
import com.battisq.comicsreader.data.local.database.dao.base.QueryBuilder

abstract class BaseRxRepositoryImpl<T>(protected open val dao: BaseRxDao<T>): BaseRxRepository<T> {

    abstract val tableName: String

    override fun insert(item: T) = dao.insertItem(item)

    override fun insertAll(items: List<T>) = dao.insertAll(items)

    override fun getAll() = QueryBuilder
        .getAll(tableName)
        .let(dao::getAll)

    override fun getAll(skip: Int, limit: Int) = QueryBuilder
        .getAll(tableName, skip, limit)
        .let(dao::getAll)
}
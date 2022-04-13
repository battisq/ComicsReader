package com.battisq.comicsreader.data.local.database.dao.base

import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.RawQuery
import androidx.sqlite.db.SupportSQLiteQuery
import io.reactivex.rxjava3.core.Completable
import io.reactivex.rxjava3.core.Maybe
import io.reactivex.rxjava3.core.Single

interface BaseRxDao<T> {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertItem(item: T): Completable

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(list: List<T>): Completable

    @RawQuery
    fun getAll(query: SupportSQLiteQuery): Single<List<T>>

    @RawQuery
    fun getItem(query: SupportSQLiteQuery): Single<T>

    @RawQuery
    fun getOptionalItem(query: SupportSQLiteQuery): Maybe<T>

    @RawQuery
    fun deleteAll(query: SupportSQLiteQuery)
}
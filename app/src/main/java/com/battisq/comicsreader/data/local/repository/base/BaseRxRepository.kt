package com.battisq.comicsreader.data.local.repository.base

import io.reactivex.rxjava3.core.Completable
import io.reactivex.rxjava3.core.Single

interface BaseRxRepository<T> {

    fun insert(item: T): Completable
    fun insertAll(items: List<T>): Completable

    fun getAll(): Single<List<T>>
    fun getAll(skip: Int, limit: Int): Single<List<T>>
}
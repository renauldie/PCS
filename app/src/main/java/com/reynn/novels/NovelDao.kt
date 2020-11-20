package com.reynn.novels

import androidx.room.*

@Dao
interface NovelDao {
    @Insert
    fun insert(novel: Novel)

    @Update
    fun update(novel: Novel)

    @Delete
    fun delete(novel: Novel)

    @Query ("SELECT * FROM novel")
    fun selectAll() : List<Novel>

    @Query("SELECT * FROM novel WHERE id=:id")
    fun select(id: Int) : Novel
}
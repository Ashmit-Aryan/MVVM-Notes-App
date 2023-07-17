package com.devdojohub.notestakingapp.model.Room

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow

@Dao
interface RoomDao {
    @Insert
    suspend fun InsertNotes(note: Notes)

    @Update
    suspend fun UpdateNote(note: Notes)

    @Delete
    suspend fun DeleteNote(note: Notes)

    @Query("select * from notes")
    fun getAllNotes(): Flow<List<Notes>>

    @Query("select * from notes order by date DESC ")
    fun getNotesByDate():Flow<List<Notes>>

    @Query("select * from notes order by priority DESC")
    fun getNotesByPriority(): Flow<List<Notes>>
}
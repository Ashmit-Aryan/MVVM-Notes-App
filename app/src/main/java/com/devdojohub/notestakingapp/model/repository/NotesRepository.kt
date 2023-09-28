package com.devdojohub.notestakingapp.model.repository


import com.devdojohub.notestakingapp.model.Room.Notes
import kotlinx.coroutines.flow.Flow

interface NotesRepository {
    //To Enter Notes
    suspend fun addNotes(notes: Notes)


    suspend fun updateNote(note: Notes)


    suspend fun deleteNotes(note: Notes)


    fun getAllNotes(): Flow<List<Notes>>


    fun getNotesByDate(): Flow<List<Notes>>


    fun getNotesByPriority(): Flow<List<Notes>>
}
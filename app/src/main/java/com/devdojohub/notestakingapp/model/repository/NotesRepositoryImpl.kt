package com.devdojohub.notestakingapp.model.repository

import com.devdojohub.notestakingapp.model.Room.Notes
import com.devdojohub.notestakingapp.model.Room.RoomDao
import kotlinx.coroutines.flow.Flow

class NotesRepositoryImpl(private val dao:RoomDao):NotesRepository {
    override suspend fun addNotes(notes: Notes) {
        return dao.InsertNotes(notes)
    }

    override suspend fun updateNote(note: Notes) {
        return dao.UpdateNote(note)
    }

    override suspend fun deleteNotes(note: Notes) {
        return dao.DeleteNote(note)
    }

    override fun getAllNotes(): Flow<List<Notes>> {
        return dao.getAllNotes()
    }

    override fun getNotesByDate(): Flow<List<Notes>> {
        return dao.getNotesByDate()
    }

    override fun getNotesByPriority(): Flow<List<Notes>> {
    return dao.getNotesByPriority()
    }
}
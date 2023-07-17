package com.devdojohub.notestakingapp.model.Room

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [Notes::class],
    version = 1
)
abstract class RoomDatabase:RoomDatabase() {
    abstract val dao:RoomDao
}
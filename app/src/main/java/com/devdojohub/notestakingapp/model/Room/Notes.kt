package com.devdojohub.notestakingapp.model.Room

import android.webkit.WebSettings.RenderPriority
import androidx.compose.ui.graphics.Color
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.Date

@Entity
data class Notes(
    val title: String,
    val description: String,
    val priority: Int,
    val color: Long,
    val date: Date,
    @PrimaryKey(autoGenerate = true) val id: Int
)

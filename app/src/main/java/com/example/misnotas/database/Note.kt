package com.example.notes.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "note_data_table")
data class Note (

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "note_id")
    val id: Int,

    @ColumnInfo(name="note_title")
    val titulo: String,

    @ColumnInfo(name="note_description")
    val descripcion: String
)
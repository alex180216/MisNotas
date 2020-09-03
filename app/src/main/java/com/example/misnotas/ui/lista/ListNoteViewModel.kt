package com.example.misnotas.ui.lista

import android.app.Application
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.notes.database.Note
import com.example.notes.database.NoteDAO

class ListNoteViewModel(dataSource:NoteDAO, application: Application): ViewModel() {

    val dataBase = dataSource

    private var note = MutableLiveData<Note?>()

    val notes = dataBase.getAllNotes()
}
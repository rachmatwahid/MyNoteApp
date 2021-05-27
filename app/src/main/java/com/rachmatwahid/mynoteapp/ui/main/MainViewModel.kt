package com.rachmatwahid.mynoteapp.ui.main

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.rachmatwahid.mynoteapp.db.Note
import com.rachmatwahid.mynoteapp.repository.NoteRepository

class MainViewModel(application: Application): ViewModel() {

    private val noteRepository: NoteRepository = NoteRepository(application)

    fun getAllNotes(): LiveData<List<Note>> = noteRepository.getAllNotes()
}
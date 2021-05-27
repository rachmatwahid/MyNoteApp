package com.rachmatwahid.mynoteapp.ui.insert

import android.app.Application
import androidx.lifecycle.ViewModel
import com.rachmatwahid.mynoteapp.db.Note
import com.rachmatwahid.mynoteapp.repository.NoteRepository

class NoteAddUpdateViewModel(application: Application): ViewModel() {

    private val noteRepository: NoteRepository = NoteRepository(application)

    fun insert(note: Note) {
        noteRepository.insert(note)
    }

    fun update(note: Note) {
        noteRepository.update(note)
    }
    fun delete(note: Note) {
        noteRepository.delete(note)
    }
}
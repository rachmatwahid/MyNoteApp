package com.rachmatwahid.mynoteapp.helper

import androidx.recyclerview.widget.DiffUtil
import com.rachmatwahid.mynoteapp.db.Note

class NoteDiffCallback(private val oldNotes: List<Note>, private val newNotes: List<Note>): DiffUtil.Callback() {
    override fun getOldListSize(): Int {
        return oldNotes.size
    }

    override fun getNewListSize(): Int {
        return newNotes.size
    }

    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return oldNotes[oldItemPosition].id == newNotes[newItemPosition].id
    }

    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        val oldEmployee = oldNotes[oldItemPosition]
        val newEmployee = newNotes[newItemPosition]
        return oldEmployee.title == newEmployee.title && oldEmployee.description == newEmployee.description
    }
}
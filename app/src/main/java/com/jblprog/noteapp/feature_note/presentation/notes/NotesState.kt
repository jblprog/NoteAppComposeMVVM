package com.jblprog.noteapp.feature_note.presentation.notes

import com.jblprog.noteapp.feature_note.domain.model.Note
import com.jblprog.noteapp.feature_note.domain.util.NoteOrder
import com.jblprog.noteapp.feature_note.domain.util.OrderType

data class NotesState(
    val notes : List<Note> = emptyList(),
    val noteOder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSectionVisible: Boolean = false
)

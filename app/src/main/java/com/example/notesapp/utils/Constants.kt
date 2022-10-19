package com.example.notesapp.utils

import com.example.notesapp.database.DatabaseRepository

const val TYPE_DATABASE = "Type_database"
const val TYPE_ROOM = "Type_room"
const val TYPE_FIREBASE = "Type_firebase"


lateinit var REPOSITORY: DatabaseRepository
lateinit var LOGIN: String
lateinit var PASSWORD: String

object Constants{
    object Keys{
        const val NOTE_DATABASE = "notes_database"
        const val NOTES_TABLE = "notes_table"
        const val ADD_NEW_NOTE = "Add new note"
        const val NOTE_TITLE = "Note title"
        const val NOTE_SUBTITLE = "Note subtitle"
        const val ADD_NOTE = "Add note"
        const val TITLE = "Title"
        const val SUBTITLE = "Subtitle"
        const val WHAT_WILL_WE_USE = "What will we use?"
        const val ROOM_DATABASE = "Room database"
        const val FIREBASE_DATABASE = "Firebase database"
        const val ADD_ICONS = "Add icons"
        const val ID = "Id"
        const val NONE = "none"
        const val UPDATE = "UPDATE"
        const val DELETE = "DELETE"
        const val NAV_BACK  = "NAV_BACK"
        const val EDIT_NOTE = "Edit_note"
        const val EMPTY = ""
        const val UPDATE_NOTE = "Update note"
        const val SIGN_IN = "Sign in"
        const val LOG_IN = "Log in"
        const val LOGIN_TEXT = "Login"
        const val PASSWORD = "password"


    }
    object Screens{
        const val START_SCREEN = "start_screen"
        const val MAIN_SCREEN = "main_screen"
        const val ADD_SCREEN = "add_screen"
        const val NOTE_SCREEN = "note_screen"
    }
}
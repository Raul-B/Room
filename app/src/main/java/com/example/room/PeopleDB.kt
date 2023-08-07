package com.example.room

import androidx.room.Database

@Database(
    entities = [Person::class],
    version = 1
)
abstract class PeopleDB {
    abstract fun personDao(): PersonDao
}
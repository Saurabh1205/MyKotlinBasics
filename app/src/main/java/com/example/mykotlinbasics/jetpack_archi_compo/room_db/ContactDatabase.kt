package com.example.mykotlinbasics.jetpack_archi_compo.room_db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters

@Database(entities = [Contact::class], version = 1)
@TypeConverters(Converters::class)
abstract class ContactDatabase : RoomDatabase() {
    abstract fun contactDao(): ContactDAO

    companion object {
        @Volatile
        private var INSTANCE: ContactDatabase? = null

        @Synchronized
        fun getDatabase(context: Context): ContactDatabase {
        if(INSTANCE == null) {
            INSTANCE = Room.databaseBuilder(context.applicationContext,
                ContactDatabase::class.java,
                "contactDB").build()
        }
            return INSTANCE!!
        }
    }
}
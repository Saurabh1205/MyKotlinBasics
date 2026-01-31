package com.example.mykotlinbasics.jetpack_archi_compo.room_db

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.Date

@Entity(tableName = "Contact")
data class Contact(
    @PrimaryKey(autoGenerate = true)
    val id : Long,
    val name: String,
    val phone: String,
    val createdDate: Date
)

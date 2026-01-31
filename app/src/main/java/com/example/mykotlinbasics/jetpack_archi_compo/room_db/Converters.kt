package com.example.mykotlinbasics.jetpack_archi_compo.room_db

import androidx.room.TypeConverter
import java.util.Date

class Converters {

    @TypeConverter
    fun formLongtoDate(value : Long) :Date = Date(value)

    @TypeConverter
    fun fromDatetoLong(value  : Date) :  Long = value.time
}
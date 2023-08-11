package com.ekzakh.cocktailbar.data.db

import androidx.room.ProvidedTypeConverter
import androidx.room.TypeConverter

@ProvidedTypeConverter
object IngredientsConverter {

    @TypeConverter
    fun fromObject(obj: List<String>): String = obj.joinToString(";")

    @TypeConverter
    fun toObject(value: String): List<String> = value.split(";")
}

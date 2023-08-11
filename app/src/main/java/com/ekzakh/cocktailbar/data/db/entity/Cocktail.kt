package com.ekzakh.cocktailbar.data.db.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.TypeConverters
import com.ekzakh.cocktailbar.data.db.IngredientsConverter

@Entity(tableName = "cocktails_table")
@TypeConverters(IngredientsConverter::class)
data class Cocktail(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    val id: Int,
    @ColumnInfo(name = "title")
    val title: String,
    @ColumnInfo(name = "ingredients")
    val ingredients: List<String>,
)

package com.ekzakh.cocktailbar.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.ekzakh.cocktailbar.data.db.entity.Cocktail

@Database(
    entities = [Cocktail::class],
    version = 1
)
abstract class CocktailsDatabase : RoomDatabase() {
    abstract fun cocktailsDao(): CocktailsDao

    companion object {
        const val COCKTAILS_DB_NAME = "cocktails_db"
    }
}

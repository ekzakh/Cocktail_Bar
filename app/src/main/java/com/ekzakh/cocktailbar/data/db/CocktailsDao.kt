package com.ekzakh.cocktailbar.data.db

import androidx.room.Dao
import androidx.room.Query
import com.ekzakh.cocktailbar.data.db.entity.Cocktail

@Dao
interface CocktailsDao {
    @Query("SELECT * FROM cocktails_table")
    fun cocktails(): List<Cocktail>

    @Query("SELECT * FROM cocktails_table WHERE id = :id")
    fun cocktail(id: Int): Cocktail
}

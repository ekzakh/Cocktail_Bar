package com.ekzakh.cocktailbar.data

import com.ekzakh.cocktailbar.data.db.CocktailsDao
import com.ekzakh.cocktailbar.data.db.entity.Cocktail

interface CocktailsRepository {
    suspend fun cocktails(): List<Cocktail>
    suspend fun cocktail(id: Int): Cocktail

    class Base(private val cocktailsDao: CocktailsDao) : CocktailsRepository {

        override suspend fun cocktails():List<Cocktail>   = cocktailsDao.cocktails()

        override suspend fun cocktail(id: Int):Cocktail   = cocktailsDao.cocktail(id)
    }
}

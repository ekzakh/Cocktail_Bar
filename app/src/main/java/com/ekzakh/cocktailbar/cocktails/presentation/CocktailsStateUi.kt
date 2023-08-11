package com.ekzakh.cocktailbar.cocktails.presentation

interface CocktailsUi {
    fun map(adapter: CocktailsAdapter)

    object Empty : CocktailsUi {
        override fun map(adapter: CocktailsAdapter) {
            TODO("Not yet implemented")
        }
    }
}

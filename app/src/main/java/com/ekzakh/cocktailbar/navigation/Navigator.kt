package com.ekzakh.cocktailbar.navigation

import androidx.fragment.app.Fragment

fun Fragment.navigator(): Navigator {
    return requireActivity() as Navigator
}

interface Navigator {
    fun navigateToCreate()
    fun navigateToCocktails()
    fun navigateToInitial()
    fun navigateToCocktailDetails()
}

package com.ekzakh.cocktailbar.initial

import androidx.lifecycle.ViewModel
import com.ekzakh.cocktailbar.data.CocktailsRepository

interface InitialViewModel {
    fun init()

    class Base()  : ViewModel(), InitialViewModel {
        override fun init() {
        }
    }
}

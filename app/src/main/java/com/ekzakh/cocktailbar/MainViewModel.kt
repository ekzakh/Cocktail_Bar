package com.ekzakh.cocktailbar

import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import com.ekzakh.cocktailbar.data.CocktailsRepository

interface MainViewModel {
    fun init()

    class Base(private val repository: CocktailsRepository): ViewModel(), MainViewModel{
        override fun init() {
            TODO("Not yet implemented")
        }
    }
}

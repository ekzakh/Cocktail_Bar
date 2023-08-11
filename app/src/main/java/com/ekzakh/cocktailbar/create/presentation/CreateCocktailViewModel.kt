package com.ekzakh.cocktailbar.create.presentation

import android.net.Uri
import androidx.lifecycle.ViewModel
import com.ekzakh.cocktailbar.data.CocktailsRepository

interface CreateCocktailViewModel {
    fun save(title: String, description: String, recipe: String, image: Uri)
    fun takePicture()
    fun close()

    class Base(private val repository: CocktailsRepository) : ViewModel(), CreateCocktailViewModel {
        override fun save(title: String, description: String, recipe: String, image: Uri) {
            TODO("Not yet implemented")
        }

        override fun takePicture() {
            TODO("Not yet implemented")
        }

        override fun close() {
            TODO("Not yet implemented")
        }
    }
}

package com.ekzakh.cocktailbar.di

import androidx.room.Room
import com.ekzakh.cocktailbar.create.presentation.CreateCocktailViewModel
import com.ekzakh.cocktailbar.data.CocktailsRepository
import com.ekzakh.cocktailbar.data.db.CocktailsDatabase
import com.ekzakh.cocktailbar.data.db.CocktailsDatabase.Companion.COCKTAILS_DB_NAME
import com.ekzakh.cocktailbar.initial.InitialViewModel
import org.koin.android.ext.koin.androidContext
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import java.lang.reflect.Array.get

val appModule = module {
    single {
        Room.databaseBuilder(
            androidContext(),
            CocktailsDatabase::class.java,
            COCKTAILS_DB_NAME,
        ).build()
    }
    single {
        val database = get<CocktailsDatabase>()
        database.cocktailsDao()
    }
    single<CocktailsRepository> { CocktailsRepository.Base(get()) }
    viewModel { InitialViewModel.Base() }
    viewModel { CreateCocktailViewModel.Base(get()) }
    viewModel { CreateCocktailViewModel.Base(get()) }
}

package com.ekzakh.cocktailbar

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.NavHostFragment
import com.ekzakh.cocktailbar.cocktails.presentation.CocktailsListFragment
import com.ekzakh.cocktailbar.create.presentation.CreateCocktailFragment
import com.ekzakh.cocktailbar.initial.InitialFragment
import com.ekzakh.cocktailbar.navigation.Navigator

class MainActivity : AppCompatActivity(), Navigator {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.container) as NavHostFragment
    }

    override fun navigateToCreate() {
        navigate(CreateCocktailFragment())
    }

    override fun navigateToCocktails() {
        navigate(CocktailsListFragment())
    }

    override fun navigateToInitial() {
        navigate(InitialFragment())
    }

    override fun navigateToCocktailDetails() {
        TODO("Not yet implemented")
    }

    private fun navigate(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.container, fragment)
            .addToBackStack(fragment.tag)
            .commit()
    }
}

package com.ekzakh.cocktailbar.navigation

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager

interface Screen {

    fun navigate(manager: FragmentManager, containerId: Int)

    abstract class Replace(private val clazz: Class<out Fragment>) : Screen {
        override fun navigate(manager: FragmentManager, containerId: Int) {
            manager.beginTransaction()
                .replace(containerId, clazz.newInstance())
                .commit()
        }
    }

    object Pop : Screen {
        override fun navigate(manager: FragmentManager, containerId: Int) {
            manager.popBackStack()
        }
    }
}

package com.example.vegetarianmealplanner

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Search
import androidx.compose.ui.graphics.vector.ImageVector

data class BottomNavigationItem(
    val label : String = "",
    val icon : ImageVector = Icons.Filled.Home,
    val route : String = ""
) {

    fun bottomNavigationItems() : List<BottomNavigationItem> {
        return listOf(
            BottomNavigationItem(
                label = "Recipe",
                icon = Icons.Filled.Home,
                route = Screens.Recipes.route
            ),
            BottomNavigationItem(
                label = "Planner",
                icon = Icons.Filled.Search,
                route = Screens.Planner.route
            ),
            BottomNavigationItem(
                label = "GroceryList",
                icon = Icons.Filled.AccountCircle,
                route = Screens.GroceryList.route
            ),
        )
    }
}

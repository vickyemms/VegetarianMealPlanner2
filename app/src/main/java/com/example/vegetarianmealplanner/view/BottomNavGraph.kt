package com.example.vegetarianmealplanner.view

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import com.example.vegetarianmealplanner.Screens
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun BottomNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = Screens.Recipes.route,
        modifier = Modifier
    ) {
        composable(route = Screens.Recipes.route) {
            RecipeScreen()
        }
        composable(route = Screens.Planner.route) {
            PlannerScreen()
        }
        composable(route = Screens.GroceryList.route) {
            GroceryListScreen()
        }
    }
}
package com.example.vegetarianmealplanner

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.vegetarianmealplanner.view.GroceryListScreen
import com.example.vegetarianmealplanner.view.PlannerScreen
import com.example.vegetarianmealplanner.view.RecipeScreen


@Composable
fun BottomNavGraph(navController: NavHostController){
    NavHost(
        navController = navController,
        startDestination = BottomBarScreen.Recipe.route
    ){
        composable(route = BottomBarScreen.Recipe.route){
            RecipeScreen()
        }
        composable(route = BottomBarScreen.Planner.route){
            PlannerScreen()
        }
        composable(route = BottomBarScreen.GroceryList.route){
            GroceryListScreen()
        }
    }
}
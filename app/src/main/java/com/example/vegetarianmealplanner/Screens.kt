package com.example.vegetarianmealplanner

sealed class Screens(val route : String) {
    object Recipes : Screens("recipes")
    object Planner : Screens("planner")
    object GroceryList : Screens("groceryList")

    object RecipeDetails : Screens("recipeDetails")
}

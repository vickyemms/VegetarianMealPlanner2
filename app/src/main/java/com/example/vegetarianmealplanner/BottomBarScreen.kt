package com.example.vegetarianmealplanner

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Add
import androidx.compose.material.icons.rounded.DateRange
import androidx.compose.material.icons.rounded.List
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomBarScreen(
    val route: String,
    val label: String,
    val icon: ImageVector
) {
    object Recipe: BottomBarScreen(
        route="recipe",
        label="Recipe",
        icon= Icons.Rounded.Add
    )
    object Planner: BottomBarScreen(
        route="planner",
        label="Planner",
        icon= Icons.Rounded.DateRange
    )
    object GroceryList: BottomBarScreen(
        route="groceryList",
        label="GroceryList",
        icon= Icons.Rounded.List
    )
}

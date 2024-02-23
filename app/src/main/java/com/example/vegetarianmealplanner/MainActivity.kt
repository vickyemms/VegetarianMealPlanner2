package com.example.vegetarianmealplanner

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.vegetarianmealplanner.ui.theme.VegetarianMealPlannerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            VegetarianMealPlannerTheme {
                MainScreen()
            }
        }
    }
}

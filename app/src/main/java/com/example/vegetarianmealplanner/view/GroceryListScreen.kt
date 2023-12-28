package com.example.vegetarianmealplanner.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import com.example.vegetarianmealplanner.ui.theme.PurpleGrey40

@Composable
fun GroceryListScreen(){
    Box(modifier = Modifier
        .fillMaxSize()
        .background(PurpleGrey40),
        contentAlignment = Alignment.Center) {
        Text(text = "Grocery List", fontSize = 100.sp)
    }
}
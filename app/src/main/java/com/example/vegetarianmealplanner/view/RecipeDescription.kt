package com.example.vegetarianmealplanner.view

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.unit.sp

@Composable
fun RecipeDescription(
    string: String
){
    Text(
        text = string,
        fontSize = 12.sp,
        fontStyle = FontStyle.Italic
    )
}

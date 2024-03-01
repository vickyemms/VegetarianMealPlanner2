package com.example.vegetarianmealplanner.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.vegetarianmealplanner.data.RecipeData
import com.example.vegetarianmealplanner.ui.theme.VegetarianMealPlannerTheme

@Composable
fun RecipeScreen(){

    val recipes = RecipeData.recipes

    LazyColumn(
        modifier = Modifier.fillMaxSize()
    ){
        items(recipes.size){recipe ->

            val painter: Painter = painterResource(id = recipes[recipe].imageResourceId)

            Column {
                Text(text = recipes[recipe].name)
                Row(
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Image(painter = painter, contentDescription = "")
                    Column {
                        Text(text = recipes[recipe].cuisine)
                        Text(text = recipes[recipe].protein)
                        Text(text = recipes[recipe].healthiness)
                    }
                    Button(onClick = { /*TODO*/ }) {
                        Text(text = "Add")
                    }

                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Preview1() {
    VegetarianMealPlannerTheme {
        RecipeScreen()
    }
}
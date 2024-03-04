package com.example.vegetarianmealplanner.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.vegetarianmealplanner.data.RecipeData
import com.example.vegetarianmealplanner.ui.theme.VegetarianMealPlannerTheme

@Composable
fun RecipeScreen(){

    val recipes = RecipeData.recipes

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 60.dp)
            .padding(5.dp)
    ){
        items(recipes.size){recipe ->

            val painter: Painter = painterResource(id = recipes[recipe].imageResourceId)

            Column (modifier = Modifier
                .padding(5.dp)
                .clickable {

                }
            ) {
                Text(
                    text = recipes[recipe].name,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(vertical = 5.dp)
                )
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Image(painter = painter, contentDescription = recipes[recipe].name)
                    Column {
                        RecipeDescription(string = recipes[recipe].cuisine)
                        RecipeDescription(string = recipes[recipe].protein)
                        RecipeDescription(string = recipes[recipe].healthiness)
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
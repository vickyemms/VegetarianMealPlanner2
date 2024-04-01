package com.example.vegetarianmealplanner.view

import android.util.Log
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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.vegetarianmealplanner.Screens
import com.example.vegetarianmealplanner.data.RecipeData

@Composable
fun RecipeScreen(navController: NavHostController){

    val recipes = RecipeData.recipes

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(5.dp)
    ){
        items(recipes.size){recipe ->

            val painter: Painter = painterResource(id = recipes[recipe].imageResourceId)

            Column (modifier = Modifier
                .padding(5.dp)
                .clickable {
                    val recipeName = recipes[recipe].name
                    Log.d("RecipeName", "Navigating to RecipeDetailsScreen with recipe name: $recipeName")
                    navController.navigate("${Screens.RecipeDetails.route}?recipeName=$recipeName")
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
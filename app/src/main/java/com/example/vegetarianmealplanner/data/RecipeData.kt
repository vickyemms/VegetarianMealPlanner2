package com.example.vegetarianmealplanner.data

import com.example.vegetarianmealplanner.R
import com.example.vegetarianmealplanner.model.Ingredient
import com.example.vegetarianmealplanner.model.Recipe

object RecipeData {
    val recipes = listOf(
        Recipe(
            "Daal",
            R.drawable.daal,
            "Asian",
            "Lentils",
            "Healthy",
            listOf(
                Ingredient("Onion", 1.0, "", "vegetable", false),
                Ingredient("Garlic", 3.0, "cloves of", "vegetable", false),
                Ingredient("Ginger", 25.0, "g", "vegetable", false),
                Ingredient("Carrot", 2.0, "", "vegetable", false),
                Ingredient("Chili pepper", 0.5, "", "vegetable", false),
                Ingredient("Tomato", 3.0, "", "vegetable", false),
                Ingredient("Lime", 1.0, "", "fruit", false),
                Ingredient("Coconut milk", 1.0, "dl", "asian", false),
                Ingredient("Red lentils", 3.0, "dl", "canned", false),
                Ingredient("Rice", 2.0, "dl", "rice", true),
                Ingredient("Cumin", 1.0, "tsp", "spice", true),
                Ingredient("Garam masala", 1.0, "tsp", "spice", true),
                Ingredient("Turmeric", 1.0, "tsp", "spice", true),
                Ingredient("Salt", 2.0, "tsp", "spice", true),
                Ingredient("Black pepper", 1.0, "tsp", "spice", true),
                Ingredient("Olive oil", 2.0, "tbsp", "oil", true),
            ),
            "1. Heat up olive oil and start cooking the rice. \n" +
                    "2. Cut and chop the onion, garlic, ginger, carrots, chili pepper and tomatoes. \n" +
                    "3. Add the onions and cook until tender for about 2-3 minutes.\n" +
                    "4. Add the garlic, ginger, carrots, chili pepper, cumin, garam masala and turmeric and cook for about 3-4 minutes.\n" +
                    "5. Heat up 6 dl of water and add the red lentils and the water. Let it cook for about 20 minutes. Add salt and black pepper. \n" +
                    "6. Add the chopped tomatoes and coconut milk. Squeeze half a lime to the mix. Let it simmer for 10 minutes.\n" +
                    "7. Serve with the cooked rice."
        ),
        Recipe(
            "Chickpea Curry",
            R.drawable.chickpea_curry,
            "Asian",
            "Chickpeas",
            "Healthy",
            listOf(
                Ingredient("Red onion", 1.0, "", "vegetable", false),
                Ingredient("Garlic", 2.0, "cloves of", "vegetable", false),
                Ingredient("Ginger", 20.0, "g", "vegetable", false),
                Ingredient("Chili pepper", 0.5, "", "vegetable", false),
                Ingredient("Crushed tomatoes", 390.0, "g", "canned", false),
                Ingredient("Coconut milk", 1.0, "dl", "asian", false),
                Ingredient("Chickpeas", 400.0, "g", "canned", false),
                Ingredient("Frozen spinach", 125.0, "g", "frozen", false),
                Ingredient("Cumin", 1.0, "tsp", "spice", true),
                Ingredient("Garam masala", 1.0, "tsp", "spice", true),
                Ingredient("Turmeric", 1.0, "tsp", "spice", true),
                Ingredient("Paprika", 1.0, "tsp", "spice", true),
                Ingredient("Salt", 2.0, "tsp", "spice", true),
                Ingredient("Olive oil", 2.0, "tbsp", "oil", true)
            ),
            "1. Heat up olive oil and start cooking the rice.  \n" +
                    "2. Cut and chop the red onion, garlic, ginger, and chili pepper. \n" +
                    "3. Add the onions and cook until tender for about 2-3 minutes.\n" +
                    "4. Add the garlic, ginger, chili pepper, cumin, garam masala, turmeric and paprika and cook for about 3-4 minutes.\n" +
                    "5. Add the crushed tomatoes, coconut milk and chickpeas and cook for about 7 minutes. \n" +
                    "6. Salt to taste.\n" +
                    "7. Serve with rice."
        ),
        Recipe(
            "Fried Rice with Tofu",
            R.drawable.fried_rice_tofu,
            "Asian",
            "Tofu",
            "Healthy",
            listOf(
                Ingredient("Frozen vegetables", 450.0, "g", "frozen", false),
                Ingredient("Tofu", 400.0, "g", "vegetarian", false),
                Ingredient("Rice", 2.0, "dl", "rice", true),
                Ingredient("Soy sauce", 2.0, "tbsp", "asian", true),
                Ingredient("Lemon pepper", 1.0, "tsp", "spice", true),
                Ingredient("Salt", 1.0, "tsp", "spice", true),
                Ingredient("Olive oil", 2.0, "tbsp", "oil", true)
            ),
            "1. Heat up olive oil and start cooking the rice. \n" +
                    "2. Cut up the tofu. \n" +
                    "3. Add the frozen vegetables, tofu, lemon pepper and salt.\n" +
                    "4. Add the rice and soy sauce when it's done cooking and mix it add together.\n" +
                    "5. Serve."
        ),
        Recipe(
            "Noodle Stir Fry with Tofu",
            R.drawable.noodle_stir_fry,
            "Asian",
            "Tofu",
            "Neutral",
            listOf(
                Ingredient("Frozen vegetables", 450.0, "g", "frozen", false),
                Ingredient("Tofu", 400.0, "g", "vegetarian", false),
                Ingredient("Noodles", 200.0, "g", "asian", false),
                Ingredient("Soy sauce", 2.0, "tbsp", "asian", true),
                Ingredient("Lemon pepper", 1.0, "tsp", "spice", true),
                Ingredient("Salt", 1.0, "tsp", "spice", true),
                Ingredient("Olive oil", 2.0, "tbsp", "oil", true)
            ),
            "1. Heat up olive oil and start cooking the noodles. \n" +
                    "2. Cut up the tofu. \n" +
                    "3. Add the frozen vegetables, tofu, lemon pepper and salt.\n" +
                    "4. Add the noodles and soy sauce when it's done cooking and mix it add together.\n" +
                    "5. Serve."
        ),
        Recipe(
            "Nachos",
            R.drawable.nachos,
            "Mexican",
            "Soy protein",
            "Neutral",
            listOf(
                Ingredient("Red onion", 0.25, "", "vegetable", false),
                Ingredient("Tomato", 1.0, "", "vegetable", false),
                Ingredient("Cucumber", 0.5, "", "vegetable", false),
                Ingredient("Corn", 90.0, "g", "canned", false),
                Ingredient("Beans", 380.0, "g", "canned", false),
                Ingredient("Vegan ground beef", 325.0, "g", "frozen", false),
                Ingredient("Sour cream", 1.0, "dl", "dairy", false),
                Ingredient("Cheese", 30.0, "g", "dairy", false),
                Ingredient("Salsa", 125.0, "g", "mexican", false),
                Ingredient("Nacho chips", 237.5, "g", "mexican", false),
                Ingredient("Cumin", 2.0, "tsp", "spice", true),
                Ingredient("Garlic powder", 1.0, "tsp", "spice", true),
                Ingredient("Oregano", 1.0, "tsp", "spice", true),
                Ingredient("Paprika", 1.0, "tsp", "spice", true),
                Ingredient("Salt", 2.0, "tsp", "spice", true),
                Ingredient("Olive oil", 2.0, "tbsp", "oil", true)
            ),
            "1. Heat up the olive oil and chop the red onion, tomato and cucumber. \n" +
                    "2. Add the vegan ground beef, beans, cumin, garlic powder, oregano, paprika and salt. Let cook for about 8 minutes. \n" +
                    "3. Add nacho chips to a plate and put the veggie meat on the chips. Sprinkle cheese on top.\n" +
                    "4. Add the cut up vegetables, corn, sour cream and salsa to the nachos.\n" +
                    "5. Serve."
        ),
        Recipe(
            "Tacos",
            R.drawable.tacos,
            "Mexican",
            "Soy protein",
            "Neutral",
            listOf(
                Ingredient("Red onion", 0.25, "", "vegetable", false),
                Ingredient("Tomato", 1.0, "", "vegetable", false),
                Ingredient("Cucumber", 0.5, "", "vegetable", false),
                Ingredient("Corn", 90.0, "g", "canned", false),
                Ingredient("Beans", 380.0, "g", "canned", false),
                Ingredient("Vegan ground beef", 325.0, "g", "frozen", false),
                Ingredient("Sour cream", 1.0, "dl", "dairy", false),
                Ingredient("Cheese", 30.0, "g", "dairy", false),
                Ingredient("Salsa", 125.0, "g", "mexican", false),
                Ingredient("Tortilla", 160.0, "g", "mexican", false),
                Ingredient("Cumin", 2.0, "tsp", "spice", true),
                Ingredient("Garlic powder", 1.0, "tsp", "spice", true),
                Ingredient("Oregano", 1.0, "tsp", "spice", true),
                Ingredient("Paprika", 1.0, "tsp", "spice", true),
                Ingredient("Salt", 2.0, "tsp", "spice", true),
                Ingredient("Olive oil", 2.0, "tbsp", "oil", true)
            ),
            "1. Heat up the olive oil and chop the red onion, tomato and cucumber. \n" +
                    "2. Add the vegan ground beef, beans, cumin, garlic powder, oregano, paprika and salt. Let cook for about 8 minutes. \n" +
                    "3. Add tortilla to a plate and put the veggie meat on it. Sprinkle cheese on top.\n" +
                    "4. Add the cut up vegetables, corn, sour cream and salsa to the tortilla and roll it up.\n" +
                    "5. Serve."
        ),
        Recipe(
            "Quesadilla",
            R.drawable.quesadilla,
            "Mexican",
            "Beans",
            "Healthy",
            listOf(
                Ingredient("Onion", 1.0, "", "vegetable", false),
                Ingredient("Red bell pepper", 1.0, "", "vegetable", false),
                Ingredient("Cabbage", 300.0, "g", "vegetable", false),
                Ingredient("Corn", 180.0, "g", "canned", false),
                Ingredient("Frozen spinach", 250.0, "g", "frozen", false),
                Ingredient("Beans", 380.0, "g", "canned", false),
                Ingredient("Sour cream", 2.0, "dl", "dairy", false),
                Ingredient("Cheese", 30.0, "g", "dairy", false),
                Ingredient("Tortilla", 160.0, "g", "mexican", false),
                Ingredient("Salsa", 125.0, "g", "mexican", false),
                Ingredient("Cumin", 2.0, "tsp", "spice", true),
                Ingredient("Garlic powder", 1.0, "tsp", "spice", true),
                Ingredient("Oregano", 1.0, "tsp", "spice", true),
                Ingredient("Paprika", 1.0, "tsp", "spice", true),
                Ingredient("Salt", 2.0, "tsp", "spice", true),
                Ingredient("Olive oil", 2.0, "tbsp", "oil", true)
            ),
            "1. Heat up the olive oil and chop the onion, red bell pepper and cabbage. \n" +
                    "2. Add the onions and cook until tender for about 2-3 minutes. \n" +
                    "3. Add the red bell pepper and cabbage and cook 2 more minutes.\n" +
                    "4. Add the corn, beans, spinach, cumin, garlic powder, oregano, paprika and salt. Cook until soft.\n" +
                    "5. Add the sour cream and cheese and mix together.\n" +
                    "6. Add the mix to a tortilla, fold it and put it in the oven 8 minutes on each side.\n" +
                    "7. Serve with salsa on top."
        ),
        Recipe(
            "Chili sin Carne",
            R.drawable.chili_sin_carne,
            "Mexican",
            "Soy protein",
            "Healthy",
            listOf(
                Ingredient("Onion", 1.0, "", "vegetable", false),
                Ingredient("Garlic", 1.0, "cloves of", "vegetable", false),
                Ingredient("Yellow bell pepper", 1.0, "", "vegetable", false),
                Ingredient("Crushed tomatoes", 390.0, "g", "canned", false),
                Ingredient("Beans", 380.0, "g", "canned", false),
                Ingredient("Rice", 2.0, "dl", "rice", true),
                Ingredient("Vegan ground beef", 325.0, "g", "frozen", false),
                Ingredient("Cumin", 2.0, "tsp", "spice", true),
                Ingredient("Paprika", 2.0, "tsp", "spice", true),
                Ingredient("Parsley", 1.0, "tbsp", "spice", true),
                Ingredient("Black pepper", 1.0, "tsp", "spice", true),
                Ingredient("Salt", 2.0, "tsp", "spice", true),
                Ingredient("Olive oil", 2.0, "tbsp", "oil", true)
            ),
            "1. Heat up the olive oil and start cooking the rice. \n" +
                    "2. Cut up the onion, garlic and yellow bell pepper. Add it to the pan and cook for about 2-3 minutes. \n" +
                    "3. Add the vegan ground beef, beans, cumin, paprika, black pepper and salt to the mix and cook for about 5 minutes.\n" +
                    "4. Add the crushed tomatoes and let simmer for about 5 minutes.\n" +
                    "5. Add parsley and serve with rice."
        ),
        Recipe(
            "Falafel with Pita Bread",
            R.drawable.falafel_with_pita_bread,
            "Middle Eastern",
            "Falafel",
            "Neutral",
            listOf(
                Ingredient("Tomato", 1.0, "", "vegetable", false),
                Ingredient("Garlic", 2.0, "cloves of", "vegetable", false),
                Ingredient("Red bell pepper", 1.0, "", "vegetable", false),
                Ingredient("Cucumber", 0.5, "", "vegetable", false),
                Ingredient("Lime", 0.5, "", "fruit", false),
                Ingredient("Sour cream", 2.0, "dl", "dairy", false),
                Ingredient("Pita bread", 4.0, "", "bread", false),
                Ingredient("Fries", 0.5, "kg", "frozen", false),
                Ingredient("Falafel", 400.0, "g", "frozen", false),
                Ingredient("Salt", 2.0, "tsp", "spice", true),
                Ingredient("Olive oil", 2.0, "tbsp", "oil", true)
            ),
            "1. Heat up the pan and add oil. \n" +
                    "2. Preheat oven to 225 celsius and add fries and pita bread to the baking sheet. \n" +
                    "3. Put fries in oven for 20 minutes, pita bead for about 7 minutes.\n" +
                    "4. Cut and chop the tomato and red bell pepper.\n" +
                    "5. Add the falafel to the pan.\n" +
                    "6. Add sour cream and salt to a bowl and squeeze the lime into it. Grate the garlic and cucumber into the bowl and mix.\n" +
                    "7. Take out the pita bread and put the tzatziki sour, vegetables, falafel into the bread. \n" +
                    "8. Take out the fries from the oven and serve."
        ),
        Recipe(
            "Chickpea Salad",
            R.drawable.chickpea_salad,
            "Mediterranean",
            "Chickpeas",
            "Healthy",
            listOf(
                Ingredient("Romaine lettuce", 90.0, "g", "vegetable", false),
                Ingredient("Tomato", 1.0, "", "vegetable", false),
                Ingredient("Cucumber", 0.5, "", "vegetable", false),
                Ingredient("Avocado", 2.0, "", "vegetable", false),
                Ingredient("Carrot", 1.0, "", "vegetable", false),
                Ingredient("Fusilli", 250.0, "g", "pasta", false),
                Ingredient("Chickpeas", 600.0, "g", "canned", false),
                Ingredient("Feta cheese", 150.0, "g", "dairy", false),
                Ingredient("Salad dressing", 80.0, "g", "condiment", false),
                Ingredient("Garlic powder", 1.0, "tsp", "spice", true),
                Ingredient("Paprika", 2.0, "tsp", "spice", true),
                Ingredient("Salt", 2.0, "tsp", "spice", true),
                Ingredient("Olive oil", 2.0, "tbsp", "oil", true)
            ),
            "1. Preheat oven on 225 celsius. Drain and wash the chickpeas. Add them to the baking sheet with salt, garlic powder and paprika. \n" +
                    "2.  Add oil and mix together. Put in the oven for about 20 minutes.\n" +
                    "3. Boil water and add pasta and salt to it. Cook according to instructions.\n" +
                    "4. Chop and cut the romaine lettuce, tomatoes, cucumber, avocado and carrots.\n" +
                    "5. Cut the feta into smaller cubes. \n" +
                    "6. Add all the vegetables, pasta, chickpeas, cheese and dressing and mix together.\n" +
                    "7. Serve."
        ),
        Recipe(
            "Meatballs and Potatoes",
            R.drawable.meatballs_and_potatoes,
            "Swedish",
            "Soy protein",
            "Neutral",
            listOf(
                Ingredient("Tomato", 1.0, "", "vegetable", false),
                Ingredient("Cucumber", 0.5, "", "vegetable", false),
                Ingredient("Potatoes", 6.0, "", "vegetable", false),
                Ingredient("Sour cream", 2.0, "dl", "dairy", false),
                Ingredient("Vegan meatballs", 480.0, "g", "frozen", false),
                Ingredient("Salt", 2.0, "tsp", "spice", true),
                Ingredient("Olive oil", 2.0, "tbsp", "oil", true)
            ),
            "1. Cut the potatoes in to smaller cubes and bring them to a boil for about 15 minutes. Salt. \n" +
                    "2. Fry the vegan meatballs in olive oil for about 10-15 minutes. \n" +
                    "3. Cut and chop the tomatoes and cucumber.\n" +
                    "4. Add the potatoes, meatballs, vegetables and sour cream to the plate.\n" +
                    "5. Serve."
        ),
        Recipe(
            "Sausage Stroganoff",
            R.drawable.sausage_stroganoff,
            "Swedish",
            "Pea Protein",
            "Unhealthy",
            listOf(
                Ingredient("Onion", 1.0, "", "vegetable", false),
                Ingredient("Vegan sausage", 400.0, "g", "vegetarian", false),
                Ingredient("Heavy cream", 2.5, "dl", "dairy", false),
                Ingredient("Tomato paste", 3.0, "tbsp", "canned", true),
                Ingredient("Soy sauce", 1.0, "tbsp", "asian", true),
                Ingredient("Rice", 2.0, "dl", "rice", true),
                Ingredient("Black pepper", 1.0, "tsp", "spice", true),
                Ingredient("Salt", 2.0, "tsp", "spice", true),
                Ingredient("Olive oil", 2.0, "tbsp", "oil", true)
            ),
            "1. Pre heat the pan and add oil. \n" +
                    "2. Start cooking the rice. \n" +
                    "3. Cut and chop the onion and vegan sausage. \n" +
                    "4. Add the onion and cook until tender. Add the sausage and cook for about 5 minutes.\n" +
                    "5. Add tomato paste and cook for about 2-3 minutes.\n" +
                    "6. Add the heavy cream, soy sauce, salt and pepper. Bring to a boil and let simmer for about 5 minutes.\n" +
                    "7. Serve."
        ),
        Recipe(
            "Chickpea Paprikash",
            R.drawable.chickpea_paprikash,
            "Hungarian",
            "Chickpeas",
            "Neutral",
            listOf(
                Ingredient("Onion", 1.0, "", "vegetable", false),
                Ingredient("Tomato", 2.0, "", "vegetable", false),
                Ingredient("Red bell pepper", 1.0, "", "vegetable", false),
                Ingredient("Chickpeas", 400.0, "g", "canned", false),
                Ingredient("Sour cream", 2.0, "dl", "dairy", false),
                Ingredient("Flour", 2.0, "tbsp", "baking", true),
                Ingredient("Farfalle", 350.0, "g", "pasta", false),
                Ingredient("Paprika", 8.0, "tsp", "spice", true),
                Ingredient("Black pepper", 1.0, "tsp", "spice", true),
                Ingredient("Salt", 2.0, "tsp", "spice", true),
                Ingredient("Olive oil", 2.0, "tbsp", "oil", true)
            ),
            "1. Heat up the pan and add oil. \n" +
                    "1. Boil water and add pasta and salt. Cook according to instructions. \n" +
                    "2. Cut and chop the onion, tomato and red bell pepper. \n" +
                    "3. Add the onion and paprika and cook until tender for about 2-3 minutes.\n" +
                    "4. Add tomato and red bell pepper and cook until soft for about 2-3 minutes.\n" +
                    "5. Add about 2 dl water, chickpeas, salt and pepper and cook for about 15 minutes.\n" +
                    "6. Mix the sour cream and flour and add it to the stew.\n" +
                    "7. Serve with pasta"
        ),
        Recipe(
            "Bean Goulash",
            R.drawable.bean_goulash,
            "Hungarian",
            "Beans",
            "Neutral",
            listOf(
                Ingredient("Onion", 1.0, "", "vegetable", false),
                Ingredient("Tomato", 2.0, "", "vegetable", false),
                Ingredient("Red bell pepper", 1.0, "", "vegetable", false),
                Ingredient("Carrot", 2.0, "", "vegetable", false),
                Ingredient("Parsnip", 2.0, "", "vegetable", false),
                Ingredient("Potatoes", 6.0, "", "vegetable", false),
                Ingredient("Beans", 390.0, "g", "canned", false),
                Ingredient("Paprika", 8.0, "tsp", "spice", true),
                Ingredient("Black pepper", 1.0, "tsp", "spice", true),
                Ingredient("Salt", 2.0, "tsp", "spice", true),
                Ingredient("Olive oil", 2.0, "tbsp", "oil", true)
            ),
            "1. Heat up the pan and add oil. \n" +
                    "1. Add onions and cook until tender for 2-3 minutes. \n" +
                    "2. Add tomato, red bell pepper, carrots, parsnip and paprika and cook for about 3-4 minutes. \n" +
                    "3. Add 1.5 liter water and potatoes and cook for about 10 minutes.\n" +
                    "4. Add salt, black pepper and beans and cook for 5 minutes.\n" +
                    "5. Serve."
        ),
        Recipe(
            "Spaghetti Bolognese",
            R.drawable.spaghetti_bolognese,
            "Italian",
            "Soy protein",
            "Neutral",
            listOf(
                Ingredient("Vegan ground beef", 300.0, "g", "frozen", false),
                Ingredient("Pasta sauce", 400.0, "g", "pasta", false),
                Ingredient("Spaghetti", 350.0, "g", "pasta", false),
                Ingredient("Cheese", 30.0, "g", "dairy", false),
                Ingredient("Ketchup", 4.0, "tbsp", "condiment", true),
                Ingredient("Black pepper", 1.0, "tsp", "spice", true),
                Ingredient("Salt", 2.0, "tsp", "spice", true),
                Ingredient("Olive oil", 2.0, "tbsp", "oil", true)
            ),
            "1. Heat up the pan and add oil. \n" +
                    "2. Boil water and add pasta and salt. Cook according to instructions. \n" +
                    "3. Add vegan ground beef, salt and black pepper. Cook for about 7 minutes.\n" +
                    "4. Add pasta sauce and let it simmer for about 5 minutes.\n" +
                    "4. Add pasta and bolognese to a plate.\n" +
                    "4. Top it off with ketchup and cheese.\n" +
                    "5. Serve"
        ),
        Recipe(
            "Tagliatelle with Pesto",
            R.drawable.tagliatelle_with_pesto,
            "Italian",
            "No protein",
            "Neutral",
            listOf(
                Ingredient("Carrot", 2.0, "", "vegetable", false),
                Ingredient("Broccoli", 1.0, "", "vegetable", false),
                Ingredient("Zucchini", 1.0, "", "vegetable", false),
                Ingredient("Tagliatelle", 350.0, "g", "pasta", false),
                Ingredient("Pesto", 190.0, "g", "pasta", false),
                Ingredient("Black pepper", 1.0, "tsp", "spice", true),
                Ingredient("Salt", 2.0, "tsp", "spice", true),
                Ingredient("Olive oil", 2.0, "tbsp", "oil", true)
            ),
            "1. Heat up the pan and add oil. \n" +
                    "2. Boil water and add pasta and salt. \n" +
                    "3. Cut and chop carrot, broccoli and zucchini. Add salt and black pepper.\n" +
                    "4. Mix the pasta and vegetables with pesto.\n" +
                    "5. Serve."
        ),
        Recipe(
            "Burger and Fries",
            R.drawable.burger_and_fries,
            "American",
            "Soy protein",
            "Unhealthy",
            listOf(
                Ingredient("Red onion", 0.25, "", "vegetable", false),
                Ingredient("Tomato", 1.0, "", "vegetable", false),
                Ingredient("Romaine lettuce", 40.0, "g", "vegetable", false),
                Ingredient("Hamburger buns", 4.0, "", "bread", false),
                Ingredient("Vegan burgers", 4.0, "", "frozen", false),
                Ingredient("Fries", 0.5, "kg", "frozen", false),
                Ingredient("Ketchup", 4.0, "tbsp", "condiment", true),
                Ingredient("Mustard", 4.0, "tbsp", "condiment", true),
                Ingredient("Hamburger dressing", 4.0, "tbsp", "condiment", true),
                Ingredient("Garlic powder", 1.0, "tsp", "spice", true),
                Ingredient("Paprika", 1.0, "tsp", "spice", true),
                Ingredient("Black pepper", 1.0, "tsp", "spice", true),
                Ingredient("Salt", 2.0, "tsp", "spice", true),
                Ingredient("Olive oil", 2.0, "tbsp", "oil", true)
            ),
            "1. Heat up the pan and add oil. \n" +
                    "2. Preheat oven to 225 celsius and add fries and burger bun to the baking sheet. \n" +
                    "3. Put fries in oven for 20 minutes, burgers for about 5 minutes.\n" +
                    "4. Cut and chop red onion, tomato, and romaine lettuce.\n" +
                    "4. Add vegan burgers, garlic powder, paprika, black pepper and salt to the pan.\n" +
                    "4. Take out the buns and put ketchup, mustard and hamburger dressing on both sides. \n" +
                    "4. Add the veggies and the cheese. \n" +
                    "4. Add the pattie to the burger and take out the fries from the oven. \n" +
                    "5. Serve"
        )
    )

}
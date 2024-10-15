package com.example.fooddial.presentation.home

import com.example.fooddial.domain.model.Advertisement
import com.example.fooddial.domain.model.FoodItem
import com.example.fooddial.domain.model.Restaurant

data class HomeScreenState(
    val adsList: List<Advertisement> = emptyList(),
    val foodList: List<FoodItem> = emptyList(),
    val likedRestaurantList : List<Restaurant> = emptyList(),
    val restaurantList : List<Restaurant> = emptyList(),
)

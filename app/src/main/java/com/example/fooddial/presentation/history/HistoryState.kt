package com.example.fooddial.presentation.history

import com.example.fooddial.domain.model.Restaurant

data class HistoryState(
    val likedRestaurantList: List<Restaurant> = emptyList(),
)

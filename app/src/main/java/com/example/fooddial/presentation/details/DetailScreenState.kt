package com.example.fooddial.presentation.details

import com.example.fooddial.domain.model.CartItem
import com.example.fooddial.domain.model.Restaurant

data class DetailScreenState(
    val restaurant: Restaurant? = null,
    val recommendedExpandedState: Boolean = true,
    val nonVegExpandedState: Boolean = true,
    val vegExpandedState: Boolean = true,
    val menuList: List<CartItem> = emptyList(),
    val recommendedList: List<CartItem> = emptyList(),
    val isLiked: Boolean = false,
    )
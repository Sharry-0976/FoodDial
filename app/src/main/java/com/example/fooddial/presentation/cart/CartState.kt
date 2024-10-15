package com.example.fooddial.presentation.cart

import com.example.fooddial.domain.model.CartItem

data class CartState(
    val list: MutableList<CartItem> = mutableListOf()
)

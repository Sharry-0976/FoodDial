package com.example.fooddial.presentation.history

import com.example.fooddial.domain.model.Restaurant

sealed class HistoryEvent {
    data class SelectRestaurant(val restaurant: Restaurant, val onClick: () -> Unit) :
        HistoryEvent()
}
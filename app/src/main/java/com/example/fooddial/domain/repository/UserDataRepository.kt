package com.example.fooddial.domain.repository

import com.example.fooddial.domain.model.CartItem
import com.example.fooddial.domain.model.Restaurant
import kotlinx.coroutines.flow.Flow

interface UserDataRepository {
    suspend fun setRestaurant(restaurant: Restaurant)
    suspend fun getSavedRestaurant(): Flow<Restaurant>
    suspend fun getMenuItems(): Flow<List<CartItem>>
    suspend fun getLikedRestaurants(): Flow<List<Restaurant>>
    suspend fun isRestaurantLiked(restaurant: Restaurant): Flow<Boolean>
    suspend fun getCartItems(): Flow<List<CartItem>>



}
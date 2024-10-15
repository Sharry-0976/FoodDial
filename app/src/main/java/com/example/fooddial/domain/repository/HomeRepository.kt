package com.example.fooddial.domain.repository

import com.example.fooddial.data.repository.Results
import com.example.fooddial.domain.model.Advertisement
import com.example.fooddial.domain.model.FoodItem
import com.example.fooddial.domain.model.Restaurant

interface HomeRepository {

    suspend fun getRestaurants() : Results<List<Restaurant>>
    suspend fun getAds(): Results<List<Advertisement>>
    suspend fun getFoodItems():Results<List<FoodItem>>
    fun getRestaurantFromName(name: String): Restaurant?

}
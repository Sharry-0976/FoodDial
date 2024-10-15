package com.example.fooddial.data.repository

//import com.google.android.gms.dtdi.analytics.Results
import com.example.fooddial.data.data_source.adList
import com.example.fooddial.data.data_source.recommendedList
import com.example.fooddial.data.data_source.restaurantList
import com.example.fooddial.domain.model.Advertisement
import com.example.fooddial.domain.model.FoodItem
import com.example.fooddial.domain.model.Restaurant
import com.example.fooddial.domain.repository.HomeRepository


class HomeRepositoryImpl() : HomeRepository {

    override suspend fun getRestaurants(): Results<List<Restaurant>> {
        return Results.Success(restaurantList)
    }

    override suspend fun getAds(): Results<List<Advertisement>> {
        return Results.Success(adList)
    }

    override suspend fun getFoodItems(): Results<List<FoodItem>> {
        return Results.Success(recommendedList)
    }

    override fun getRestaurantFromName(name: String): Restaurant? {
        return restaurantList.find {
            it.name == name
        }
    }
}
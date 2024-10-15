package com.example.fooddial.presentation.cart

import android.app.Activity
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Close
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.example.fooddial.R
import com.example.fooddial.data.data_source.menu2
import com.example.fooddial.domain.model.Restaurant
import com.example.fooddial.presentation.cart.components.BillSection
import com.example.fooddial.presentation.cart.components.CouponBar
import com.example.fooddial.presentation.cart.components.DeliverySection
import com.example.fooddial.presentation.cart.components.ItemSection

@Composable
fun Cart(
    navController: NavHostController,
    viewModel: CartViewModel = hiltViewModel()
) {
    val list by viewModel.cartState


    val context = LocalContext.current as Activity

    context.window.statusBarColor = Color.Gray.toArgb()
    context.window.navigationBarColor = Color.White.toArgb()

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color(0xFFE8E7E7)),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        item {
            Row(
                modifier = Modifier.fillMaxWidth(),
            ) {
                IconButton(onClick = { navController.navigateUp() }) {
                    Icon(imageVector = Icons.Outlined.Close, contentDescription = stringResource(id = R.string.back))
                }
            }
        }

        item {
            ItemSection(
                list = list.list.filter {
                    it.noOfItems > 0
                },
                onDecreaseClick = { },
                onIncreaseClick = { },
            )
        }

        item {
            CouponBar()
        }
        item {
            DeliverySection(
                Restaurant(
                    name = "Relish",
                    rating = 3.9,
                    noOfRatings = 258,
                    timeInMillis = 1800000,
                    variety = "American, French",
                    place = "Misamari",
                    averagePrice = 1.0,
                    image = R.drawable.pizza,
                    menu = menu2
                )
            )
        }
        item {
            BillSection(
                itemTotal = 6.09
            )
        }
    }
}

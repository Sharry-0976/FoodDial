package com.example.fooddial.presentation.home.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.fooddial.R

@Composable
fun ThankYouSection() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(24.dp),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = stringResource(R.string.with),
            modifier = Modifier.alpha(0.5f),
            fontFamily = FontFamily.Cursive,
            fontSize = 24.sp
        )
        Icon(
            imageVector = Icons.Filled.Favorite, contentDescription = stringResource(R.string.love),
            tint = Color.Red,
            modifier = Modifier.size(32.dp)
        )
        Text(
            text = stringResource(R.string.from_creator),
            modifier = Modifier.alpha(0.5f),
            fontFamily = FontFamily.Cursive,
            fontSize = 24.sp
        )
    }
}

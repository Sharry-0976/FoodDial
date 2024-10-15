package com.example.fooddial.presentation.profile

sealed class ProfileEvent {
    data class PerformLogout(val onClick: () -> Unit) : ProfileEvent()
}
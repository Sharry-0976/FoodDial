package com.example.fooddial.presentation.login

sealed class UiEvent {
    data class ShowSnackbar(val message: String): UiEvent()
}
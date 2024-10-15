package com.example.fooddial.presentation.login

sealed class LoginEvent {
    data class EnteredEmail(val value: String) : LoginEvent()
    data class EnteredPassword(val value: String) : LoginEvent()
    data class PerformLogin(val onClick: () -> Unit) : LoginEvent()
}
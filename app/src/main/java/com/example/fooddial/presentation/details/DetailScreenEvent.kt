package com.example.fooddial.presentation.details

sealed class DetailScreenEvent {
    object ToggleRecommendedSectionExpandedState : DetailScreenEvent()
    object ToggleNonVegSectionExpandedState : DetailScreenEvent()
    object ToggleVegSectionExpandedState : DetailScreenEvent()
    object ToggleLikedStatus : DetailScreenEvent()

}
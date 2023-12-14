package com.example.funfactsapp.ui

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.example.funfactsapp.data.UserDataUiEvents
import com.example.funfactsapp.data.UserInputScreenState

//A ViewModel is a component that is responsible for preparing and managing the data for the UI
class UserInputViewModel : ViewModel() {

    // Mutable state to represent the current UI state
    var uiState = mutableStateOf(UserInputScreenState())

    // Function to handle UI events
    //It updates the uiState based on the type of event received.
    fun onEvent(event: UserDataUiEvents) {
        when (event) {
            is UserDataUiEvents.UserNameEntered -> {
                // Update the UI state when a username is entered
                uiState.value = uiState.value.copy(nameEntered = event.name)
            }

            is UserDataUiEvents.AnimalSelected -> {
                // Update the UI state when an animal is selected
                uiState.value = uiState.value.copy(animalSelected = event.animalValue)
            }
        }
    }
}



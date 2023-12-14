package com.example.funfactsapp.data

/*
Step 1: user actions change the value of state variables
Events are user actions or system events that trigger changes in the UI.
 are represented using sealed classes.
 Events are handled using a viewmodel.
 */
sealed class UserDataUiEvents {
     data class UserNameEntered(val name:String): UserDataUiEvents()
     data class AnimalSelected(val animalValue:String): UserDataUiEvents()
}
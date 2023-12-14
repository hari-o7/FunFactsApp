package com.example.funfactsapp.data

/*
Step 2: events trigger change in value state
and then that change is reflected on UI

State represents the current UI data
state == variables that might change
and when they change, they reflect on the UI/ update the UI.
Initially, both of state variables are empty
 */

data class UserInputScreenState(
    var nameEntered: String = "",
    var animalSelected: String = ""
)
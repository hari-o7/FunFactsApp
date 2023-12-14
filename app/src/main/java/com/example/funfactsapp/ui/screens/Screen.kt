package com.example.funfactsapp.ui.screens

sealed class Screen(val route:String) {
    object  UserInput:Screen(route = "user_input_screen")
    object  Welcome:Screen(route = "welcome_screen")
}
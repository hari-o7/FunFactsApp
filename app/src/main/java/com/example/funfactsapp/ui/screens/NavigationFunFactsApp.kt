package com.example.funfactsapp.ui.screens

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun NavigationFunFactsApp() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Screen.UserInput.route) {

        composable(route = Screen.UserInput.route) {
            UserInputScreen(navController)
        }

        composable(route =Screen.Welcome.route) {
            WelcomeScreen()
        }

    }

}
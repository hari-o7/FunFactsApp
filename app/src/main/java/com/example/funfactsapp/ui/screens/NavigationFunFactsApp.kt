package com.example.funfactsapp.ui.screens

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.funfactsapp.ui.UserInputViewModel

@Composable
fun NavigationFunFactsApp(userInputViewModel: UserInputViewModel= viewModel()) {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Screen.UserInput.route) {

        composable(route = Screen.UserInput.route) {
            UserInputScreen(userInputViewModel)
        }

        composable(route =Screen.Welcome.route) {
            WelcomeScreen()
        }

    }

}
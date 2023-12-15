package com.example.funfactsapp.ui.screens

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.funfactsapp.ui.UserInputViewModel

@Composable
fun NavigationFunFactsApp(userInputViewModel: UserInputViewModel = viewModel()) {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Routes.USER_INPUT_SCREEN) {

        composable(route = Routes.USER_INPUT_SCREEN) {
            UserInputScreen(userInputViewModel, showWelcomeScreen = {
                println("Coming inside Welcome Screen")
                println(it.first)
                println(it.second)
                navController.navigate(route = Routes.WELCOME_SCREEN + "/${it.first}/${it.second}")
            })
        }

        composable(
           // route = "${Routes.WELCOME_SCREEN}/${Routes.USER_NAME}/${Routes.ANIMAL_SELECTED}",
            route = "${Routes.WELCOME_SCREEN}/{${Routes.USER_NAME}}/{${Routes.ANIMAL_SELECTED}}",
            arguments = listOf(
                navArgument(name = Routes.USER_NAME) { type = NavType.StringType },
                navArgument(name = Routes.ANIMAL_SELECTED) { type = NavType.StringType }
            )
        ) {
            val userName = it.arguments?.getString(Routes.USER_NAME)
            val animalSelected = it.arguments?.getString(Routes.ANIMAL_SELECTED)
            WelcomeScreen(userName, animalSelected)
        }

    }

}
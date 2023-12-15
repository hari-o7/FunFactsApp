package com.example.funfactsapp.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.funfactsapp.ui.FactComponent
import com.example.funfactsapp.ui.FactsViewModel
import com.example.funfactsapp.ui.TextComponent
import com.example.funfactsapp.ui.TextWithShadow
import com.example.funfactsapp.ui.TopBar

@Composable
fun WelcomeScreen(userName: String?, animalSelected: String?) {

    println("====Inside + Welcome Screen")
    println("====$userName and $animalSelected")

    Surface(
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(18.dp)
        ) {
            TopBar(value = "Welcome $userName")
            TextComponent(value = "Thank you for sharing your details.", textSize = 24.sp)
            Spacer(modifier = Modifier.size(60.dp))

            val finalText =
                if (animalSelected == "Cat") "You are a cat lover \uD83D\uDE3D"
                else "You are a dog lover \uD83D\uDC36"

            TextWithShadow(value = finalText)

            val factsViewModel:FactsViewModel= viewModel()

            FactComponent(value = factsViewModel.generateRandomFact(animalSelected!!))
        }
    }

}

@Preview(showBackground = true)
@Composable
fun PreviewWelcomeScreen() {
    WelcomeScreen("Sandy", "a")
}
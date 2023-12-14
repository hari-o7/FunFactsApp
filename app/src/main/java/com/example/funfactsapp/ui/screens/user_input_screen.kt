package com.example.funfactsapp.ui.screens

import androidx.compose.foundation.clickable
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
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.funfactsapp.ui.TextComponent
import com.example.funfactsapp.ui.TopBar

@Composable
fun UserInputScreen(navController: NavController, modifier: Modifier = Modifier) {
    Surface(
        modifier = modifier
            .fillMaxSize()
    ) {
        Column(
            modifier = modifier
                .fillMaxSize()
                .padding(20.dp)
        ) {
            TopBar("Hi there \uD83D\uDE0A")
            TextComponent(
                value = "Let's learn about You!",
                textSize = 24.sp
            )
            Spacer(modifier = Modifier.size(20.dp))

            TextComponent(
                value = "This app will prepare a details page based on your preferences",
                textSize = 20.sp
            )

            Spacer(modifier = Modifier.size(20.dp))
        }
    }

}

@Preview(showBackground = true)
@Composable
fun PreviewUser() {
    UserInputScreen(rememberNavController())
}
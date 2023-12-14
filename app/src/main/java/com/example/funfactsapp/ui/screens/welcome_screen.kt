package com.example.funfactsapp.ui.screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun WelcomeScreen(modifier: Modifier = Modifier) {

    Surface(
        modifier = modifier.fillMaxSize()
    ) {
        Text(text = Screen.Welcome.route)
    }

}

@Preview(showBackground = true)
@Composable
fun PreviewWelcomeScreen() {
    WelcomeScreen()
}
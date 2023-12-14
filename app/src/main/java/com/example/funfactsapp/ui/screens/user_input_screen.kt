package com.example.funfactsapp.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.rememberNavController
import com.example.funfactsapp.R
import com.example.funfactsapp.data.UserDataUiEvents
import com.example.funfactsapp.ui.AnimalCard
import com.example.funfactsapp.ui.TextComponent
import com.example.funfactsapp.ui.TextFieldComponent
import com.example.funfactsapp.ui.TopBar
import com.example.funfactsapp.ui.UserInputViewModel

@Composable
fun UserInputScreen(userInputViewModel: UserInputViewModel) {
    Surface(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Column(
            modifier = Modifier
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

            Spacer(modifier = Modifier.size(60.dp))

            TextComponent(value = "Name", textSize = 18.sp)
            Spacer(modifier = Modifier.size(10.dp))

            TextFieldComponent(onTextChange = {
                userInputViewModel.onEvent(UserDataUiEvents.UserNameEntered(it))
            })

            Spacer(modifier = Modifier.size(10.dp))
            TextComponent(value = "Which is your favorite?", textSize = 18.sp)

            Spacer(modifier = Modifier.height(20.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {

                AnimalCard(image = R.drawable.cat1)
                //Spacer(modifier = Modifier.weight(1f))
                AnimalCard(image = R.drawable.dog)


            }


        }
    }

}

@Preview(showBackground = true)
@Composable
fun PreviewUserInputScreen() {
    UserInputScreen(userInputViewModel = UserInputViewModel())
}
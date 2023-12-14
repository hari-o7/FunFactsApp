package com.example.funfactsapp.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.funfactsapp.R

@Composable
fun TopBar(value: String) {
    Row(
        verticalAlignment = Alignment.CenterVertically, modifier = Modifier
            .fillMaxWidth()
    ) {
        Text(
            text = value,
            color = Color.Black,
            fontSize = 24.sp,
            fontWeight = FontWeight.W600
        )

        Spacer(modifier = Modifier.weight(1f))

        Image(
            painter = painterResource(id = R.drawable.logo),
            contentDescription = null,
            modifier = Modifier.size(80.dp)
        )

    }

}

@Preview()
@Composable
fun PreviewTopBar() {
    TopBar("")
}


@Composable
fun TextComponent(value: String, textSize: TextUnit, colorValue: Color = Color.Black) {
    Text(
        text = value,
        fontSize = textSize,
        color = colorValue,
        fontWeight = FontWeight.Light
    )


}

@Composable
fun TextFieldComponent(onTextChange: (name: String) -> Unit) {
    var currentValue by remember {
        mutableStateOf("")
    }

    val localFocusManager = LocalFocusManager.current

    OutlinedTextField(
        value = currentValue,
        onValueChange = {
            currentValue = it
            onTextChange(it)
        },
        placeholder = {
            Text(text = "Enter your Name:", fontSize = 18.sp)
        },
        textStyle = TextStyle.Default.copy(fontSize = 24.sp),
        keyboardOptions = KeyboardOptions(
            imeAction = ImeAction.Done
        ),
        keyboardActions = KeyboardActions {
            localFocusManager.clearFocus()
        },
        modifier = Modifier.fillMaxWidth()
    )

}

@Preview
@Composable
fun PreviewTextFieldComponent() {
    TextFieldComponent({})
}

@Composable
fun AnimalCard(image: Int) {

    Card(
        modifier = Modifier
            .size(140.dp),
        elevation = CardDefaults.cardElevation(4.dp)
    ) {
        Image(
            painter = painterResource(id = image),
            contentDescription = null,
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        )

    }

}

@Preview
@Composable
fun PreviewAnimalCard() {
    AnimalCard(image = R.drawable.cat1)
}
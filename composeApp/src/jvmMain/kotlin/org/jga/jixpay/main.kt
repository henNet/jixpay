package org.jga.jixpay

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text

import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.WindowPosition
import androidx.compose.ui.window.WindowState
import androidx.compose.ui.window.application
import java.lang.module.ModuleFinder
import androidx.compose.runtime.*
import jixpay.composeapp.generated.resources.Res
import jixpay.composeapp.generated.resources.pix
import org.jetbrains.compose.resources.painterResource

@Composable
fun MainScreen(){

    var isYesPressed by remember { mutableStateOf(false) }

    MaterialTheme {
        Box(modifier = Modifier.fillMaxSize().background(Color.LightGray),
            contentAlignment = Alignment.Center) {
            Text("E o Jix nada?", Modifier.offset(y = -50.dp))

            Button(onClick = {isYesPressed = true},
                modifier = Modifier.offset(x = -50.dp)
                ) {
                Text("Sim")
            }

            Button(onClick = {}, modifier = Modifier.offset(x = 50.dp)) {
                Text("Não")
            }
        }
    }
}

fun main() {
    application {
        Window(onCloseRequest = ::exitApplication,
            title = "JixPay",
            icon = painterResource(Res.drawable.pix),
            state = WindowState(
                position = WindowPosition(Alignment.Center),
                size = DpSize(800.dp, 600.dp
                )
            )
        ){
            MainScreen()
        }
    }
}
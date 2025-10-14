package org.jga.jixpay

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.WindowPosition
import androidx.compose.ui.window.WindowState
import androidx.compose.ui.window.application
import java.lang.module.ModuleFinder

@Composable
fun MainScreen(){
    MaterialTheme {
        Box(modifier = Modifier.fillMaxSize().background(Color.LightGray),
            contentAlignment = Alignment.Center) {
            Text("E o jix nada?", Modifier.offset(y = -50.dp))

            Button(onClick = {}, modifier = Modifier.offset(x = -50.dp)) {
                Text("Sim")
            }
        }
    }
}

fun main() {
    application {
        Window(onCloseRequest = ::exitApplication,
            title = "JixPay",
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
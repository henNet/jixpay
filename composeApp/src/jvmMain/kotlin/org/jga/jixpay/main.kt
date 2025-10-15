package org.jga.jixpay

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
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
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.draganddrop.DragData
import androidx.compose.ui.input.pointer.PointerEventType
import androidx.compose.ui.input.pointer.onPointerEvent
import androidx.compose.ui.unit.IntOffset
import jixpay.composeapp.generated.resources.Res
import jixpay.composeapp.generated.resources.money
import jixpay.composeapp.generated.resources.pix
import org.jetbrains.compose.resources.painterResource
import kotlin.random.Random
import kotlin.random.nextInt

@OptIn(ExperimentalComposeUiApi::class)
@Composable
fun MainScreen(){

    var isYesPressed by remember { mutableStateOf(false) }
    var posBtnNo by remember { mutableStateOf(IntOffset(50, 0)) }

    MaterialTheme {
        Box(modifier = Modifier.fillMaxSize().background(Color.LightGray),
            contentAlignment = Alignment.Center) {
            Text("E o Jix nada?", Modifier.offset(y = -50.dp))

            Button(onClick = {
                isYesPressed = true
                posBtnNo = IntOffset(50, 0)},
                modifier = Modifier.offset(x = -50.dp)
                ) {
                Text("Sim")
            }

            Button(onClick = {},
                modifier = Modifier.offset {posBtnNo}
                    .onPointerEvent(PointerEventType.Enter) {

                        var x = Random.nextInt(-300 .. 300)
                        var y = Random.nextInt(-200 .. 200)

                        posBtnNo = IntOffset(x, y);
                    }
            )
            {
                Text("Não")
            }

            if(isYesPressed) {
                Text("Ufa!!", modifier = Modifier.offset(y = 50.dp));
                Image(painterResource(Res.drawable.money),
                    contentDescription = null,
                    modifier = Modifier.size(300.dp)
                        .align(Alignment.BottomCenter));
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
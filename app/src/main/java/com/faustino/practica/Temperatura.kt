package com.faustino.practica

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun TemperatureDisplay(){

    var temperatura by remember { mutableStateOf(20) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Temperatura: $temperatura",
            style = MaterialTheme.typography.headlineMedium,

            color = when {
                temperatura > 30 -> Color.Red
                temperatura < 10 -> Color.Blue
                else -> Color.Black
            }
        )

        Spacer(modifier = Modifier.height(16.dp))

        Row{
            Button(onClick = {temperatura++}) {
                Text("Subir")
            }

            Spacer(modifier = Modifier.width(8.dp))

            Button(onClick = {temperatura--}) {
                Text("Bajar")
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = { temperatura = 20 }) {
                Text("Resetear")
        }
    }
}
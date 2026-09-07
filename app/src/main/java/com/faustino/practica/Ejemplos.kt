package com.faustino.practica

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
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
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun PantallaNombre(modifier: Modifier = Modifier) {
    // Variable de estado que guarda lo que el usuario escribe
    var nombre by remember { mutableStateOf("") }

    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Escribe tu nombre:",
            style = MaterialTheme.typography.bodyLarge
        )

        Spacer(modifier = Modifier.height(16.dp))

        // Campo de texto donde el usuario escribe
        OutlinedTextField(
            value = nombre,
            onValueChange = { nuevoTexto -> nombre = nuevoTexto },
            modifier = Modifier.fillMaxWidth(),
            textStyle = TextStyle(color = Color.Black)

        )

        Spacer(modifier = Modifier.height(24.dp))

        // Muestra el nombre solo si el usuario escribió algo
        if (nombre.isNotBlank()) {
            Text(
                text = "¡Hola, $nombre!",
                style = MaterialTheme.typography.headlineSmall
            )
        }
    }
}

@Composable
fun RegistroNombre(){
    var nombre by remember { mutableStateOf(value = "") }
    var registrado by remember { mutableStateOf(value = false) } // nuevo estado

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        OutlinedTextField(
            value = nombre,
            onValueChange = {nombre = it},
            label = {Text("Ingrese su nombre")},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
            textStyle = TextStyle(color = Color.Black)
        )

        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = {
            registrado = true
        }) {
            Text("Listo")
        }

        Spacer(modifier = Modifier.height(16.dp))

        if (registrado) {
            if (nombre.isNotBlank()){
                Text(
                    text = "$nombre Registrado",
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp,
                    color = Color.Green


                )
            }else{
                Text(
                    text = "Debes registrarte primero",
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp,
                    color = Color.Red
                )
            }
        }
    }
}
@Composable
fun CalculadoraSuma() {
    var numero1 by remember { mutableStateOf(value = "") }
    var numero2 by remember { mutableStateOf(value = "") }
    var resultado by remember { mutableStateOf(value = "") }

    //var num1 by remember { mutableStateOf(0) } Int
    //var num2 by remember { mutableStateOf(0.0) } Double

    Column(
        modifier = Modifier
            .padding(all = 90.dp)
            .fillMaxWidth(),
        verticalArrangement = Arrangement.spacedBy(12.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        OutlinedTextField(
            value = numero1, //el campo muestra texto
            onValueChange = { numero1 = it }, //le dice al codigo que hacer
            label = { Text("Primer número") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            textStyle = TextStyle(color = Color.Black)

        )

        OutlinedTextField(
            value = numero2,
            onValueChange = { numero2 = it },
            label = { Text("Segundo número") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            textStyle = TextStyle(color = Color.Black)
        )

        Button(onClick = {
            val n1 = numero1.toDoubleOrNull() ?: 0.0
            val n2 = numero2.toDoubleOrNull() ?: 0.0
            resultado = (n1 + n2).toString()
        }) {
            Text("Sumar")
        }

        Text(
            text = "Resultado: $resultado",
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp,
            color = Color.Black
        )
    }
}
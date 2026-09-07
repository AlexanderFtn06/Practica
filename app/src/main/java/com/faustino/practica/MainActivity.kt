package com.faustino.practica

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.faustino.practica.ui.theme.PracticaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PracticaTheme {
                    CalculadoraSuma()
                }
            }
        }
    }


//1.Crear un componenete
@Composable
fun Ejemplo(){
    Text(
        text = "Hola a todos"

    )
}

//2.Control de texto
@Composable
fun Saludar(nombre: String){
    Text(
        text = "Hola $nombre",
        fontSize = 50.sp,
        fontWeight = FontWeight.Light,
        color = Color.Red
    )
}

//3. Organizador de columna
@Composable
fun Vertical(){
    Column{
        Text(text = "Casa")
        Text(text = "sotano")
        Text(text = "tierra")
        Button(onClick = {/*Todo*/}) {
            Text(text = "Click")
        }
    }
}

//4. Organizador de filas
@Composable
fun Horizontal(){
    Row{
        Text(text = "Casa")
        Spacer(modifier = Modifier.width(10.dp))
        Text(text = "sotano")
        Spacer(modifier = Modifier.width(10.dp))
        Text(text = "tierra")
        Spacer(modifier = Modifier.width(10.dp))

    }
}
//4. Conbinar Vericales con horizontales
@Composable
fun Combinacion(){
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFFF5F3FFF), shape = RoundedCornerShape(12.dp))
            .padding(16.dp),
    ) {
        // Elemento 1 del Column: nombre
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xFFE9DDF8), shape = RoundedCornerShape(8.dp))
                .padding(vertical = 20.dp),
            contentAlignment = Alignment.Center
        ){
            Text("Faustino", fontWeight = FontWeight.Bold, fontSize = 18.sp)
        }

        Spacer(modifier = Modifier.height(12.dp))

        // Elemento 2 del Column: un Row con dos datos
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xFFDCEBD4), shape = RoundedCornerShape(8.dp))
                .padding(12.dp),
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            Box(
                modifier = Modifier
                    .weight(1f)
                    .background(Color(0xFFE9DDF8), shape = RoundedCornerShape(8.dp))
                    .padding(vertical = 16.dp),
                contentAlignment = Alignment.Center

            ){
                Text("Cel: 906 259 697")
            }
            Box(
                modifier = Modifier
                    .weight(1f)
                    .background(Color(0xFFE9DDF8), shape = RoundedCornerShape(8.dp))
                    .padding(vertical = 16.dp),
                contentAlignment = Alignment.Center

            ){
                Text("tecsup")
            }
        }

        Spacer(modifier = Modifier.height(12.dp))

        MostrarCard()
    }
}

//6.  Boton Perzonalizado
@Composable
fun BotonPersonalizado(){
    Text(
        text = "Hola",
        color = Color.White,
        modifier = Modifier
            .padding(16.dp)
            .background(Color.DarkGray)
            .padding(12.dp)
            .clickable{/* accion */}
    )
}

//7. Estado del Boton
@Composable
fun  Contador(){
    var count by remember { mutableStateOf(0) } //0 = entero, 0.0 = double y '= string

    Column(
        modifier = Modifier
            .padding(40.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Contador: $count")
        Button(onClick = {count++}) {
            Text("Sumna")
        }
    }
}

//8. Estado del Boton
@Composable
fun  ContadorDos(){
    var count by rememberSaveable() { mutableStateOf(0) } //0 = entero, 0.0 = double y '= string

    Column(
        modifier = Modifier
            .padding(40.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Contador: $count")
        Button(onClick = {count++}) {
            Text("Sumna")
        }
    }
}


//9, Los Card
@Composable
fun MostrarCard(){
    Card(
        modifier = Modifier.fillMaxWidth(),
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.primaryContainer
        )
    ) {
        Column(Modifier.padding(16.dp)) {
            Text("Cita cofirmada", fontWeight = FontWeight.Bold)
            Text("Martes 10:30 am - Consultorio 4")
        }
    }
}

//9, Box
@Composable
fun BoxExp(){
    Box(
        modifier = Modifier
            .size(200.dp)
            .background(Color.Red),
        contentAlignment = Alignment.Center
    ) {
        Box(
            modifier = Modifier
                .size(140.dp)
                .background(Color.Black),
            contentAlignment = Alignment.Center
        ) {
            Box(
                modifier = Modifier
                    .size(80.dp)
                    .background(Color.Red),
                contentAlignment = Alignment.Center

            ){
                Text("Hola")
            }
        }
    }
}




@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    PracticaTheme {
        BoxExp()
    }
}
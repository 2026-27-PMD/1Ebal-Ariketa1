package com.example.a1ariketa


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.a1ariketa.ui.theme._1AriketaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AppKaixoMundua()
        }
    }
}

@Composable
fun AppKaixoMundua() {
    var mezua by remember { mutableStateOf("Kaixo Mundua") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
//        verticalArrangement = Arrangement.Center
    ){
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(84.dp)
                .background(Color(0xFF673AB7)),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "Kaixo Mundua",
                color = Color(0xFFFBFBFB),
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold
            )
        }
        Spacer(Modifier.height(45.dp))

        Text(
            text = mezua,
            style = MaterialTheme.typography.headlineMedium,
            color = Color.Blue
        )

        Image(
            painter = painterResource(R.drawable.nire_irudia),
            contentDescription = "Mundua",
            modifier = Modifier.size(100.dp)
        )

        Button(onClick = {
            mezua =
                if (mezua == "Kaixo Mundua") "Agur Mundua"
                else "Kaixo Mundua"
        },
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 5.dp)
        ){
            Text("Sakatu")
        }
    }
}

@Preview
@Composable
fun AppKaixoMunduaPreview() {
    AppKaixoMundua()
}
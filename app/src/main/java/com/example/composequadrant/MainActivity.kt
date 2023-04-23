package com.example.composequadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.composequadrant.ui.theme.ComposeQuadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeQuadrantTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Quadrants(
                        header1 = "Text composable",
                        body1 = "Displays text and follows Material Design guidelines.",
                        header2 = "Image composable",
                        body2 = "Creates a composable that lays out and draws a given Painter class object.",
                        header3 = "Row composable",
                        body3 = "A layout composable that places its children in a horizontal sequence.",
                        header4 = "Column composable",
                        body4 = "A layout composable that places its children in a vertical sequence."
                    )
                }
            }
        }
    }
}

@Composable
fun Quadrants(header1: String, body1: String, header2: String, body2: String, header3: String, body3: String, header4: String, body4: String) {
    Column(Modifier.fillMaxWidth()) {
        Row(Modifier.weight(1f)) {
            Quadrant(header = header1, body = body1, modifier = Modifier.weight(1f), androidx.compose.ui.graphics.Color.Green)
            Quadrant(header = header2, body = body2, modifier = Modifier.weight(1f), androidx.compose.ui.graphics.Color.Yellow)
        }
        Row(Modifier.weight(1f)) {
            Quadrant(header = header3, body = body3, modifier = Modifier.weight(1f), androidx.compose.ui.graphics.Color.Cyan)
            Quadrant(header = header4, body = body4, modifier = Modifier.weight(1f), androidx.compose.ui.graphics.Color.LightGray)
        }
    }
}

@Composable
fun Quadrant(header: String, body: String, modifier: Modifier = Modifier, background: Color){
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(background)
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = header, fontWeight = FontWeight.Bold ,modifier = Modifier.padding(bottom = 16.dp))
        Text(text = body)
    }
}

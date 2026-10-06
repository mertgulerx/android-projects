package com.mertguler.quadrant

import android.R
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mertguler.quadrant.ui.theme.QuadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            QuadrantTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Quadrant(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Quadrant(modifier: Modifier) {
    Row(modifier = modifier.fillMaxWidth()) {
        Column(modifier = modifier.fillMaxHeight().weight(1f)) {
            QuadrantUnit(title = "Text composable",
                message = "Displays text and follows the recommended Material Design guidelines.",
                color = Color(0xFFEADDFF), modifier = Modifier.weight(1f))
            QuadrantUnit(title = "Image composable",
                message = "Creates a composable that lays out and draws a given Painter class object.",
                color = Color(0xFFD0BCFF), modifier = Modifier.weight(1f))
        }
        Column(modifier = modifier.fillMaxHeight().weight(1f)) {
            QuadrantUnit(title = "Row composable",
                message = "A layout composable that places its children in a horizontal sequence.",
                color = Color(0xFFB69DF8), modifier = Modifier.weight(1f))
            QuadrantUnit(title = "Column composable",
                message = "A layout composable that places its children in a vertical sequence.",
                color = Color(0xFFF6EDFF), modifier = Modifier.weight(1f))
        }
    }
}

@Composable
fun QuadrantUnit(title: String, message: String, color: Color, modifier: Modifier){
    Box(modifier = modifier.background(color).fillMaxSize()){
        Column(modifier = Modifier.align(Alignment.Center),
            horizontalAlignment = Alignment.CenterHorizontally) {
            Text(
                text = title,
                modifier = Modifier
                    .padding(bottom = 10.dp),
                fontWeight = FontWeight.Bold,
            )
            Text(
                text = message,
                modifier = Modifier.padding(start = 12.dp, end = 12.dp),
                textAlign = TextAlign.Justify
            )
        }

    }
}

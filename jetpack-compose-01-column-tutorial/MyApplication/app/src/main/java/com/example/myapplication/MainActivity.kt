package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApplicationTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ColumnContent(Modifier)
                }
            }
        }
    }
}

@Composable
fun ColumnContent(modifier: Modifier = Modifier) {
    Column(verticalArrangement = Arrangement.spacedBy(20.dp), modifier = modifier) {
        val image = painterResource(R.drawable.bg_compose_background)
        Image(painter = image,
            contentDescription = null,
            alignment = Alignment.TopCenter,
            modifier = modifier.statusBarsPadding())

        Text(
            text = stringResource(R.string.title),
            color = Color.Black,
            fontSize = 30.sp,
            textAlign = TextAlign.Left,
            modifier = modifier.padding(start = 14.dp)
        )
        Text(
            text = stringResource(R.string.paragraph1),
            coloBlack,
            fontSize = 20.sp,
            textAlign = TextAlign.Justify,
            modifier = modifier.padding(start = 16.dp, end = 16.dp),
            lineHeight = 26.sp
        )
        Text(
            text = stringResource(R.string.paragraph2),
            color = Color.Black,
            fontSize = 20.sp,
            textAlign = TextAlign.Justify,
            modifier = modifier.padding(start = 16.dp, end = 16.dp),
            lineHeight = 26.sp
        )
    }
}




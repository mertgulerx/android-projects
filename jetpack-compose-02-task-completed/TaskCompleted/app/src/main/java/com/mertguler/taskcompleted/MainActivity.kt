package com.mertguler.taskcompleted

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mertguler.taskcompleted.ui.theme.TaskCompletedTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TaskCompletedTheme {
                Box(modifier = Modifier.fillMaxSize()) {
                    ColumnContent(name = "Android")
                }
            }
        }
    }
}

@Composable
fun ColumnContent(name: String) {
    val image = painterResource(R.drawable.ic_task_completed)
    Box(modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center){
        Column(verticalArrangement = Arrangement.spacedBy(10.dp)) {
            Image(painter = image,
                contentDescription = null)
            Text(
                text = stringResource(R.string.task_completed),
                color = Color.Black,
                fontSize = 20.sp,
                modifier = Modifier.padding(top = 20.dp).align(Alignment.CenterHorizontally),
                lineHeight = 26.sp,
                fontWeight = FontWeight.Bold,
            )
            Text(
                text = stringResource(R.string.nice_work),
                color = Color.Black,
                fontSize = 18.sp,
                modifier = Modifier.padding(top = 2.dp).align(Alignment.CenterHorizontally),
                lineHeight = 26.sp,
            )
        }
    }
}
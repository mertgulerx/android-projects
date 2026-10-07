package com.mertguler.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Mail
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mertguler.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BusinessCardTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    MainMenu(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }

    @Composable
    fun MainMenu(modifier: Modifier) {
        Box(modifier = modifier
            .fillMaxSize()
            .background(Color(0xFFCCE4CE))) {
            Box(modifier = modifier.align(Alignment.Center)){
                MiddleContent(modifier)
            }
            Box(modifier = modifier.align(Alignment.BottomCenter)){
                BottomContent(modifier)
            }


        }
    }

    @Composable
    fun MiddleContent(modifier: Modifier){
        val androidLogo = painterResource(R.drawable.android_logo)
        Column(modifier = modifier,
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy((-12).dp)) {
            Box(modifier = modifier.background(Color(0xFF0B2A3A))
                .padding(10.dp)
                .size(100.dp),
                contentAlignment = Alignment.Center,){
                Image(
                    painter = androidLogo,
                    contentDescription = null
                )
            }
            Text(
                text = "Jennifer Doe",
                fontSize = 38.sp
            )
            Text(
                text = "Android Developer Extraordinaire",
                fontWeight = FontWeight.ExtraBold,
                fontSize = 16.sp,
                modifier = Modifier.padding(top = 24.dp),
                color = Color(0xFF005000)
            )
        }
    }

    @Composable
    fun BottomContent(modifier: Modifier){
            Column(modifier = modifier,
                verticalArrangement = Arrangement.spacedBy(10.dp)) {
                Row() {
                    Icon(
                        imageVector = Icons.Default.Phone,
                        contentDescription = null,
                        tint = Color(0xFF005000)
                    )
                    Text(
                        text = "+11 (123) 444 555 666",
                        fontSize = 16.sp,
                        modifier = Modifier.padding(start = 20.dp)
                    )
                }
                Row() {
                    Icon(
                        imageVector = Icons.Default.Share,
                        contentDescription = null,
                        tint = Color(0xFF005000)
                    )
                    Text(
                        text = "@AndroidDev",
                        fontSize = 16.sp,
                        modifier = Modifier.padding(start = 20.dp)
                    )
                }
                Row() {
                    Icon(
                        imageVector = Icons.Default.Mail,
                        contentDescription = null,
                        tint = Color(0xFF005000)
                    )
                    Text(
                        text = "jen.doe@android.com",
                        fontSize = 16.sp,
                        modifier = Modifier.padding(start = 20.dp)
                    )
                }

            }
    }
}



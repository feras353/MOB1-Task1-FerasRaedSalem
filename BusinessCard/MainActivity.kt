package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Phone
import androidx.compose.material.icons.rounded.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BusinessCardScreen()
                }
            }
        }
    }
}

@Composable
fun BusinessCardScreen() {
    val backgroundColor = Color(0xFF073042)
    
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(backgroundColor)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // ضع شعار أندرويد أو صورتك في res/drawable باسم android_logo.png
            val logo = painterResource(R.drawable.android_logo)
            Box(
                modifier = Modifier
                    .size(100.dp)
                    .background(Color(0xFF071E26)),
                contentAlignment = Alignment.Center
            ) {
                Image(
                    painter = logo,
                    contentDescription = null,
                    modifier = Modifier.size(80.dp)
                )
            }
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = "Feras Raed Salem",
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = "Multimedia & Mobile Developer",
                fontSize = 14.sp,
                color = Color(0xFF3ddc84),
                fontWeight = FontWeight.Bold
            )
        }

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.BottomCenter)
                .padding(bottom = 48.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            ContactRow(icon = Icons.Rounded.Phone, text = "+970 597 522 612")
            Spacer(modifier = Modifier.height(12.dp))
            ContactRow(icon = Icons.Rounded.Share, text = "@FerasSalem")
            Spacer(modifier = Modifier.height(12.dp))
            ContactRow(icon = Icons.Rounded.Email, text = "ferassalem210@gmail.com")
        }
    }
}

@Composable
fun ContactRow(icon: ImageVector, text: String) {
    Row(
        modifier = Modifier.width(280.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            imageVector = icon,
            contentDescription = null,
            tint = Color(0xFF3ddc84),
            modifier = Modifier.size(24.dp)
        )
        Spacer(modifier = Modifier.width(24.dp))
        Text(
            text = text,
            color = Color.White,
            fontSize = 14.sp
        )
    }
}
package br.com.fiap.myage

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.fiap.myage.ui.theme.MyAgeTheme
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyAgeTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    CounterScreen(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun CounterScreen(modifier: Modifier = Modifier) {

    val age = remember {
        mutableStateOf(0)
    }

    val minor = if (age.value >= 18) "of legal age" else "a minor"

    Column(
        modifier = modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "How old are you?",
            color = Color(0xFFAD1F4E),
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold
        )

        Text(
            text = "Press the buttons to enter your age.",
            fontSize = 12.sp
        )

        Spacer(modifier = Modifier.height((32.dp)))

        Text(
            text = "${age.value}",
            fontSize = 48.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height((32.dp)))

        Row() {
            Button(
                onClick = {
                    if (age.value > 0) age.value--
                },
                colors = ButtonDefaults.buttonColors(Color(0xFFAD1F4E)),
                shape = RoundedCornerShape(8.dp),
                modifier = Modifier.size(84.dp)
            ) {
                Text(
                    text = "-",
                    fontSize = 40.sp
                )
            }

            Spacer(modifier = Modifier.width((32.dp)))

            Button(
                onClick = {
                    if (age.value < 130) age.value++
                },
                colors = ButtonDefaults.buttonColors(Color(0xFFAD1F4E)),
                shape = RoundedCornerShape(8.dp),
                modifier = Modifier.size(84.dp)
            ) {
                Text(
                    text = "+",
                    fontSize = 40.sp
                )
            }
        }

        Spacer(modifier = Modifier.height((32.dp)))

        Text(
            text = "You are $minor",
            color = Color(0xFFAD1F4E),
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold
        )
    }
}
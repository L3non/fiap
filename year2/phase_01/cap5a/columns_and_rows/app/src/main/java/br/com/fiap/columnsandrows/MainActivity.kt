package br.com.fiap.columnsandrows

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.com.fiap.columnsandrows.ui.theme.ColumnsAndRowsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ColumnsAndRowsTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color.Yellow
                ) {
                    LayoutScreen()
                }
            }
        }
    }
}

@Composable
fun LayoutScreen() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(onClick = {}) {
            Text(text = "Button 1")
        }

        Button(onClick = {}) {
            Text(text = "Button 2")
        }

        Button(onClick = {}) {
            Text(text = "Button 3")
        }

        Column(
            verticalArrangement = Arrangement.SpaceAround,
            modifier = Modifier
                .background(Color.Blue)
                .fillMaxHeight()
        ) {
            Text(text = "FIAP")
            Text(text = "ANDROID")
            Text(text = "ANDROID STUDIO")

            Row(
                verticalAlignment = Alignment.Bottom,
                modifier = Modifier
                    .height(200.dp)
                    .background(Color.Gray)
                    .fillMaxWidth()
            ) {
                Button(onClick = {}) {
                    Text(text = "Button 4")
                }

                Button(onClick = {}) {
                    Text(text = "Button 5")
                }

                Button(onClick = {}) {
                    Text(text = "Button 6")
                }

                Column() {
                    Button(onClick = {}) {
                        Text(text = "Button 7")
                    }

                    Button(onClick = {}) {
                        Text(text = "Button 8")
                    }

                    Button(onClick = {}) {
                        Text(text = "Button 9")
                    }

                    Button(onClick = {}) {
                        Text(text = "Button 10")
                    }
                }
            }

            Row(
                horizontalArrangement = Arrangement.SpaceAround,
                modifier = Modifier
                    .background(Color.Magenta)
                    .fillMaxWidth(),
            ) {
                Button(onClick = {}) {
                    Text(text = "Button 11")
                }

                Button(onClick = {}) {
                    Text(text = "Button 12")
                }

                Button(onClick = {}) {
                    Text(text = "Button 13")
                }
            }
        }
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
private fun LayoutScreenPreview() {
    LayoutScreen()
}
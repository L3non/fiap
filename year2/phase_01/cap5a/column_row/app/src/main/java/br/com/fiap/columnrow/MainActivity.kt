package br.com.fiap.columnrow

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
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
import br.com.fiap.columnrow.ui.theme.ColumnRowTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ColumnRowTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxWidth().height(200.dp),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ColumnRowScreen()
                }
            }
        }
    }
}

@Composable
fun ColumnRowScreen() {
    // Main column
    Column(
        modifier = Modifier
            .background(Color.Cyan)
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier
                .background(Color.Magenta)
                .fillMaxWidth().height(300.dp)
        ) {
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Button 01")
            }
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Button 02")
            }
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Button 03")
            }
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Button 04")
            }
        }

        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceAround,
            modifier = Modifier
                .fillMaxWidth()
                .height(150.dp)
                .background(Color.Green)
        ) {
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Button 05")
            }
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Button 06")
            }
        }

        Row(modifier = Modifier
            .fillMaxWidth()
            .height(150.dp)
            .background(Color.Yellow)) {
            Column(modifier = Modifier
                .fillMaxWidth()
                .height(100.dp)
                .padding(8.dp)
                .background(Color.Red)
                .weight(0.3f)) {
                // Here is the content
            }

            Column(modifier = Modifier
                .fillMaxWidth()
                .height(100.dp)
                .padding(8.dp)
                .background(Color.Blue)
                .weight(0.7f)) {
                // Here is the content
            }
        }
    }
}
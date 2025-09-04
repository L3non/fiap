package br.com.fiap.layouts

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import br.com.fiap.layouts.ui.theme.LayoutsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LayoutsTheme {
                Scaffold { innerPadding ->
                    Surface(
                        shadowElevation = 4.dp,
                        border = BorderStroke(width = 4.dp, color = Color.Cyan),
                        color = Color.Green,
                        modifier = Modifier
                            .padding(innerPadding) // Aplica o padding para evitar a barra superior
                            .size(width = 200.dp, height = 200.dp),
                        shape = RoundedCornerShape(topEnd = 32.dp, bottomStart = 32.dp),
                    ) {
                        Box(
                            contentAlignment = Alignment.Center
                        ) {
                            Button(onClick = {}) {
                                Text(text = "Click me")
                            }

                            Text(
                                text = "FIAP",
                                modifier = Modifier.align(Alignment.BottomCenter)
                            )
                        }
                    }
                }
            }
        }
    }
}
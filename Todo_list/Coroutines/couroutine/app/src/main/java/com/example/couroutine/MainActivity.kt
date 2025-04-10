package com.example.couroutine



import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.couroutine.ui.theme.CouroutineTheme
import kotlinx.coroutines.delay

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CompteurAvecCoroutine()
        }
    }
}

@Composable
fun CompteurAvecCoroutine() {
    var compteur by remember { mutableStateOf(0) }

    // ✅ Coroutine sûre et fluide
    LaunchedEffect(Unit) {
        while (true) {
            delay(1000) // Attente non-bloquante
            compteur++  // Compose gère la mise à jour de l'UI
        }
    }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Compteur : $compteur", style = MaterialTheme.typography.headlineMedium)
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = { compteur = 0 }) {
            Text("Réinitialiser")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CouroutineTheme {
        CompteurAvecCoroutine()
    }
}
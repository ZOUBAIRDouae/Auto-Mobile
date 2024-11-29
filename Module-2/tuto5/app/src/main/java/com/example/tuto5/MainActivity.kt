package com.example.tuto5

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.tuto5.ui.theme.Tuto5Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Tuto5Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    UserInputApp()
                }
            }
        }
    }
}

@Composable
fun MyApp() {
    // Conteneur principal
    MaterialTheme {
        Surface(modifier = Modifier.fillMaxSize()) {
            UserInputApp()
        }
    }
}

@Composable
fun UserInputApp() {
    // Déclaration de l'état local
    var name by remember { mutableStateOf("") }
    var greetingMessage by remember { mutableStateOf("") }

    // Mise en page
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center
    ) {
        // Champ de texte pour la saisie
        TextField(
            value = name,
            onValueChange = { name = it },
            label = { Text("Entrez votre nom") },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(16.dp))

        // Bouton
        Button(
            onClick = {
                greetingMessage = "Salut, $name !"
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Valider")
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Affichage du message
        if (greetingMessage.isNotEmpty()) {
            Text(
                text = greetingMessage,
                style = MaterialTheme.typography.h6
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Tuto5Theme {
        UserInputApp()
    }
}
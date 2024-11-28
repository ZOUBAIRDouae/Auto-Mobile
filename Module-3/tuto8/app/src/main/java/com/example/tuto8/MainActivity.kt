package com.example.tuto8

import android.os.Bundle
import android.widget.Space
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.tuto8.ui.theme.Tuto8Theme


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.unit.dp



data class ListItem(
    val title: String ,
    val imageRes: Int
)

val sampleItems = listOf(
    ListItem("Tach1" , R.drawable.ic_launcher_background),
    ListItem("Tâche 2", R.drawable.ic_launcher_background),
    ListItem("Tâche 3", R.drawable.ic_launcher_background)
)

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Tuto8Theme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ListScreen(items = sampleItems)
                }
            }
        }
    }
}

@Composable
fun ListScreen(items: List<ListItem>) {
    LazyColumn(modifier = Modifier
        .fillMaxSize()
        .padding(16.dp)) {
        items(items) { item ->
            ListItemRow(item = item)
            Divider()
        }
    }
}

@Composable
fun ListItemRow(item: ListItem) {
    Row(
        modifier = Modifier
            .fillMaxSize()
            .clickable { }
            .padding(8.dp),
        horizontalArrangement = Arrangement.Start
    ) {
        val image: Painter = painterResource(id = item.imageRes)
        Image(
            painter = image,
            contentDescription = item.title,
            modifier = Modifier.size(40.dp)
        )
        Spacer(modifier = Modifier.width(16.dp))

        Text(
            text = item.title,
            style = MaterialTheme.typography.bodyLarge
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewListScreen() {
    MaterialTheme {
        ListScreen(items = sampleItems)
    }
}
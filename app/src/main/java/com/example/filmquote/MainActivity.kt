package com.example.filmquote

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.filmquote.ui.theme.FilmQuoteTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FilmQuoteTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Screen()
                }
            }
        }
    }
}

@Composable
fun Screen() {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Cyan)
    ) {
        FilmQuote()
        FilmName()
    }
}

@Composable
fun FilmQuote(modifier: Modifier = Modifier) {
    Text(
        text = "To infinity and beyond!",
        textAlign = TextAlign.Center,
        lineHeight = 90.sp,
        fontSize = 60.sp,
        color = Color.Black,
        fontWeight = FontWeight.Bold,
        modifier = modifier.padding(15.dp)
    )
}

@Composable
fun FilmName(modifier: Modifier = Modifier) {
    Text(
        text = "Toy Story",
        textAlign = TextAlign.Center,
        lineHeight = 60.sp,
        fontSize = 38.sp,
        color = Color.Magenta,
        modifier = modifier.padding(15.dp)
    )
}

@Preview(showBackground = true)
@Composable
fun FilmQuotePreview() {
    FilmQuoteTheme {
        Screen()
    }
}
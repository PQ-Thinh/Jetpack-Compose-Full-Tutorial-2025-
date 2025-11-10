package com.example.jetpackcomposefull

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.jetpackcomposefull.ui.theme.Greet
import com.example.jetpackcomposefull.ui.theme.JetpackComposeFullTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetpackComposeFullTheme {
                Greet()
            }
        }
    }
}
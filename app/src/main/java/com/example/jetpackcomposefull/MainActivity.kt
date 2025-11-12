package com.example.jetpackcomposefull

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.jetpackcomposefull.AnimationSystem.motion.MotionPhysicsDemo
import com.example.jetpackcomposefull.ui.theme.JetpackComposeFullTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetpackComposeFullTheme {
                Scaffold(modifier = Modifier
                    .fillMaxSize()
                ) {innerPadding ->
                    Box(modifier = Modifier
                        .fillMaxSize()
                        .padding(innerPadding),
                        contentAlignment = Alignment.Center){
                        MotionPhysicsDemo()
                    }
                }
            }
        }
    }
}
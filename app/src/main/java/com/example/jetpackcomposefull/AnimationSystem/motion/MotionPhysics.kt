@file:OptIn(ExperimentalMaterial3ExpressiveApi::class)

package com.example.jetpackcomposefull.AnimationSystem.motion

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.ExperimentalMaterial3ExpressiveApi
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpackcomposefull.ui.theme.JetpackComposeFullTheme


@Composable
fun MotionPhysicsDemo() {
    var isScaleDown by remember {
        mutableStateOf(true)
    }
    val animationProgress by animateFloatAsState(
        targetValue = if(isScaleDown) 0f else 1f,
        animationSpec = MaterialTheme.motionScheme.fastSpatialSpec()
    )
    Box(
        modifier = Modifier
            .size(100.dp)
            .graphicsLayer {
                this.scaleX = 1f + animationProgress
                this.scaleY = 1f + animationProgress
            }
            .background(Color.Red)
            .clickable {
                isScaleDown = !isScaleDown
            }
    ) {  }

}

@Preview
@Composable
fun MotionPhysicsDemoPreview() {
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
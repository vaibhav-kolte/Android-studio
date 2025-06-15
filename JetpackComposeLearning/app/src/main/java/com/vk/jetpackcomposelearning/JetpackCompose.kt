package com.vk.jetpackcomposelearning

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

@Composable
fun Greet(name: String) {
    Text("Hello $name")
}

@Composable
fun ProfileCard(name: String, age: Int, color: Color) {
    Text("$name $age $color")
}

// Recomposition

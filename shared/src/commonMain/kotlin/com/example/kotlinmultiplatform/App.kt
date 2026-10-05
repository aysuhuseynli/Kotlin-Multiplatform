package com.example.kotlinmultiplatform

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.kotlinmultiplatform.ui.ProductListScreen

@Composable
@Preview
fun App() {
    MaterialTheme {
        ProductListScreen()
    }
}
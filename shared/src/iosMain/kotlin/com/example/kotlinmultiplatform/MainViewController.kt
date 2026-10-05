package com.example.kotlinmultiplatform

import androidx.compose.ui.window.ComposeUIViewController
import com.example.kotlinmultiplatform.di.initKoin

fun MainViewController() = ComposeUIViewController {
    initKoin()
    App()
}

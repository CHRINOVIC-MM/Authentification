package com.example.authentification.app

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.Modifier
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import com.example.authentification.screens.SignUpScreen


@Composable
fun PostOfficeApp(){
    Surface(
        modifier = Modifier.fillMaxSize()
    ){
        SignUpScreen()
    }
}
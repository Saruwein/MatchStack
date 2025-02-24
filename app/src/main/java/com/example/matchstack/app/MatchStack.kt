package com.example.matchstack.app


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color


// entry point
@Composable
fun MatchStack (modifier: Modifier) {
    Surface(
        modifier = Modifier
        .background(MaterialTheme.colorScheme.secondary)
        ) {
        // Sign Up page
        SignUp(modifier = Modifier)
    }

}
package com.example.matchstack.app

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.matchstack.components.TextP1

@Composable
fun SignUp (modifier:Modifier){

    Surface(
        modifier = Modifier
            .fillMaxSize()
            .padding(28.dp),
        shape = RoundedCornerShape(32.dp),

    ) {
    TextP1("Welcome to MatchStack")

    }
}

@Preview
@Composable
fun DefaultPreviewOfSignUp() {
    SignUp(modifier = Modifier)
}





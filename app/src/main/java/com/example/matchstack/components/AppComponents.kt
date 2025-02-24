package com.example.matchstack.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.matchstack.ui.theme.Typography


@Composable
fun TextP1(value :String) {
    Text(
        text = value,
        modifier = Modifier
            .fillMaxWidth()
            .heightIn(min = 80.dp),
        style = Typography.bodyMedium,
        textAlign = TextAlign.Center
    )
}

@Composable
fun TextH1(value :String) {
    Text(
        text = value,
        modifier = Modifier
            .fillMaxWidth()
            .heightIn(min = 90.dp),
        style = Typography.headlineLarge,
        textAlign = TextAlign.Center,
    )
}

@Composable
fun TextH2(value :String) {
    Text(
        text = value,
        modifier = Modifier
            .fillMaxWidth()
            .heightIn(min = 90.dp),
        style = Typography.headlineMedium,
        textAlign = TextAlign.Center,
    )
}
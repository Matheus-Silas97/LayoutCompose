package com.matheussilas97.layoutcompose.ui.theme

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun TextNormal(text: String, color: Color) {
    Text(
        text = text,
        color = color,
    )
}

@Preview
@Composable
fun TextNormalPreview() {
    TextNormal(text = "teste", Pink80)
}
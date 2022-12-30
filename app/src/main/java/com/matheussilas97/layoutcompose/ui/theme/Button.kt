package com.matheussilas97.layoutcompose.ui.theme

import androidx.compose.material3.Button
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun ActionButton(click: () -> Unit) {
    Button(onClick = click) {

    }
}

@Preview
@Composable
fun ButtonPreview() {
        ActionButton {}
}

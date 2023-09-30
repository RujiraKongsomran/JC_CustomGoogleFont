package com.rujirakongsomran.jc_customgooglefont

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.rujirakongsomran.jc_customgooglefont.ui.theme.fontFamily

@Preview(showSystemUi = true)
@Composable
fun MainScreen() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = "Hardin Scott",
            fontFamily = fontFamily,
            fontSize = MaterialTheme.typography.displayLarge.fontSize,
            style = MaterialTheme.typography.bodyMedium
        )
    }
}
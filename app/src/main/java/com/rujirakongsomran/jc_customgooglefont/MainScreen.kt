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
import kotlinx.coroutines.CoroutineExceptionHandler
import android.util.Log
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalFontFamilyResolver
import androidx.compose.ui.text.font.createFontFamilyResolver

@Preview(showSystemUi = true)
@Composable
fun MainScreen() {
    val handler = CoroutineExceptionHandler { _, throwable ->
        // process the Throwable
        Log.e("MainScreen", "There has been an issue: ", throwable)
    }
    CompositionLocalProvider(
        LocalFontFamilyResolver provides createFontFamilyResolver(LocalContext.current, handler)
    ){
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

}
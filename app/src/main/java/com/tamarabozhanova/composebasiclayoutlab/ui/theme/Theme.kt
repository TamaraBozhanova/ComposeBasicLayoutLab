package com.tamarabozhanova.composebasiclayoutlab.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.MaterialTheme.shapes
import androidx.compose.material.MaterialTheme.typography
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val DarkColorPalette = darkColors(
    primary = Color.White,
    secondary = rust300,
    background = gray900,
    surface = Color.White.copy(alpha = 0.15f),
    onPrimary = gray900,
    onSecondary = gray900,
    onBackground = taupe100,
    onSurface = Color.White.copy(alpha = .8f)
)

private val LightColorPalette  = lightColors(
    primary = gray900,
    secondary = rust600,
    background = taupe100,
    surface = Color.White.copy(alpha = .85f),
    onPrimary = Color.White,
    onSecondary = Color.White,
    onBackground = taupe800,
    onSurface = gray900.copy(alpha = 0.8f)
)

@Composable
fun ComposeBasicLayoutLabTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit
) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colors = colors,
        typography = typography,
        shapes = shapes,
        content = content
    )
}
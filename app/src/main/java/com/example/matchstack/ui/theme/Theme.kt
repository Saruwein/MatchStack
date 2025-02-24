package com.example.matchstack.ui.theme

import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext

private val DarkColorScheme = darkColorScheme(
    primary = deepDark,
    secondary = prettyDark,
    // Other default colors to override
    tertiary = darkOrange,
    background = deepDark,
    surface = darkSurface,
    onPrimary = prettyLight,
    onSecondary = highlight,
    onTertiary = lightOrange,
    onBackground = lightSurface,
    onSurface = lightSurface,
)

private val LightColorScheme = lightColorScheme(
    primary = prettyLight,
    secondary = highlight,
    tertiary = lightOrange,

    // Other default colors to override
    background = prettyLight,
    surface = lightSurface,
    onPrimary = deepDark,
    onSecondary = prettyDark,
    onTertiary = darkOrange,
    onBackground = prettyLight,
    onSurface = darkSurface,

)

@Composable
fun MatchStackTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }

        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}
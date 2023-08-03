package com.plcoding.contactscomposemultiplatform

import androidx.compose.ui.window.ComposeUIViewController
import platform.UIKit.UIScreen
import platform.UIKit.UIUserInterfaceStyle

fun MainViewController() = ComposeUIViewController {
    val isDarkTheme = UIUserInterfaceStyle.UIUserInterfaceStyleDark ==
            UIScreen.mainScreen.traitCollection.userInterfaceStyle
    App(
        darkTheme = isDarkTheme,
        dynamicColor = false
    )
}

package com.plcoding.contactscomposemultiplatform

import androidx.compose.ui.interop.LocalUIViewController
import androidx.compose.ui.window.ComposeUIViewController
import com.plcoding.contactscomposemultiplatform.common.presentation.ImagePickerFactory
import com.plcoding.contactscomposemultiplatform.di.AppModule
import platform.UIKit.UIScreen
import platform.UIKit.UIUserInterfaceStyle

fun MainViewController() = ComposeUIViewController {
    val isDarkTheme = UIUserInterfaceStyle.UIUserInterfaceStyleDark ==
            UIScreen.mainScreen.traitCollection.userInterfaceStyle
    App(
        darkTheme = isDarkTheme,
        dynamicColor = false,
        appModule = AppModule(),
        imagePicker = ImagePickerFactory(LocalUIViewController.current).createPicker()
    )
}

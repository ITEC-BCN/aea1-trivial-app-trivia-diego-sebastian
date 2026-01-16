package com.example.trivialapp_base

sealed class Routes(val route: String) {
    object ScreenGame : Routes("ScreenGame")
    object ScreenMenu : Routes("ScreenMenu")
    object ScreenResult : Routes("ScreenResult")
    object ScreenSplash : Routes("ScreenSplash")
}
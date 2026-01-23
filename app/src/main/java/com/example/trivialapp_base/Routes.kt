package com.example.trivialapp_base

sealed class Routes(val route: String) {
    object GameScreen : Routes("GameScreen")
    object ScreenMenu : Routes("ScreenMenu")
    object ScreenResult : Routes("ScreenResult")
    object ScreenSplash : Routes("ScreenSplash")
}
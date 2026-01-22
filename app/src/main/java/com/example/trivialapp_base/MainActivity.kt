package com.example.trivialapp_base

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.trivialapp_base.ui.theme.TrivialAPP_BaseTheme
import com.example.trivialapp_base.view.MenuScreen
import com.example.trivialapp_base.view.ResultScreen
import com.example.trivialapp_base.viewmodel.GameViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TrivialAPP_BaseTheme {
                // Controlador de navegación

                // Instanciamos el ViewModel una vez
                 val viewModel: GameViewModel by viewModels()

                // Definición de rutas y navegación
                val navigationController = rememberNavController()
              /*  NavHost(
                    navController = navigationController,
                    startDestination = Routes.ScreenMenu.route
                ) {
                    composable(Routes.ScreenMenu.route) { ScreenMenu1(navigationController) }
                    composable(Routes.ScreenGame.route) { ScreenGame2(navigationController) }
                    composable(Routes.ScreenResult.route) { ScreenResult3(navigationController) }
                    composable(Routes.ScreenSplash.route) { ScreenSplash4(navigationController) }

                }*/
                MenuScreen(navigationController, viewModel)


            }
        }
    }
}
package com.example.trivialapp_base.view

import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.navigation.NavController
import com.example.trivialapp_base.model.ProveedorPreguntas
import com.example.trivialapp_base.viewmodel.GameViewModel
import android.content.res.Resources
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api

import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import com.example.trivialapp_base.R
import com.example.trivialapp_base.Routes
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun GameScreen(navController: NavController, viewModel: GameViewModel) {
        var countrondas by rememberSaveable {mutableStateOf(0)}
        var countAccert = rememberSaveable{mutableStateOf(0)}
        val preguntas = remember { ProveedorPreguntas.obtenerPreguntas() }
        val indice = rememberSaveable { mutableStateOf(0) }
         val preguntaActual = preguntas[indice.value]

    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = { Text("Rondas : ${countrondas}/12", fontFamily = FontFamily.Monospace) },
                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                    containerColor = colorResource(id = R.color.FondoToolBar)
                )
            )
        }
    ) { innerPadding ->
        ConstraintLayout( modifier = Modifier
            .fillMaxSize()
            .padding(innerPadding).background(colorResource(id = R.color.Fondo))
        )  {

            val(pregunta,sectionBtn) = createRefs()

                Text(text = preguntaActual.pregunta , modifier = Modifier.constrainAs(pregunta){
                    top.linkTo(parent.top, margin = 60.dp)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)

                }, fontSize = 25.sp)

                Row (modifier = Modifier.constrainAs(sectionBtn){
                    top.linkTo(pregunta.bottom, margin = 50.dp)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                }) {
                    Column() {
                        Button(onClick = { /* comprobar respuesta */ }) {
                            Text(preguntaActual.respuesta1)
                        }
                        Button(onClick = { }) {
                            Text(preguntaActual.respuesta2)
                        }
                    }
                    Column() {
                        Button(onClick = { }) {
                        Text(preguntaActual.respuesta3)
                    }
                        Button(onClick = { }) {
                            Text(preguntaActual.respuesta4)
                        } }

            }
        }
    }

}
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
import com.example.trivialapp_base.model.Pregunta
import kotlin.random.Random

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun GameScreen(navController: NavController, viewModel: GameViewModel) {
        var countrondas by rememberSaveable {mutableStateOf(0)}
        var contadorAccert = rememberSaveable{mutableStateOf(0)}
        val preguntas = remember { ProveedorPreguntas.obtenerPreguntas() }
        val indice = rememberSaveable { mutableStateOf(0) }
        val preguntaActual = preguntas[indice.value]

        val respuestasAleatorias = rememberSaveable(indice.value) {
            listOf(
                preguntaActual.respuesta1,
                preguntaActual.respuesta2,
                preguntaActual.respuesta3,
                preguntaActual.respuesta4
            ).shuffled()
        }
        var msgRespuesta by rememberSaveable{mutableStateOf( " ") }

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

            val(pregunta,sectionBtn,sectionMsg) = createRefs()

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
                        Button(onClick = { msgRespuesta = ComprobarRespuesta(respuestasAleatorias[0], preguntaActual)
                            countrondas++},
                            Modifier.width(120.dp)
                                .height(70.dp)) {
                            Text(respuestasAleatorias[0])
                        }

                        Button(onClick = { msgRespuesta = ComprobarRespuesta(respuestasAleatorias[1], preguntaActual)
                            countrondas++},
                            Modifier.width(120.dp)
                                .height(70.dp)
                        ) {
                            Text(respuestasAleatorias[1])
                        }
                    }
                    Column() {
                        Button(onClick = { msgRespuesta = ComprobarRespuesta(respuestasAleatorias[2], preguntaActual)
                        countrondas++},
                            Modifier.width(120.dp)
                            .height(70.dp)
                        ) {
                            Text(respuestasAleatorias[2])
                        }

                        Button(onClick = { msgRespuesta =  ComprobarRespuesta(respuestasAleatorias[3], preguntaActual)
                            countrondas++},
                            Modifier.width(120.dp)
                                .height(70.dp)) {
                            Text(respuestasAleatorias[3])
                        }}

                }
                Column(modifier = Modifier.constrainAs(sectionMsg){
                    top.linkTo(sectionBtn.bottom, margin = 50.dp)
                }) {
                Text("$msgRespuesta")
                 }

            }
        }
    }



fun ComprobarRespuesta(respuestaSeleccionada: String, pregunta: Pregunta): String {
    var respuesta : String
    if (respuestaSeleccionada == pregunta.respuestaCorrecta) {
        respuesta = "Respuesta Correcta"
    } else {
        respuesta = "Respuesta Incorrecta"
    }
    return respuesta
}
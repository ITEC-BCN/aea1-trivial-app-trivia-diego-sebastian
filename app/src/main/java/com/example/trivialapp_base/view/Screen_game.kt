package com.example.trivialapp_base.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.example.trivialapp_base.R
import com.example.trivialapp_base.model.ProveedorPreguntas
import com.example.trivialapp_base.model.Pregunta
import com.example.trivialapp_base.viewmodel.GameViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun GameScreen(
    navController: NavController,
    viewModel: GameViewModel = viewModel()
) {


    var msgRespuesta by mutableStateOf(" ")

    val preguntas = remember { ProveedorPreguntas.obtenerPreguntas() }

    LaunchedEffect(Unit) {
        viewModel.iniciarJuego(preguntas)
    }
    if(viewModel.countrondas >= 12)
    {
        navController.navigate("ScreenResult")
    }

    val preguntaActual = viewModel.preguntaActual ?: return
    val respuestasAleatorias = viewModel.respuestasMezcladas

    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = {
                    Text(
                        "Rondas : ${viewModel.countrondas}/12",
                        fontFamily = FontFamily.Monospace
                    )
                },
                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                    containerColor = colorResource(id = R.color.FondoToolBar)
                )
            )
        }
    ) { innerPadding ->

        ConstraintLayout(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .background(colorResource(id = R.color.Fondo))
        ) {

            val (pregunta, sectionBtn, sectionMsg, sectionLineal) = createRefs()

            Text(
                text = preguntaActual.pregunta,
                modifier = Modifier.constrainAs(pregunta) {
                    top.linkTo(parent.top, margin = 60.dp)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                },
                fontSize = 25.sp
            )

            Row(
                modifier = Modifier.constrainAs(sectionBtn) {
                    top.linkTo(pregunta.bottom, margin = 50.dp)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                }
            ) {

                Column {
                    Button(
                        onClick = {
                            msgRespuesta = ComprobarRespuesta(
                                respuestasAleatorias[0],
                                preguntaActual
                            )
                            viewModel.responderPregunta(respuestasAleatorias[0])
                        },
                        modifier = Modifier
                            .width(120.dp)
                            .height(70.dp)
                    ) {
                        Text(respuestasAleatorias[0])
                    }

                    Button(
                        onClick = {
                            msgRespuesta = ComprobarRespuesta(
                                respuestasAleatorias[1],
                                preguntaActual
                            )
                            viewModel.responderPregunta(respuestasAleatorias[1])
                        },
                        modifier = Modifier
                            .width(120.dp)
                            .height(70.dp)
                    ) {
                        Text(respuestasAleatorias[1])
                    }
                }
                Spacer(modifier = Modifier.height(20.dp))

                Column {
                    Button(
                        onClick = {
                            msgRespuesta = ComprobarRespuesta(
                                respuestasAleatorias[2],
                                preguntaActual
                            )
                            viewModel.responderPregunta(respuestasAleatorias[2])
                        },
                        modifier = Modifier
                            .width(120.dp)
                            .height(70.dp)
                    ) {
                        Text(respuestasAleatorias[2])
                    }

                    Button(
                        onClick = {
                            msgRespuesta = ComprobarRespuesta(
                                respuestasAleatorias[3],
                                preguntaActual
                            )
                            viewModel.responderPregunta(respuestasAleatorias[3])
                        },
                        modifier = Modifier
                            .width(120.dp)
                            .height(70.dp)
                    ) {
                        Text(respuestasAleatorias[3])
                    }
                }
            }

            LinearProgressIndicator(
                progress = viewModel.tiempoRestante,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 10.dp, horizontal = 30.dp)
                    .constrainAs(sectionLineal) {
                        top.linkTo(sectionBtn.bottom, margin = 50.dp)
                    }
            )

            Text(
                text = msgRespuesta,
                modifier = Modifier.constrainAs(sectionMsg) {
                    start.linkTo(parent.start, margin = 120.dp)
                    top.linkTo(sectionLineal.bottom, margin = 20.dp)
                }
            )

            if(msgRespuesta == "Respuesta Correcta")
            {
                viewModel.puntuacion+1
            }

        }
    }
}

fun ComprobarRespuesta(respuestaSeleccionada: String, pregunta: Pregunta): String {
    var respuesta : String
    if (respuestaSeleccionada == pregunta.respuestaCorrecta)
    {
        respuesta = "Respuesta Correcta"
    }
    else {
        respuesta = "Respuesta Incorrecta"
    }
    return respuesta
}
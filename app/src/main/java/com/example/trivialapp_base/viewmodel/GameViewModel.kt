package com.example.trivialapp_base.viewmodel

import android.os.CountDownTimer
import androidx.compose.runtime.*
import androidx.lifecycle.ViewModel
import com.example.trivialapp_base.model.Pregunta
import com.example.trivialapp_base.model.ProveedorPreguntas

class GameViewModel : ViewModel() {

    private var preguntasPartida: List<Pregunta> = emptyList()
    var   countrondas by mutableStateOf(0)
    var indicePreguntaActual by mutableIntStateOf(0)
        private set

    var preguntaActual by mutableStateOf<Pregunta?>(null)
        private set

    var respuestasMezcladas by mutableStateOf<List<String>>(emptyList())
        private set

    var puntuacion by mutableIntStateOf(0)
        private set

    var tiempoRestante by mutableFloatStateOf(1f)
        private set

    var juegoTerminado by mutableStateOf(false)
        private set

    var dificultadSeleccionada by mutableStateOf("Facil")
        private set

    private var timer: CountDownTimer? = null
    private val TIEMPO_POR_PREGUNTA = 10_000L

    fun iniciarJuego(preguntas: List<Pregunta>) {
        preguntasPartida = preguntas.shuffled()
        indicePreguntaActual = 0
        puntuacion = 0
        countrondas = 0
        juegoTerminado = false
        cargarSiguientePregunta()
    }
    private fun cargarSiguientePregunta() {
        if (indicePreguntaActual >= preguntasPartida.size) {
            juegoTerminado = true
            timer?.cancel()
            return
        }

        preguntaActual = preguntasPartida[indicePreguntaActual]

        respuestasMezcladas = listOf(
            preguntaActual!!.respuesta1,
            preguntaActual!!.respuesta2,
            preguntaActual!!.respuesta3,
            preguntaActual!!.respuesta4
        ).shuffled()

        tiempoRestante = 1f
        iniciarTimer()
    }

    fun responderPregunta(respuestaUsuario: String) {
        timer?.cancel()

        if (respuestaUsuario == preguntaActual?.respuestaCorrecta) {
            puntuacion++
        }

        avanzarRonda()
    }

    private fun avanzarRonda() {
        indicePreguntaActual++
        cargarSiguientePregunta()
        countrondas++
    }

    private fun iniciarTimer() {
        timer?.cancel()
        timer = object : CountDownTimer(TIEMPO_POR_PREGUNTA, 100) {
            override fun onTick(millisUntilFinished: Long) {
                // Actualitzem l'estat directament
                tiempoRestante = millisUntilFinished.toFloat() / TIEMPO_POR_PREGUNTA
            }

            override fun onFinish() {
                tiempoRestante = 0f
                avanzarRonda()

                //TODO
            }
        }.start()
    }

    override fun onCleared() {
        super.onCleared()
        timer?.cancel()
    }

    fun setDificultad(dificultad: String) {
        dificultadSeleccionada = dificultad
    }
}

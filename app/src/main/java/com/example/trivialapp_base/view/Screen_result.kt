package com.example.trivialapp_base.view

import android.R
import android.text.style.BackgroundColorSpan
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.modifier.ModifierLocalReadScope
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.fontResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.trivialapp_base.Routes
import com.example.trivialapp_base.viewmodel.GameViewModel


@Composable
fun ResultScreen(navController: NavController, viewModel: GameViewModel) {
    var score = viewModel.puntuacion
    val returnToMenu: () -> Unit

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(15.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,

    )
    {
        Text(
            text = "Your Score",
            fontSize = 35.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(20.dp))
        Text(
            text = "$score pts",
            fontSize = 48.sp,
            fontWeight = FontWeight.ExtraBold,
            color = Color.Magenta
        )

        Spacer(modifier = Modifier.height(40.dp))
        Button(
            onClick = {},
            modifier = Modifier
                .height(50.dp),
            shape = RoundedCornerShape(25)
        )
        {
            Text(
                text = "Share",
                fontSize = 18.sp
            )
        }

        Spacer(modifier = Modifier.height(20.dp))
        Button(
            onClick = {navController.navigate("ScreenMenu")},
            modifier = Modifier.height(50.dp),
            shape = RoundedCornerShape(25)/*,
            colors = ButtonDefaults.buttonColors(Color.Red)*/
        )
        {
            Text(
                text = "Return to menu",
                fontSize = 18.sp
            )
        }
    }
}
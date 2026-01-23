package com.example.trivialapp_base.view

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
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.navigation.NavController
import com.example.trivialapp_base.R
import com.example.trivialapp_base.Routes
import com.example.trivialapp_base.viewmodel.GameViewModel


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MenuScreen(navController: NavController, viewModel: GameViewModel) {

    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = { Text("Trivial", fontFamily = FontFamily.Monospace) },
                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                    containerColor = colorResource(id = R.color.FondoToolBar)
                )
            )
        }
    ) { innerPadding ->
        ConstraintLayout(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding).background(colorResource(id = R.color.Fondo))
        ) {
            val (Logo,iconGame,btn1Ref,iconSettings, btn2Ref) = createRefs()

            Image(painter = painterResource(id = R.drawable.trivial_icon), contentDescription = "LogoApp",
                Modifier.constrainAs(Logo){
                    top.linkTo(parent.top,margin = 20.dp)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                }.size(250.dp))


                Image(
                    painter = painterResource(id = R.drawable.baseline_videogame_asset_24),
                    contentDescription = "Start",
                    modifier = Modifier.constrainAs(iconGame) {
                        top.linkTo(Logo.bottom , margin = 5.dp)
                        start.linkTo(parent.start)
                        end.linkTo(parent.end, margin = 200.dp)
                    }.size(60.dp), alpha = 1f
                )
                Button(onClick = { navController.navigate("GameScreen")  }, modifier = Modifier.constrainAs(btn1Ref){
                    start.linkTo(iconGame.end, margin = 25.dp)
                    top.linkTo(Logo.bottom)
                }.width(120.dp)
                    .height(70.dp))  { Text("Game",fontSize = 18.sp)}
            Image(
                painter = painterResource(id = R.drawable.baseline_settings_24),
                contentDescription = "Dificultad",
                modifier = Modifier.constrainAs(iconSettings) {
                    top.linkTo(iconGame.bottom, margin = 58.dp)
                    start.linkTo(parent.start,)
                    end.linkTo(parent.end, margin = 200.dp)
                }.size(60.dp), alpha = 1f
            )
            Button(onClick = { navController.navigate(Routes.GameScreen.route) }, modifier = Modifier.constrainAs(btn2Ref){
                start.linkTo(iconSettings.end, margin = 25.dp)
                top.linkTo(iconGame.bottom, margin = 55.dp)
            } .width(120.dp)
                .height(70.dp)) { Text("Settings", fontSize = 18.sp)}

        }

    }


}






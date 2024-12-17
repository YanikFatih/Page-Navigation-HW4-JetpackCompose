package com.example.pagenavigationhw4.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun PageX(navController: NavController) {
    val configuration = LocalConfiguration.current
    val screenHeight = configuration.screenHeightDp
    val screenWidth = configuration.screenWidthDp
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Page X", fontSize = 30.sp)
        Button(
            modifier = Modifier.height((screenHeight/15).dp).width((screenWidth/1.5).dp),
            shape = RoundedCornerShape(15.dp),
            colors = ButtonDefaults.buttonColors(

            ),
            onClick = { /*Go to page Y*/
                navController.navigate("pagey") {
                    popUpTo("pagex") { inclusive = true } //backstack deleted
                }
            }
        ) {
            Text("Page Y", fontSize = 20.sp)
        }
    }
}
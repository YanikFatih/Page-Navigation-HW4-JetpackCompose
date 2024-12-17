package com.example.pagenavigationhw4.ui.screens

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun PageNavigation(selectedPage:String) {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = selectedPage) {
        //first opened page id will be here
        composable("homepage") {
            HomePage(navController = navController)
        }
        composable("pagea") {
            PageA(navController = navController)
        }
        composable("pageb") {
            PageB(navController = navController)
        }
        composable("pagex") {
            PageX(navController = navController)
        }
        composable("pagey") {
            PageY(navController = navController)
        }
    }
}
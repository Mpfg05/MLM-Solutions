package com.example.navegacaosimplesapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.navegacaosimplesapp.ui.theme.NavegacaoSimplesAppTheme
import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NavegacaoSimplesAppTheme {
                val navController = rememberNavController()
                NavHost(navController = navController, startDestination = "main") {
                    composable("main") { TelaPrincipal(navController) }
                    composable("texto") { TelaTexto(navController) }
                    composable("imagem_texto") { TelaImagemTexto(navController) }
                    composable("cadastro") { TelaCadastro(navController) }
                    composable("telaextra") { Telaextra(navController) }
                    composable("vicio") { Telavicio(navController) }
                }
            }
        }
    }
}

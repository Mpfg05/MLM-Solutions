package com.example.navegacaosimplesapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun TelaPrincipal(navController: NavController) {
    Box(modifier = Modifier.fillMaxSize()) {
        // Coloque uma imagem na pasta res/drawable e use o nome dela aqui
        Image(
            painter = painterResource(id = R.drawable.fundo),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(32.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Button(onClick = { navController.navigate("texto") }, modifier = Modifier.fillMaxWidth()) {
                Text("Informações")
            }
            Spacer(modifier = Modifier.height(16.dp))
            Button(onClick = { navController.navigate("imagem_texto") }, modifier = Modifier.fillMaxWidth()) {
                Text("O que somos")
            }
            Spacer(modifier = Modifier.height(16.dp))
            Button(onClick = { navController.navigate("cadastro") }, modifier = Modifier.fillMaxWidth()) {
                Text("Onde encontrar ajuda")
            }
        }
    }
}

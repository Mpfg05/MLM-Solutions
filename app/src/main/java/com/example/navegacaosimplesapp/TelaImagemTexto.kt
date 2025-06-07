package com.example.navegacaosimplesapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.layout.ContentScale
import androidx.navigation.NavController

@Composable
fun TelaImagemTexto(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(10.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    )
    {
        // Mostra a imagem
        Image(
            painter = painterResource(id = R.drawable.imagem), // troque "imagem" pelo nome do seu arquivo de imagem
            contentDescription = "Exemplo de imagem",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .height(300.dp)
                .fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(24.dp))

        // Mostra o texto
        Text(
            text = "Uma organização sem fins lucrativos",
            fontSize = 20.sp
        )
        Spacer(modifier = Modifier.height(52.dp))
        Text(
            text = "Luiz Felipe Vieira Nunes Ribeiro RA : 2401594",
            fontSize = 15.sp
        )
        Text(
            text = "Marcos Paulo Ferreira Garcia RA: 2401765",
            fontSize = 15.sp
        )
        Text(
            text = "Nome: Milene Oliveira de Souza RA: 2401439",
            fontSize = 15.sp
        )

        Spacer(modifier = Modifier.height(52.dp))

        Button(onClick = { navController.navigate("main") }) {
            Text("Voltar à Tela Principal")
        }
    }
}




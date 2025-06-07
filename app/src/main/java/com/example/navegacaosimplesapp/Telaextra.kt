
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
fun Telaextra(navController: NavController) {
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
            painter = painterResource(id = R.drawable.ajuda), // troque "imagem" pelo nome do seu arquivo de imagem
            contentDescription = "Exemplo de imagem",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .height(380.dp)
                .fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(24.dp))

        // Mostra o texto
        Text(
            text = "1 - Centros de Atenção Psicossocial (CAPS)\n" +
                    "especializado em vícios incluindo jogos\n" +
                    "\n" +
                    "2. Hospitais e Clínicas de Saúde Mental\n" +
                    "oferecem tratamento com psicólogos e psiquiatras\n" +
                    "\n" +
                    "3. Grupos de Apoio\n" +
                    "Algumas ONGs e projetos sociais oferecem ajuda gratuita ou de baixo custo.",
            fontSize = 15.sp
        )



        Spacer(modifier = Modifier.height(52.dp))

        Button(onClick = { navController.navigate("main") }) {
            Text("Voltar à Tela Principal")
        }
    }
}





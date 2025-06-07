package com.example.navegacaosimplesapp

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun Telavicio(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(32.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Como Evitar o Vício em Casas de Apostas",
            fontSize = 32.sp
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = "O vício em apostas é um problema sério que pode causar prejuízos financeiros, emocionais e sociais. Para evitar esse problema, é importante estabelecer limites claros. Nunca aposte mais do que pode perder e não tente recuperar prejuízos com novas apostas. Use o tempo livre com atividades saudáveis, como esportes, estudos ou hobbies, e evite usar apostas como forma de lidar com o tédio ou estresse. Fique atento aos sinais de dependência, como mentir sobre apostas ou negligenciar responsabilidades. Se perceber dificuldades para parar, procure ajuda de profissionais ou grupos de apoio. A prevenção é o melhor caminho para manter o controle e proteger sua saúde mental e financeira.",
            fontSize = 18.sp
        )
            Spacer(modifier = Modifier.height(32.dp))
            Button(onClick = { navController.navigate("main") }) {
                Text("Voltar à Tela Principal")
            }
        }
    }
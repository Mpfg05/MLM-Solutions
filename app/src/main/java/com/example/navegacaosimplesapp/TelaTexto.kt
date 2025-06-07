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
fun TelaTexto(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(32.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Os perigos das apostas em casas de aposta\n" +
                    "",
            fontSize = 32.sp
        )
        Text(
            text = "Apostar em casas de aposta pode parecer uma forma inofensiva de diversão, mas esconde sérios riscos. O principal problema é a ilusão de ganho fácil, que leva muitas pessoas a perderem grandes quantias de dinheiro. Com o tempo, o hábito pode virar vício, causando problemas financeiros, emocionais e até familiares. Muitos apostadores entram em dívidas, sofrem com ansiedade e depressão, e se afastam de pessoas próximas. Por isso, é importante ter cuidado e não transformar o jogo em um problema na vida.",
            fontSize = 18.sp
        )
        Spacer(modifier = Modifier.height(32.dp))
        Button(onClick = { navController.navigate("vicio") }) {
            Text("Como evitar o vicio") }
        Spacer(modifier = Modifier.height(32.dp))
        Button(onClick = { navController.navigate("main") }) {
            Text("Voltar à Tela Principal")
        }
    }
}

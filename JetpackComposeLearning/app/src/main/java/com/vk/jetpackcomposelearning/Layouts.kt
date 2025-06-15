package com.vk.jetpackcomposelearning

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun ColumnExample(modifier: Modifier = Modifier) {

//    Column(
//        modifier = Modifier
//            .background(color = Color.Cyan)
//            .fillMaxSize(),
//        horizontalAlignment = Alignment.CenterHorizontally,
//        verticalArrangement = Arrangement.Center
//    ) {
//        Text("Hello")
//        Text("Hi")
//        Button(onClick = {
//
//        }) {
//            Text("Do something")
//        }
//    }


//    Row(
//        modifier = Modifier
//            .background(color = Color.Cyan)
//            .fillMaxSize(),
//        verticalAlignment = Alignment.CenterVertically,
//        horizontalArrangement = Arrangement.Center,
//    ) {
//        Text("Hello")
//        Text("Hi")
//        Button(onClick = {
//
//        }) {
//            Text("Do something")
//        }
//    }


    Box(modifier = Modifier.fillMaxSize()) {
        Image(
            painter = painterResource(R.drawable.compose),
            contentDescription = null,
            Modifier
                .width(100.dp)
                .height(100.dp)
                .align(Alignment.Center)
        )

        Text("Overlay text", modifier = Modifier.align(Alignment.Center))
    }
}


@Composable
@Preview(showSystemUi = true)
fun ColumnPreview() {
    ColumnExample()
}
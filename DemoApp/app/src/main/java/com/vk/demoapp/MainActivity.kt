package com.vk.demoapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    @androidx.compose.runtime.Composable
    fun InputScreen() {
        var text by androidx.compose.runtime.remember { androidx.compose.runtime.mutableStateOf("") }

        androidx.compose.foundation.layout.Column(modifier = androidx.compose.ui.Modifier.padding(16.dp)) {
            androidx.compose.material3.OutlinedTextField(
                value = text,
                onValueChange = { text = it },
                label = { androidx.compose.material3.Text("Enter text") },
                modifier = androidx.compose.ui.Modifier.fillMaxWidth()
            )

            androidx.compose.foundation.layout.Row(modifier = androidx.compose.ui.Modifier.padding(top = 16.dp)) {
                androidx.compose.material3.Button(
                    onClick = { /* Handle first button click */ },
                    modifier = androidx.compose.ui.Modifier.weight(1f)
                ) {
                    androidx.compose.material3.Text("Button 1")
                }

                androidx.compose.foundation.layout.Spacer(modifier = androidx.compose.ui.Modifier.width(16.dp))

                androidx.compose.material3.Button(
                    onClick = { /* Handle second button click */ },
                    modifier = androidx.compose.ui.Modifier.weight(1f)
                ) {
                    androidx.compose.material3.Text("Button 2")
                }
            }
        }
    }

    @Preview(showBackground = true)
    @androidx.compose.runtime.Composable
    fun DefaultPreview() {
        InputScreen()
    }
}

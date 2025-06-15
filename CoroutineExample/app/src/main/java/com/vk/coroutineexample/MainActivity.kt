package com.vk.coroutineexample

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.vk.coroutineexample.databinding.ActivityMainBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.plus
import kotlin.concurrent.thread

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnIncrease.setOnClickListener {
            binding.txtCounter.text = "${binding.txtCounter.text.toString().toInt() + 1}"
        }

        binding.btnDoAction.setOnClickListener {
//            thread(start = true) {
//                executeLongTask()
//            }

            CoroutineScope(Dispatchers.IO).launch {
                Log.d(TAG, "onCreate: 1- ${Thread.currentThread().name}")
            }

            GlobalScope.launch(Dispatchers.Main) {
                Log.d(TAG, "onCreate: 2- ${Thread.currentThread().name}")
            }

            MainScope().launch(Dispatchers.Default) {
                Log.d(TAG, "onCreate: 3- ${Thread.currentThread().name}")
            }
        }
    }

    private fun executeLongTask() {
        for (i in 1..1000000000L) {

        }
    }

    companion object {
        private const val TAG = "MainActivity"
    }
}
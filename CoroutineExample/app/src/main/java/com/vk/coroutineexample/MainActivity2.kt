package com.vk.coroutineexample

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.vk.coroutineexample.databinding.ActivityMain2Binding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.yield

class MainActivity2 : AppCompatActivity() {

    private lateinit var binding: ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        CoroutineScope(Dispatchers.Main).launch {
            task1()
        }
        CoroutineScope(Dispatchers.Main).launch {
            task2()
        }
    }

    private suspend fun task1() {
        Log.d(TAG, "task1: START TASK1")
        yield()
//        delay(1000)
        Log.d(TAG, "task1: END TASK1")
    }

    private suspend fun task2() {
        Log.d(TAG, "task2: START TASK2")
        yield()
        Log.d(TAG, "task2: END TASK2")
    }

    companion object {
        private const val TAG = "MainActivity2"
    }

}
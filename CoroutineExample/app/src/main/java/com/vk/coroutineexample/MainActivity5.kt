package com.vk.coroutineexample

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.plus
import kotlinx.coroutines.withContext

class MainActivity5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)
        GlobalScope.launch {
            executeTask()
        }
    }
//    private fun executeTask() {
//        Log.d(TAG, "Before:")
//        GlobalScope.launch {
//            delay(1000)
//            Log.d(TAG, "Inside:")
//        }
//        Log.d(TAG, "After:")
//    }

        private suspend fun executeTask() {

        Log.d(TAG, "Before:")
        withContext(Dispatchers.IO) {
            delay(1000)
            Log.d(TAG, "Inside:")
        }
        Log.d(TAG, "After:")
    }

    companion object {
        private const val TAG = "MainActivity5"
    }
}
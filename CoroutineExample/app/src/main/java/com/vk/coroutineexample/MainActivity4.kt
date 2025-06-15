package com.vk.coroutineexample

import android.app.PendingIntent.CanceledException
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.coroutines.CancellationException
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.isActive
import kotlinx.coroutines.launch

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        GlobalScope.launch(Dispatchers.Main) {
            execute()
        }
    }

    private suspend fun execute() {
//        val parentJob = GlobalScope.launch(Dispatchers.Main) {
//            Log.d(TAG, "Parent - $coroutineContext")
//
//            Log.d(TAG, "Parent started")
//            val childJob = launch(Dispatchers.IO) {
//                Log.d(TAG, "Child - $coroutineContext")
//                Log.d(TAG, "Child started")
//                delay(5000)
//                Log.d(TAG, "Child ended")
//            }
//            delay(3000)
//            Log.d(TAG, "Parent ended")
//        }
//        parentJob.join()
//        Log.d(TAG, "Parent completed")


//        val parentJob = GlobalScope.launch(Dispatchers.Main) {
//            Log.d(TAG, "Parent - $coroutineContext")
//
//            Log.d(TAG, "Parent started")
//            val childJob = launch(Dispatchers.IO) {
//                Log.d(TAG, "Child - $coroutineContext")
//                Log.d(TAG, "Child started")
//                delay(5000)
//                Log.d(TAG, "Child ended")
//            }
//            delay(3000)
//            Log.d(TAG, "Parent ended")
//        }
//        delay(1000)
//        parentJob.cancel()
//        parentJob.join()
//        Log.d(TAG, "Parent completed")


//        val parentJob = GlobalScope.launch(Dispatchers.Main) {
//            Log.d(TAG, "Parent - $coroutineContext")
//
//            Log.d(TAG, "Parent started")
//            val childJob = launch(Dispatchers.IO) {
//                Log.d(TAG, "Child - $coroutineContext")
//                Log.d(TAG, "Child started")
//                delay(5000)
//                Log.d(TAG, "Child ended")
//            }
//            delay(3000)
//            Log.d(TAG, "Child job cancelled")
//            childJob.cancel()
//            Log.d(TAG, "Parent ended")
//        }
//        parentJob.join()
//        Log.d(TAG, "Parent completed")


//        val parentJob = GlobalScope.launch(Dispatchers.Main) {
//            Log.d(TAG, "Parent - $coroutineContext")
//
//            Log.d(TAG, "Parent started")
//            val childJob = launch(Dispatchers.IO) {
//                try {
//                    Log.d(TAG, "Child - $coroutineContext")
//                    Log.d(TAG, "Child started")
//                    delay(5000)
//                    Log.d(TAG, "Child ended")
//                } catch (e: CancellationException) {
//                    Log.d(TAG, "**** Child job cancelled ****")
//                }
//            }
//            delay(3000)
//            childJob.cancel()
//            Log.d(TAG, "Parent ended")
//        }
//        parentJob.join()
//        Log.d(TAG, "Parent completed")


        val parentJob = CoroutineScope(Dispatchers.IO).launch {
            for (i in 1..1000) {
                if (isActive) {
                    executeLongRunningTask()
                    Log.d(TAG, "$i - iteration done")
                }
            }
        }
        delay(100)
        Log.d(TAG, "Cancelling job")
        parentJob.cancel()
        parentJob.join()
        Log.d(TAG, "Parent completed")
    }

    private fun executeLongRunningTask() {
        for (i in 1..10000000) {

        }
    }

    companion object {
        private const val TAG = "MainActivity4"
    }
}
package com.vk.coroutineexample

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.job
import kotlinx.coroutines.launch

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main3)


        val job = CoroutineScope(Dispatchers.IO).launch {
            printFollowers()
        }


    }

    private suspend fun printFollowers() {
//        var fbFollowers = 0
//        val job = CoroutineScope(Dispatchers.IO).launch {
//            fbFollowers = getFbFollowers()
//        }
//        job.join()
//        Log.d(TAG, "printFollowers: Fb follower: $fbFollowers")


//        val job = CoroutineScope(Dispatchers.IO).async {
//            getFbFollowers()
//        }
//        val fbFollowers = job.await()
//        Log.d(TAG, "printFollowers: Fb follower: $fbFollowers")


//        var fbFollowers = 0
//        var instaFollowers = 0
//        val job = CoroutineScope(Dispatchers.IO).launch {
//            fbFollowers = getFbFollowers()
//        }
//
//        val job2 = CoroutineScope(Dispatchers.IO).launch {
//            instaFollowers = getInstaFollowers()
//        }
//        job.join()
//        job2.join()
//        Log.d(TAG, "printFollowers: Fb follower: $fbFollowers")
//        Log.d(TAG, "printFollowers: Insta follower: $instaFollowers")


//        val fb = CoroutineScope(Dispatchers.IO).async {
//            getFbFollowers()
//        }
//
//        val insta = CoroutineScope(Dispatchers.IO).async {
//            getInstaFollowers()
//        }
//        val fbFollowers = fb.await()
//        val instaFollowers = insta.await()
//        Log.d(TAG, "printFollowers: Fb follower: $fbFollowers")
//        Log.d(TAG, "printFollowers: Insta follower: $instaFollowers")


//        CoroutineScope(Dispatchers.IO).launch {
//            val fb = getFbFollowers()
//            val insta = getInstaFollowers()
//            Log.d(TAG, "FB- $fb Insta- $insta")
//        }


        CoroutineScope(Dispatchers.IO).launch {
            val fb = async { getFbFollowers() }
            val insta = async { getInstaFollowers() }
            Log.d(TAG, "FB- ${fb.await()} Insta- ${insta.await()}")
        }
    }


    private suspend fun getFbFollowers(): Int {
        delay(1000)
        return 96
    }

    private suspend fun getInstaFollowers(): Int {
        delay(1000)
        return 123
    }

    companion object {
        private const val TAG = "MainActivity3"
    }
}
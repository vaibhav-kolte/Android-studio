package com.vk.coroutinescopeexample

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainViewModel : ViewModel() {
    init {
        viewModelScope.launch {
            while (true) {
                delay(500)
                Log.d(Companion.TAG, "Welcome to programming")
            }
        }
    }

    override fun onCleared() {
        super.onCleared()
        Log.d(TAG, "View model destroyed")
    }

    companion object {
        private const val TAG = "MainViewModel"
    }
}
package com.example.jeanjacquesbastien_countriesoftheworld.utils

import java.lang.Exception

sealed class UIState {
    object Loading: UIState()
    class Success <T> (val response : T) :UIState()
    class Error (val exception: Exception): UIState()
}
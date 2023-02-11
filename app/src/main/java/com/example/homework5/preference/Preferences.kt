package com.example.homework5.preference

import android.content.SharedPreferences
import javax.inject.Inject

class Preferences @Inject constructor(var sharedPreferences: SharedPreferences) {
    fun isBoardingShowed(): Boolean {
        return sharedPreferences.getBoolean("board", false)
    }
    fun setBoardingShowed(isShow: Boolean) {
        sharedPreferences.edit().putBoolean("board", isShow).apply()
    }
}
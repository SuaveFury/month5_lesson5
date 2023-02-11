package com.example.homework5.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.homework5.R
import com.example.homework5.databinding.ActivityMainBinding
import com.example.homework5.preference.Preferences
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject
@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    @Inject
   lateinit var preferences: Preferences

    lateinit var binding: ActivityMainBinding
    override fun  onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        if  (!preferences.isBoardingShowed()){
            supportFragmentManager.beginTransaction().add(R.id.container, OnBoardFragment()).commit()
        }else{
            supportFragmentManager.beginTransaction().add(R.id.container, MainFragment()).commit()
        }
        setContentView(binding.root)
    }
}
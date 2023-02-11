package com.example.homework5.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.homework5.databinding.MainFragmentBinding

class MainFragment : Fragment() {
    lateinit var binding: MainFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = MainFragmentBinding.inflate(LayoutInflater.from(context), container, false)
        return binding.root
    }



}
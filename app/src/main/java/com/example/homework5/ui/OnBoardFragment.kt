package com.example.homework5.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.homework5.databinding.FragmentOnBoardBinding

class OnBoardFragment : Fragment() {
    private lateinit var binding: FragmentOnBoardBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentOnBoardBinding.inflate(LayoutInflater.from(context), container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val adapter = BoardAdapter(childFragmentManager)
        binding.vp.adapter = adapter
    }

}
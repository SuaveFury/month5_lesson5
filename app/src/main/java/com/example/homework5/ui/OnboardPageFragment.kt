package com.example.homework5.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import com.example.homework5.R
import com.example.homework5.databinding.FragmentOnboardPageBinding
import com.example.homework5.preference.Preferences
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@Suppress("DEPRECATION")
@AndroidEntryPoint
class OnboardPageFragment() : Fragment() {
    @Inject
    lateinit var preferences: Preferences
    private lateinit var binding: FragmentOnboardPageBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentOnboardPageBinding.inflate(LayoutInflater.from(context), container, false)
        return binding.root

    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewLogic()
        bntLogic()
    }
        private fun bntLogic() {
        binding.start.setOnClickListener {
            preferences.setBoardingShowed(true)
            val newFragment: Fragment = MainFragment()

            requireActivity().supportFragmentManager.beginTransaction().replace(R.id.container, newFragment).commit()
        }
    }


    private fun viewLogic() {
        arguments?.let {
            val data = it.getSerializable("onboard") as BoardModel
            binding.title.text = data.title
            binding.description.text = data.description
            data.img?.let { it1 -> binding.imgBoard.setImageResource(it1) }
            binding.start.isVisible = data.isLast == true
        }
    }
}
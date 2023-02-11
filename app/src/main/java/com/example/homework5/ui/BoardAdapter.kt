@file:Suppress("DEPRECATION")

package com.example.homework5.ui

import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.example.homework5.R

@Suppress("DEPRECATION")
class BoardAdapter(fm: FragmentManager) : FragmentStatePagerAdapter(fm) {

    private val list = arrayOf(
        BoardModel(
            R.drawable.board1,
            "Talabat",
            "Order your first meal now, and get 50% off for all branches", false
        ),
        BoardModel(
            R.drawable.board2,
            "Fast delivery",
            "To deliver any order takes maximum 1 hour", false
        ),
        BoardModel(
            R.drawable.board3,
            "Popular",
            "Our company worldwide popular and standarts are high", true
        )
    )
    override fun getCount(): Int = list.size

    override fun getItem(position: Int): Fragment {
        val data = bundleOf("onboard" to list[position])
        val fragment = OnboardPageFragment()
        fragment.arguments = data
        return fragment
    }


}
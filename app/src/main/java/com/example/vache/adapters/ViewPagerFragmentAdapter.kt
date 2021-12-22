package com.example.vache.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.vache.fragments.FragmentFirst
import com.example.vache.fragments.FragmentSecond
import com.example.vache.fragments.FragmentThird

class ViewPagerFragmentAdapter(activity:FragmentActivity):FragmentStateAdapter(activity) {
    override fun getItemCount() = 3


    override fun createFragment(position: Int): Fragment {
        return when (position){
        0-> FragmentFirst()
        1-> FragmentSecond()
        2-> FragmentThird()
        else->FragmentFirst()
        }
    }}


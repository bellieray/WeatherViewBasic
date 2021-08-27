    package com.example.weatherviewbasic

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.library.baseAdapters.DataBinderMapperImpl
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.example.weatherviewbasic.databinding.FragmentSplashScreenBinding
import com.example.weatherviewbasic.databinding.FragmentWeatherBinding

class SplashScreen : Fragment() {
lateinit var binding: FragmentSplashScreenBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(layoutInflater,R.layout.fragment_splash_screen,container,false)

        binding.buttonSplash.setOnClickListener {
           findNavController().navigate(SplashScreenDirections.actionSplashScreenToWeatherFragment())
        }
        return binding.root

    }


}
package com.example.weatherviewbasic

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.weatherviewbasic.databinding.FragmentWeatherBinding

class WeatherFragment : Fragment() {
    lateinit var binding : FragmentWeatherBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(layoutInflater,R.layout.fragment_weather,container,false)
        val weather = Weather(city = "İstanbul")
        binding.weather = weather
        binding.backButton.setOnClickListener {
           findNavController().navigate(WeatherFragmentDirections.actionWeatherFragmentToSplashScreen())
        }
        return binding.root

     //   return inflater.inflate(R.layout.fragment_weather, container, false)
    }

}
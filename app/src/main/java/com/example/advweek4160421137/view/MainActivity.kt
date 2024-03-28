package com.example.advweek4160421137.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.advweek4160421137.R
import com.example.advweek4160421137.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
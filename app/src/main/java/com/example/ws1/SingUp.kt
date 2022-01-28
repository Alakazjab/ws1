package com.example.ws1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ws1.databinding.ActivitySingUpBinding

class SingUp : AppCompatActivity() {
    private lateinit var binding: ActivitySingUpBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySingUpBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
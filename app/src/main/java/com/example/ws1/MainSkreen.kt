package com.example.ws1

import android.content.res.Resources
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ws1.databinding.ActivityMainSkreenBinding

class MainSkreen : AppCompatActivity() {

    private lateinit var binding: ActivityMainSkreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.Theme_Ws1)
        super.onCreate(savedInstanceState)
        binding = ActivityMainSkreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportFragmentManager.beginTransaction().replace(R.id.fragment_container, main()).commit()

        binding.bottomNavigationView.setOnItemSelectedListener { item->
            when(item.itemId){
                R.id.main ->{
                    supportFragmentManager.beginTransaction().replace(R.id.fragment_container, main()).commit()
                    return@setOnItemSelectedListener true
                }

                R.id.complication ->{
                    supportFragmentManager.beginTransaction().replace(R.id.fragment_container, complication()).commit()
                    return@setOnItemSelectedListener true
                }

                R.id.collectoin ->{
                supportFragmentManager.beginTransaction().replace(R.id.fragment_container, collection()).commit()
                return@setOnItemSelectedListener true
                }

                R.id.profile ->{
                supportFragmentManager.beginTransaction().replace(R.id.fragment_container, Profile()).commit()
                return@setOnItemSelectedListener true
                }
            }
            return@setOnItemSelectedListener false

        }
    }
}
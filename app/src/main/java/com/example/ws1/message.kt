package com.example.ws1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.ws1.databinding.FragmentMessageBinding

class message : Fragment() {

    private lateinit var binding: FragmentMessageBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMessageBinding.inflate(inflater,container,false)

        binding.back.setOnClickListener {
            parentFragmentManager.beginTransaction().replace(R.id.fragment_container, Profile()).commit()

        }

        return binding.root
    }
}
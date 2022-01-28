package com.example.ws1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.ws1.databinding.FragmentCollectionBinding
import com.example.ws1.databinding.FragmentMessageBinding

class collection : Fragment() {

    private lateinit var binding: FragmentCollectionBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCollectionBinding.inflate(inflater,container,false)

        binding.add.setOnClickListener {
            parentFragmentManager.beginTransaction().replace(R.id.fragment_container, create_collectoin()).commit()

        }

        return binding.root
    }
}
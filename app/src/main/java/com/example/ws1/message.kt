package com.example.ws1

import android.graphics.Color
import android.os.Bundle
import android.text.SpannableString
import android.text.Spanned
import android.text.style.ForegroundColorSpan
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.ws1.databinding.FragmentMessageBinding


class message : Fragment() {

    private lateinit var binding: FragmentMessageBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMessageBinding.inflate(inflater,container,false)

        val s = "Иван: Смотрели уже последнюю серию? Я просто поверить не могу в..."
        val ss = SpannableString(s)
        ss.setSpan(
            ForegroundColorSpan(Color.GRAY),
            0,
            5,
            Spanned.SPAN_EXCLUSIVE_INCLUSIVE
        ) // устанавливаем цвет слову Hello
        binding.m1.text = ss
        binding.m2.text = ss
        binding.m3.text = ss
        binding.m4.text = ss

        binding.back.setOnClickListener {
            parentFragmentManager.beginTransaction().replace(R.id.fragment_container, Profile()).commit()
        }

        return binding.root
    }
}
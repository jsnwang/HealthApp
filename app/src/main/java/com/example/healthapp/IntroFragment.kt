package com.example.healthapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.example.healthapp.databinding.FragmentIntroBinding

class IntroFragment : Fragment() {

    private var _binding : FragmentIntroBinding ?= null
    private val binding get() = _binding!!
    //private val viewModel by viewModels<MovieViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        super.onCreateView(inflater, container, savedInstanceState)

        _binding = FragmentIntroBinding.inflate(inflater, container, false)

        initObservers()
        return binding.root
    }

    private fun initObservers() {
        binding.btnStart.setOnClickListener{
            findNavController().navigate(com.example.healthapp.R.id.initialFormFragment)
        }
    }


}

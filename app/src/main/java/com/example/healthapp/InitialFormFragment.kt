package com.example.healthapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.healthapp.databinding.FragmentInitialFormBinding

class InitialFormFragment : Fragment() {


    private var _binding : FragmentInitialFormBinding?= null
    private val binding get() = _binding!!
    //private val viewModel by viewModels<MovieViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        super.onCreateView(inflater, container, savedInstanceState)

        _binding = FragmentInitialFormBinding.inflate(inflater, container, false)

        initObservers()

        return binding.root
    }

    private fun initObservers() {
        binding.btnCreate.setOnClickListener{
            findNavController().navigate(com.example.healthapp.R.id.healthyPlanFragment)
        }
    }
}
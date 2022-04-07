package com.example.healthapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.healthapp.databinding.FragmentHealthyPlanBinding

class HealthyPlanFragment : Fragment() {

    private var _binding : FragmentHealthyPlanBinding? = null
    private val binding get() = _binding!!
    //private val viewModel by viewModels<MovieViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        super.onCreateView(inflater, container, savedInstanceState)

        _binding = FragmentHealthyPlanBinding.inflate(inflater, container, false)

        return binding.root
    }
}
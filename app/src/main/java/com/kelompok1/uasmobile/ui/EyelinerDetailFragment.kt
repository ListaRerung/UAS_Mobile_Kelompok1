package com.kelompok1.uasmobile.ui

import android.os.Bundle
import com.kelompok1.uasmobile.databinding.FragmentEyelinerDetailBinding
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels

class EyelinerDetailFragment : Fragment() {
    private val viewModel: MakeUpViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentEyelinerDetailBinding.inflate(inflater)
        binding.lifecycleOwner = this
        binding.viewModelEyeliner = viewModel
        return binding.root
    }
}
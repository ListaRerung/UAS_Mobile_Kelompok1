package com.kelompok1.uasmobile.ui.eyebrow

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.kelompok1.uasmobile.databinding.FragmentEyebrowDetailBinding
import com.kelompok1.uasmobile.ui.MakeUpViewModel

class EyebrowDetailFragment : Fragment() {
    private val viewModel: MakeUpViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentEyebrowDetailBinding.inflate(inflater)
        binding.lifecycleOwner = this
        binding.viewModelEyebrow = viewModel
        return binding.root
    }
}

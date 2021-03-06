package com.kelompok1.uasmobile.ui.eyeshadow

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.kelompok1.uasmobile.databinding.FragmentEyeshadowListBinding
import com.kelompok1.uasmobile.R
import com.kelompok1.uasmobile.ui.eyeshadow.EyeshadowListAdapter
import com.kelompok1.uasmobile.ui.eyeshadow.EyeshadowListener
import com.kelompok1.uasmobile.ui.MakeUpViewModel

class EyeshadowListFragment : Fragment() {
    private val MakeUpViewModel: MakeUpViewModel by activityViewModels()
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentEyeshadowListBinding.inflate(inflater)
        MakeUpViewModel.getDataEyeshadow()
        binding.lifecycleOwner = this
        binding.dataEyeshadow = MakeUpViewModel
        binding.recyclerView.adapter = EyeshadowListAdapter(EyeshadowListener { eyeshadow ->
            MakeUpViewModel.onEyeshadowClicked(eyeshadow)
            findNavController()
                .navigate(R.id.action_eyeshadowListFragment_to_eyeshadowDetailFragment)
        })
        return binding.root
    }
}
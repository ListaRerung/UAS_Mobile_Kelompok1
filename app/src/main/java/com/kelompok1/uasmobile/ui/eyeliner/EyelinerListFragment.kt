package com.kelompok1.uasmobile.ui.eyeliner

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.kelompok1.uasmobile.R
import com.kelompok1.uasmobile.databinding.FragmentEyelinerListBinding
import com.kelompok1.uasmobile.ui.eyeliner.EyelinerListAdapter
import com.kelompok1.uasmobile.ui.eyeliner.EyelinerListener
import com.kelompok1.uasmobile.ui.MakeUpViewModel

class EyelinerListFragment : Fragment() {
    private val MakeUpViewModel: MakeUpViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentEyelinerListBinding.inflate(inflater)
        MakeUpViewModel.getDataEyeliner()
        binding.lifecycleOwner = this
        binding.dataeyeliner = MakeUpViewModel
        binding.recyclerView.adapter = EyelinerListAdapter(EyelinerListener { eyeliner ->
            MakeUpViewModel.onEyelinerClicked(eyeliner)
            findNavController()
                .navigate(R.id.action_eyelinerListFragment_to_eyelinerDetailFragment)
        })
        return binding.root
    }
}
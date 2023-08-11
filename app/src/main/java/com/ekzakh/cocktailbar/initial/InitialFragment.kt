package com.ekzakh.cocktailbar.initial

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import com.ekzakh.cocktailbar.R
import com.ekzakh.cocktailbar.databinding.FragmentInitialBinding

class InitialFragment : Fragment(R.layout.fragment_initial) {
    private var _binding: FragmentInitialBinding? = null
    private val binding get() = _binding!!

    private val viewModel by viewModels<InitialViewModel.Base>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentInitialBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.init()
        binding.createCocktailButton.setOnClickListener {
            requireActivity().findNavController(R.id.container)
                .navigate(R.id.action_initialFragment_to_createCocktailFragment)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}

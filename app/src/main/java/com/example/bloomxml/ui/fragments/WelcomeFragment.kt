package com.example.bloomxml.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.bloomxml.R
import com.example.bloomxml.databinding.FragmentWelcomeBinding
import com.example.bloomxml.util.isDarkThemeOn

class WelcomeFragment : Fragment() {

    private lateinit var binding: FragmentWelcomeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentWelcomeBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupWelcomeBg()
        setupLoginButton()
    }

    private fun setupWelcomeBg() {
        binding.apply {
            if (requireContext().isDarkThemeOn()) {
                welcomeBg.setImageResource(R.drawable.dark_welcome_bg)
                welcomeIllos.setImageResource(R.drawable.dark_welcome_illos)
                bloomLogo.setImageResource(R.drawable.dark_logo)
            } else {
                welcomeBg.setImageResource(R.drawable.light_welcome_bg)
                welcomeIllos.setImageResource(R.drawable.light_welcome_illos)
                bloomLogo.setImageResource(R.drawable.light_logo)
            }
        }
    }

    private fun setupLoginButton() {
        binding.buttonLogIn.setOnClickListener {
            findNavController().navigate(R.id.action_welcomeFragment_to_loginFragment)
        }
    }
}
package com.sudoku

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController

class LaunchScreen : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_launch_screen, container, false)
        val playButton = view.findViewById<Button>(R.id.play)
        playButton.setOnClickListener {
            view.findNavController().navigate(R.id.action_launchScreen_to_difficultyFragment)
        }
        val aboutButton = view.findViewById<Button>(R.id.about_button)
        aboutButton.setOnClickListener {
            view.findNavController().navigate(R.id.action_launchScreen_to_aboutFragment)
        }
        val solveButton = view.findViewById<Button>(R.id.solver)
        solveButton.setOnClickListener {
            view.findNavController().navigate(R.id.action_launchScreen_to_solverFragment)
        }
        return view
    }
}
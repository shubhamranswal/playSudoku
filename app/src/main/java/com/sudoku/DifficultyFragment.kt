package com.sudoku

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController

class DifficultyFragment : Fragment() {

    lateinit var comm: Communicator

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.fragment_difficulty, container, false)

        val easyButton: Button = view.findViewById(R.id.easybutton)
        val mediumButton: Button = view.findViewById(R.id.mediumbutton)
        val hardButton: Button = view.findViewById(R.id.hardbutton)

        comm = activity as Communicator

        easyButton.setOnClickListener {
            comm.passDataCom("easy")
            view.findNavController().navigate(R.id.action_difficultyFragment_to_playScreen)
        }
        mediumButton.setOnClickListener {
            comm.passDataCom("medium")
            view.findNavController().navigate(R.id.action_difficultyFragment_to_playScreen)
        }
        hardButton.setOnClickListener {
            comm.passDataCom("hard")
            view.findNavController().navigate(R.id.action_difficultyFragment_to_playScreen)
        }
        return view
    }

}
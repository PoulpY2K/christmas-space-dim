package com.dim.spacedim

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.dim.spacedim.databinding.FragmentGameBinding

class GameFragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("GameFragment", "onCreate called")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentGameBinding>(
            inflater, R.layout.fragment_game, container, false)

        binding.gameWin.setOnClickListener { view : View ->
            view.findNavController().navigate(R.id.action_gameFragment_to_winFragment)
        }

        binding.gameLose.setOnClickListener { view : View ->
            view.findNavController().navigate(R.id.action_gameFragment_to_loseFragment)
        }

        setHasOptionsMenu(true)

        return binding.root
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.i("GameFragment", "onAttach called")
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.i("GameFragment", "onViewCreated called")
    }

    override fun onStart() {
        super.onStart()
        Log.i("GameFragment", "onStart called")
    }
    override fun onResume() {
        super.onResume()
        Log.i("GameFragment", "onResume called")
    }
    override fun onPause() {
        super.onPause()
        Log.i("GameFragment", "onPause called")
    }
    override fun onStop() {
        super.onStop()
        Log.i("GameFragment", "onStop called")
    }
    override fun onDestroyView() {
        super.onDestroyView()
        Log.i("GameFragment", "onDestroyView called")
    }
    override fun onDetach() {
        super.onDetach()
        Log.i("GameFragment", "onDetach called")
    }
}
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
import com.dim.spacedim.databinding.FragmentLoseBinding

class LoseFragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("LoseFragment", "onCreate called")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentLoseBinding>(
            inflater, R.layout.fragment_lose, container, false)

        binding.loseRetry.setOnClickListener { view : View ->
            view.findNavController().navigate(R.id.action_loseFragment_to_homeFragment)
        }

        setHasOptionsMenu(true)

        return binding.root
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.i("LoseFragment", "onAttach called")
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.i("LoseFragment", "onViewCreated called")
    }

    override fun onStart() {
        super.onStart()
        Log.i("LoseFragment", "onStart called")
    }
    override fun onResume() {
        super.onResume()
        Log.i("LoseFragment", "onResume called")
    }
    override fun onPause() {
        super.onPause()
        Log.i("LoseFragment", "onPause called")
    }
    override fun onStop() {
        super.onStop()
        Log.i("LoseFragment", "onStop called")
    }
    override fun onDestroyView() {
        super.onDestroyView()
        Log.i("LoseFragment", "onDestroyView called")
    }
    override fun onDetach() {
        super.onDetach()
        Log.i("LoseFragment", "onDetach called")
    }
}
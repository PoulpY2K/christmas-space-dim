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
import com.dim.spacedim.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("HomeFragment", "onCreate called")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentHomeBinding>(
            inflater, R.layout.fragment_home, container, false)

        binding.goButton.setOnClickListener { view : View ->
            view.findNavController().navigate(R.id.action_homeFragment_to_waitingEmptyRoomFragment)
        }

        setHasOptionsMenu(true)

        return binding.root
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.i("HomeFragment", "onAttach called")
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.i("HomeFragment", "onViewCreated called")
    }

    override fun onStart() {
        super.onStart()
        Log.i("HomeFragment", "onStart called")
    }
    override fun onResume() {
        super.onResume()
        Log.i("HomeFragment", "onResume called")
    }
    override fun onPause() {
        super.onPause()
        Log.i("HomeFragment", "onPause called")
    }
    override fun onStop() {
        super.onStop()
        Log.i("HomeFragment", "onStop called")
    }
    override fun onDestroyView() {
        super.onDestroyView()
        Log.i("HomeFragment", "onDestroyView called")
    }
    override fun onDetach() {
        super.onDetach()
        Log.i("HomeFragment", "onDetach called")
    }
}
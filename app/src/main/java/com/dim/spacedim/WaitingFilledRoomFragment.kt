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
import com.dim.spacedim.databinding.FragmentWaitingFilledRoomBinding

class WaitingFilledRoomFragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("WaitFilRoFragment", "onCreate called")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentWaitingFilledRoomBinding>(
            inflater, R.layout.fragment_waiting_filled_room, container, false)

        binding.readyGameButton.setOnClickListener { view : View ->
            view.findNavController().navigate(R.id.action_waitingFilledRoomFragment_to_gameFragment)
        }

        setHasOptionsMenu(true)

        return binding.root
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.i("WaitFilRoFragment", "onAttach called")
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.i("WaitFilRoFragment", "onViewCreated called")
    }

    override fun onStart() {
        super.onStart()
        Log.i("WaitFilRoFragment", "onStart called")
    }
    override fun onResume() {
        super.onResume()
        Log.i("WaitFilRoFragment", "onResume called")
    }
    override fun onPause() {
        super.onPause()
        Log.i("WaitFilRoFragment", "onPause called")
    }
    override fun onStop() {
        super.onStop()
        Log.i("WaitFilRoFragment", "onStop called")
    }
    override fun onDestroyView() {
        super.onDestroyView()
        Log.i("WaitFilRoFragment", "onDestroyView called")
    }
    override fun onDetach() {
        super.onDetach()
        Log.i("WaitFilRoFragment", "onDetach called")
    }
}
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
import com.dim.spacedim.databinding.FragmentWaitingEmptyRoomBinding

class WaitingEmptyRoomFragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("WaitEmpRoFragment", "onCreate called")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentWaitingEmptyRoomBinding>(
            inflater, R.layout.fragment_waiting_empty_room, container, false)

        binding.joinGameButton.setOnClickListener { view : View ->
            view.findNavController().navigate(R.id.action_waitingEmptyRoomFragment_to_waitingFilledRoomFragment)
        }

        setHasOptionsMenu(true)

        return binding.root
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.i("WaitEmpRoFragment", "onAttach called")
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.i("WaitEmpRoFragment", "onViewCreated called")
    }

    override fun onStart() {
        super.onStart()
        Log.i("WaitEmpRoFragment", "onStart called")
    }
    override fun onResume() {
        super.onResume()
        Log.i("WaitEmpRoFragment", "onResume called")
    }
    override fun onPause() {
        super.onPause()
        Log.i("WaitEmpRoFragment", "onPause called")
    }
    override fun onStop() {
        super.onStop()
        Log.i("WaitEmpRoFragment", "onStop called")
    }
    override fun onDestroyView() {
        super.onDestroyView()
        Log.i("WaitEmpRoFragment", "onDestroyView called")
    }
    override fun onDetach() {
        super.onDetach()
        Log.i("WaitEmpRoFragment", "onDetach called")
    }
}
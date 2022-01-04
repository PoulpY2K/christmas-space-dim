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
import com.dim.spacedim.databinding.FragmentWinBinding

class WinFragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("WinFragment", "onCreate called")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentWinBinding>(
            inflater, R.layout.fragment_win, container, false)

        binding.winRetry.setOnClickListener { view : View ->
            view.findNavController().navigate(R.id.action_winFragment_to_homeFragment)
        }

        setHasOptionsMenu(true)

        return binding.root
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.i("WinFragment", "onAttach called")
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.i("WinFragment", "onViewCreated called")
    }

    override fun onStart() {
        super.onStart()
        Log.i("WinFragment", "onStart called")
    }
    override fun onResume() {
        super.onResume()
        Log.i("WinFragment", "onResume called")
    }
    override fun onPause() {
        super.onPause()
        Log.i("WinFragment", "onPause called")
    }
    override fun onStop() {
        super.onStop()
        Log.i("WinFragment", "onStop called")
    }
    override fun onDestroyView() {
        super.onDestroyView()
        Log.i("WinFragment", "onDestroyView called")
    }
    override fun onDetach() {
        super.onDetach()
        Log.i("WinFragment", "onDetach called")
    }
}
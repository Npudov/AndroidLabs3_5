package com.example.androidlabs3_5

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController

class SecondFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView =  inflater.inflate(R.layout.fragment_second, container, false)

        rootView.findViewById<Button>(R.id.to_first_fragment).setOnClickListener {
            findNavController().navigate(R.id.action_secondFragment_to_firstFragment)
        }

        rootView.findViewById<Button>(R.id.to_third_fragment).setOnClickListener {
            findNavController().navigate(R.id.action_secondFragment_to_thirdFragment)
        }
        return rootView
    }
}
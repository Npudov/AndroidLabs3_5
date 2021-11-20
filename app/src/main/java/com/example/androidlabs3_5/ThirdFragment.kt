package com.example.androidlabs3_5

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController


class ThirdFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView =  inflater.inflate(R.layout.fragment_third, container, false)

        rootView.findViewById<Button>(R.id.bnToFirst).setOnClickListener {
            findNavController().navigate(R.id.action_thirdFragment_to_firstFragment)
        }

        rootView.findViewById<Button>(R.id.bnToSecond).setOnClickListener {
            findNavController().navigate(R.id.action_thirdFragment_to_secondFragment)
        }
        return rootView
    }
}
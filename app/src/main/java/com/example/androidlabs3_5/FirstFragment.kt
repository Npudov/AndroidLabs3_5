package com.example.androidlabs3_5

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController


class FirstFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView =  inflater.inflate(R.layout.fragment_first, container, false)

        rootView.findViewById<Button>(R.id.bnToSecond).setOnClickListener {
            findNavController().navigate(R.id.action_firstFragment_to_secondFragment)
        }
        return rootView
    }
}
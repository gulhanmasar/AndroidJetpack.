package com.gulhan.fragmentexercise

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView


class BirinciFragment : Fragment() {

    lateinit var textView: TextView
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment

        val view = inflater.inflate(R.layout.fragment_birinci, container, false)
        val someInt = requireArguments().getInt("some_int")
        //Test
        Log.e("Debug",someInt.toString())

        textView = view.findViewById(R.id.textView)
        textView.text = "Alınan değer = ${someInt + 5}"

        return view
    }

}
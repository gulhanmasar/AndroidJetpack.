package com.example.navigationcomponentexercise

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.example.navigationcomponentexercise.databinding.FragmentDetayBinding


class DetayFragment : Fragment() {
    private lateinit var binding: FragmentDetayBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding=FragmentDetayBinding.inflate(inflater, container, false)

        val bundle:DetayFragmentArgs by navArgs()
        val rehberKisi=bundle.rehberKisi

        binding.tVisimDetay.text = rehberKisi.isim
        binding.tVsoyisimDetay.text =rehberKisi.soyisim
        binding.tVnumaraDetay.text=rehberKisi.numara

        return binding.root
    }


}
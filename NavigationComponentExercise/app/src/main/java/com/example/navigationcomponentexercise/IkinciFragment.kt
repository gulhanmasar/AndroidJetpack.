package com.example.navigationcomponentexercise

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.example.navigationcomponentexercise.databinding.FragmentIkinciBinding


class IkinciFragment : Fragment() {

    private lateinit var binding: FragmentIkinciBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentIkinciBinding.inflate(inflater, container, false)


        val bundle: IkinciFragmentArgs by navArgs()
        val gelenKisi = bundle.kisi

        binding.tVgelenIsim.text = gelenKisi.isim
        binding.tVyas.text = gelenKisi.yas.toString()
        binding.tVBoy.text = gelenKisi.boy.toString()


            return binding.root
    }

}
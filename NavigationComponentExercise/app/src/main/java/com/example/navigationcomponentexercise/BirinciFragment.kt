package com.example.navigationcomponentexercise

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.Navigation
import com.example.navigationcomponentexercise.databinding.FragmentBirinciBinding


class BirinciFragment : Fragment() {


    private lateinit var binding: FragmentBirinciBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentBirinciBinding.inflate(inflater,container,false)



        binding.buttonGecis.setOnClickListener {
            val isim = binding.eTisim.text
            val yas = binding.eTyas.text
            val boy = binding.eTBoy.text

            val kisi = Kisi(isim.toString(),boy.toString(),yas.toString())

            val navigate = BirinciFragmentDirections.birinciToIkinci(kisi)
            Navigation.findNavController(it).navigate(navigate)
        }

        return binding.root
    }


}
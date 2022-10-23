package com.example.navigationcomponentexercise

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.navigationcomponentexercise.databinding.FragmentListBinding


class ListFragment : Fragment() {

    private lateinit var binding: FragmentListBinding
    private lateinit var adapter: RecyclerViewAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentListBinding.inflate(inflater,container,false)
       val rehberListesi : MutableList<RehberKisi> = ArrayList()
        rehberListesi.add(RehberKisi("ali ","poyraz","233554465"))
        rehberListesi.add(RehberKisi("ali ","poyraz","233554465"))
        rehberListesi.add(RehberKisi("ali ","poyraz","233554465"))
        rehberListesi.add(RehberKisi("gulhan ","poyraz","233554465"))
        rehberListesi.add(RehberKisi("beyza ","poyraz","233554465"))
        rehberListesi.add(RehberKisi("ali ","poyraz","233554465"))
        rehberListesi.add(RehberKisi("ali ","poyraz","233554465"))
        rehberListesi.add(RehberKisi("ali ","poyraz","233554465"))

        binding.rvListe.layoutManager = StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL)

        adapter = RecyclerViewAdapter(requireContext(),rehberListesi)
       binding.rvListe.adapter = adapter

        return binding.root
    }

}
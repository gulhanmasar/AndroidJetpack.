package com.example.navigationcomponentexercise

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.example.navigationcomponentexercise.databinding.CardKisiBinding

class RecyclerViewAdapter (
    var mContext: Context,
    var rehberListesi : List<RehberKisi>
        ):RecyclerView.Adapter<RecyclerViewAdapter.CardDesignAttachment>(){

    inner class CardDesignAttachment(binding:CardKisiBinding):
            RecyclerView.ViewHolder(binding.root){
                var binding:CardKisiBinding
                init {
                    this.binding=binding
                }
            }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardDesignAttachment {
       val layoutInflater = LayoutInflater.from(mContext)
        val binding:CardKisiBinding=CardKisiBinding.inflate(layoutInflater,parent,false)
        return CardDesignAttachment(binding)
    }

    override fun onBindViewHolder(holder: CardDesignAttachment, position: Int) {
       val rehberKisi =rehberListesi.get(position)
       val binding = holder.binding

       binding.tVisim.text = rehberKisi.isim
       binding.tVSoyisim.text = rehberKisi.soyisim
       binding.tVTelefon.text =rehberKisi.numara

        binding.cardKisi.setOnClickListener{
            val navigate =ListFragmentDirections.listToDetay(rehberKisi)
            Navigation.findNavController(it).navigate(navigate)

        }


    }

    override fun getItemCount(): Int {
       return  rehberListesi.size
    }
}
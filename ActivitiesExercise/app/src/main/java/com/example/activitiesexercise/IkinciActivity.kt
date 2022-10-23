package com.example.activitiesexercise

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.activitiesexercise.databinding.ActivityIkinciBinding

class IkinciActivity : AppCompatActivity() {

    private lateinit var binding: ActivityIkinciBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityIkinciBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val bundle = intent.extras
        if(bundle != null){
            binding.textView.text = "id = ${bundle.getString("id")}"
            binding.textViewBoy.text = bundle.getString("boy")
            binding.textViewYas.text = bundle.getInt("yas").toString()
        }

        binding.buttonGeriGit.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
            finish()
        }



    }
}
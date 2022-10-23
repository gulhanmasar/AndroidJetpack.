package com.example.activitiesexercise

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.activitiesexercise.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        // Binding kurulumu tamamlandi

        binding.button.setOnClickListener {
            val bundle = Bundle()
            bundle.putString("id","12345")
            bundle.putString("boy","1.79")
            bundle.putInt("yas",26)

            val intent = Intent(this,IkinciActivity::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
            finish()
        }

    }
}
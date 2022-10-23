package com.gulhan.fragmentexercise

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.os.bundleOf
import androidx.fragment.app.add
import androidx.fragment.app.commit

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bundle = bundleOf("some_int" to 0)
        supportFragmentManager.commit {
            setReorderingAllowed(true)
            add<BirinciFragment>(R.id.fragmentContainerViewBirinci, args = bundle)
        }


    }
}
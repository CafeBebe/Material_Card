package com.example.materialcard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.materialcard.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var binding: ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        binding?.containedIconButton?.setOnClickListener(View.OnClickListener {
            binding?.badBoys?.text = "Hello"
        }
        )
        binding?.card?.setOnClickListener {
            binding?.card?.isChecked = !binding?.card?.isChecked!!
            true
        }

    }
}
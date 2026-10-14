package com.example.testcode

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.testcode.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.Name.text = "Giày Thể Thao Nam"
        binding.Price.text = "500.000"

        binding.btnUpdatePrice.setOnClickListener {
            var newPrice = binding.editPrice.text.toString().trim()
            if (newPrice.isNotEmpty()) {
                binding.Price.text = "$newPrice Price"
                binding.editPrice.text?.clear()
            }
        }
    }
}
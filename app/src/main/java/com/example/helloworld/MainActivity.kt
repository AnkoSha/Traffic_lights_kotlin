package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.graphics.Color
import androidx.core.content.ContextCompat
import com.example.helloworld.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.redButton.setOnClickListener {
            binding.textView.text = "Красный"
            binding.rootLayout.setBackgroundColor(resources.getColor(R.color.redColor, null))
        }
        binding.yellowButton.setOnClickListener {
            binding.textView.setText(R.string.yellow)
            binding.rootLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.yellowColor))
        }
        binding.greenButton.setOnClickListener {
            binding.textView.text = resources.getText(R.string.green)
            binding.rootLayout.setBackgroundColor(Color.GREEN)
        }
}
}
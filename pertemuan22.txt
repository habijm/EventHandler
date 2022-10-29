package com.example.pertemuan2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pertemuan2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    var scoreA = 0
    var scoreB = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonPlusA.setOnClickListener {
            scoreA = scoreA + 1
            binding.tvSkorA.text = scoreA.toString()
        }

        binding.buttonMinA.setOnClickListener {
            if (scoreA>0)
            scoreA = scoreA - 1
            binding.tvSkorA.text = scoreA.toString()
        }

        binding.buttonPlusB.setOnClickListener {
            scoreB = scoreB + 1
            binding.tvSkorB.text = scoreB.toString()
        }

        binding.buttonMinB.setOnClickListener {
            if (scoreB>0)
            scoreB = scoreB - 1
            binding.tvSkorB.text = scoreB.toString()
        }

        binding.buttonReset.setOnClickListener {
            scoreA = 0
            scoreB = 0
            binding.tvSkorA.text = scoreA.toString()
            binding.tvSkorB.text = scoreB.toString()
        }
    }
}
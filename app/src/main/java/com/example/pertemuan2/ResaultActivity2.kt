package com.example.pertemuan2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.pertemuan2.databinding.ActivityMainBinding
import com.example.pertemuan2.databinding.ActivityResault2Binding

class ResaultActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityResault2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResault2Binding.inflate(layoutInflater)

        setContentView(binding.root)
    }
}
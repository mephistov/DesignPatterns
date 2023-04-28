package com.testnicolas.designpaterns.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.bumptech.glide.Glide
import com.testnicolas.designpaterns.R
import com.testnicolas.designpaterns.databinding.ActivityFactoryPatternBinding
import com.testnicolas.designpaterns.databinding.ActivityMainBinding
import com.testnicolas.designpaterns.viewmodels.FactoryViewModel
import com.testnicolas.designpaterns.viewmodels.MainViewModel

class FactoryPatternActivity : AppCompatActivity() {

    private val viewModel: FactoryViewModel by viewModels()
    private lateinit var binding: ActivityFactoryPatternBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFactoryPatternBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            viewModel.createHorse()
        }
        binding.button3.setOnClickListener {
            viewModel.createDog()
        }


        viewModel.animalPicture.observe(this){
            Glide
                .with(baseContext)
                .load(it)
                .placeholder(R.drawable.ic_launcher_background)
                .into(binding.imageView)
        }


    }
}
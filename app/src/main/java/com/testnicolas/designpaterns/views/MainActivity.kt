package com.testnicolas.designpaterns.views

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.testnicolas.designpaterns.R
import com.testnicolas.designpaterns.databinding.ActivityListAdapterBinding
import com.testnicolas.designpaterns.databinding.ActivityMainBinding
import com.testnicolas.designpaterns.viewmodels.MainViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupObservers()
        setupListeners()
    }

    fun setupListeners(){
        binding.buttonAdapter.setOnClickListener {
            startActivity(Intent(this,ListAdapterActivity::class.java))
        }
    }

    fun setupObservers(){
        viewModel.nameButtonAdapter.observe(this){
            //TODO: update UI when nameButtonAdapter change
        }
    }


}
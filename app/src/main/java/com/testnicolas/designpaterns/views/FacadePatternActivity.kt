package com.testnicolas.designpaterns.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.activity.viewModels
import com.testnicolas.designpaterns.R
import com.testnicolas.designpaterns.databinding.ActivityFacadePatternBinding
import com.testnicolas.designpaterns.databinding.ActivityFactoryPatternBinding
import com.testnicolas.designpaterns.viewmodels.FacadePatterViewModel
import com.testnicolas.designpaterns.viewmodels.FactoryViewModel

class FacadePatternActivity : AppCompatActivity() {

    private val viewModel: FacadePatterViewModel by viewModels()
    private lateinit var binding: ActivityFacadePatternBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFacadePatternBinding.inflate(layoutInflater)
        setContentView(binding.root)


        viewModel.responseFacade.observe(this){
            val text = TextView(this)
            text.setText(it)
            binding.respondKitchenLayout.addView(text)

        }

        binding.button4.setOnClickListener {
            viewModel.orderFood("1")
        }
    }
}
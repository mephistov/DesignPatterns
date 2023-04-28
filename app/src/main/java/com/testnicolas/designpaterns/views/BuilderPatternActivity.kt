package com.testnicolas.designpaterns.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.testnicolas.designpaterns.R
import com.testnicolas.designpaterns.databinding.ActivityBuilderPatternBinding
import com.testnicolas.designpaterns.databinding.ActivityMainBinding
import com.testnicolas.designpaterns.models.UserInfo
import com.testnicolas.designpaterns.viewmodels.BuilderPatternViewModel
import com.testnicolas.designpaterns.viewmodels.MainViewModel
import com.testnicolas.designpaterns.views.adapters.UserAdapter
import com.testnicolas.designpaterns.views.adapters.interfaze.RecyclerViewOnItemClickListener

class BuilderPatternActivity : AppCompatActivity(), RecyclerViewOnItemClickListener<UserInfo> {

    private lateinit var binding: ActivityBuilderPatternBinding
    private val viewModel: BuilderPatternViewModel by viewModels()
    private lateinit var  adapter: UserAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBuilderPatternBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel.listPersonShow.observe(this){
            if(it.isNotEmpty()) {
                adapter = UserAdapter(this,baseContext)
                adapter.listUsers = it
                binding.personListView.adapter = adapter
                binding.personListView.layoutManager = LinearLayoutManager(baseContext)
            }
        }

        binding.buttonAddPerson.setOnClickListener {
            viewModel.createPerson(binding.editTextTextPersonName.text.toString(),
            binding.editTextTextEmailAddress.text.toString())
        }

    }

    override fun onClick(model: UserInfo) {
       //TODO do something
    }
}
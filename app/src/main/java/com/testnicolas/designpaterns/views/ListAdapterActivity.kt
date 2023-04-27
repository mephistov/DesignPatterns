package com.testnicolas.designpaterns.views

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.testnicolas.designpaterns.R
import com.testnicolas.designpaterns.databinding.ActivityListAdapterBinding
import com.testnicolas.designpaterns.models.UserInfo
import com.testnicolas.designpaterns.viewmodels.ListAdapterViewModel
import com.testnicolas.designpaterns.viewmodels.MainViewModel
import com.testnicolas.designpaterns.views.adapters.UserAdapter
import com.testnicolas.designpaterns.views.adapters.interfaze.RecyclerViewOnItemClickListener
import java.security.AccessController.getContext

class ListAdapterActivity : AppCompatActivity(), RecyclerViewOnItemClickListener<UserInfo> {

    private lateinit var binding: ActivityListAdapterBinding
    private val viewModel: ListAdapterViewModel by viewModels()
    private lateinit var  adapter: UserAdapter
    private lateinit var mContext: Context

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityListAdapterBinding.inflate(layoutInflater)
        setContentView(binding.root)
        mContext = baseContext
        setupObservers()
    }

    fun setupObservers(){
        viewModel.listUsers.observe(this){
          if(it.isNotEmpty()) {
              adapter = UserAdapter(this,mContext)
              adapter.listUsers = it
              binding.listUsers.adapter = adapter
              binding.listUsers.layoutManager = LinearLayoutManager(mContext)
          }
        }
    }

    override fun onClick(model: UserInfo) {
        Toast.makeText(mContext,"Pressed row",Toast.LENGTH_LONG).show()
    }
}
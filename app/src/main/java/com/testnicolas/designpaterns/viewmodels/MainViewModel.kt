package com.testnicolas.designpaterns.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.testnicolas.designpaterns.models.UserInfo

class MainViewModel : ViewModel(){

    val nameButtonAdapter = MutableLiveData<String>()
}
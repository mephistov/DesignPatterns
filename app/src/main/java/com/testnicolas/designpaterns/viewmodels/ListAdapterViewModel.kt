package com.testnicolas.designpaterns.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.testnicolas.designpaterns.models.UserInfo
import com.testnicolas.designpaterns.singletons.Utils


class ListAdapterViewModel: ViewModel() {
    val listUsers = MutableLiveData<List<UserInfo>>()

    init {
        setupInfo()
    }

    fun setupInfo(){

        listUsers.postValue(Utils.fillDataExample())
    }


}
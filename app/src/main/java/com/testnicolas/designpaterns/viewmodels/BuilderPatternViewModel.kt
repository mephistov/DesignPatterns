package com.testnicolas.designpaterns.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.testnicolas.designpaterns.models.Person
import com.testnicolas.designpaterns.models.UserInfo
import com.testnicolas.designpaterns.models.toUserInfo

class BuilderPatternViewModel:ViewModel() {

    val listPerson = arrayListOf<UserInfo>()
    val listPersonShow = MutableLiveData<List<UserInfo>>()

    fun createPerson(name:String,email:String){
        val person = Person.Builder()
            .firstName(name)
            .lastName("none")
            .age(0)
            .email(email)
            .build()

        listPerson.add(person.toUserInfo())
        listPersonShow.postValue(listPerson)

    }

}
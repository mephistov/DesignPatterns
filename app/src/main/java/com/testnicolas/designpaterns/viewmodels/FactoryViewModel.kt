package com.testnicolas.designpaterns.viewmodels

import android.content.ClipData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.testnicolas.designpaterns.utils.AnimalFactory
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class FactoryViewModel: ViewModel() {

    val animalPicture = MutableLiveData<String>()

    fun createDog(){
        val animal = AnimalFactory.createAnimal(AnimalFactory.DOG)
        animalPicture.postValue(animal?.showPicture())
    }
    fun createHorse(){
        val animal = AnimalFactory.createAnimal(AnimalFactory.HORSE)
        animalPicture.postValue(animal?.showPicture())
    }



}
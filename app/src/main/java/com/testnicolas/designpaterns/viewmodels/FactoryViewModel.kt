package com.testnicolas.designpaterns.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.testnicolas.designpaterns.utils.AnimalFactory

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
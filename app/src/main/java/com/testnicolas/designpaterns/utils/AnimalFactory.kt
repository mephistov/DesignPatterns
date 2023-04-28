package com.testnicolas.designpaterns.utils

import com.testnicolas.designpaterns.models.Dog
import com.testnicolas.designpaterns.models.Horse
import com.testnicolas.designpaterns.models.interfaces.Animal

class AnimalFactory {
    companion object {

        val HORSE ="horse"
        val DOG = "dog"

        fun createAnimal(type: String): Animal? {
            return when (type) {
                DOG -> Dog()
                HORSE -> Horse()
                else -> null
            }
        }
    }
}
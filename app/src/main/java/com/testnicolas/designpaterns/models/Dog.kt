package com.testnicolas.designpaterns.models

import com.testnicolas.designpaterns.models.interfaces.Animal

class Dog: Animal {
    override fun showPicture():String {
        return "https://upload.wikimedia.org/wikipedia/commons/thumb/e/e3/Coat_types_3.jpg/375px-Coat_types_3.jpg"
    }
}
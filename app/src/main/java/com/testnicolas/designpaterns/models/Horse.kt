package com.testnicolas.designpaterns.models

import com.testnicolas.designpaterns.models.interfaces.Animal

class Horse: Animal {
    override fun showPicture():String {
        return "https://upload.wikimedia.org/wikipedia/commons/thumb/a/a2/Biandintz_eta_zaldiak_-_modified2.jpg/375px-Biandintz_eta_zaldiak_-_modified2.jpg"
    }
}
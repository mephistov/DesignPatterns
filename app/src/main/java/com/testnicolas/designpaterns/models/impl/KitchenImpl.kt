package com.testnicolas.designpaterns.models.impl

import com.testnicolas.designpaterns.models.interfaces.Kitchen

class KitchenImpl:Kitchen {
    override fun prepareFood():String {
        return "Preparing food"
    }

    override fun callWaiter():String {
        return "Calling waiter"
    }

    override fun washesDishes():String {
        return "Washing dishes"
    }
}
package com.testnicolas.designpaterns.models.impl

import com.testnicolas.designpaterns.models.interfaces.Waiter

class WaiterImpl:Waiter {
    override fun takeOrder():String {
       return "Taking order from customer"
    }

    override fun sendOrderToKitchen():String {
        return "Sending order to kitchen"
    }

    override fun serveFood():String {
        return "Serving food to customer"
    }
}
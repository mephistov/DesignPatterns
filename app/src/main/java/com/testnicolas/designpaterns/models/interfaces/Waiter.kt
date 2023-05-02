package com.testnicolas.designpaterns.models.interfaces

interface Waiter {
    fun takeOrder():String
    fun sendOrderToKitchen():String
    fun serveFood():String
}
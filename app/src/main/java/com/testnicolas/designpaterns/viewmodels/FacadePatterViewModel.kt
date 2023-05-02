package com.testnicolas.designpaterns.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.testnicolas.designpaterns.models.impl.KitchenImpl
import com.testnicolas.designpaterns.models.impl.WaiterImpl
import com.testnicolas.designpaterns.models.interfaces.Kitchen
import com.testnicolas.designpaterns.models.interfaces.Waiter

class FacadePatterViewModel:ViewModel() {

    val responseFacade = MutableLiveData<String>()

    val waiter: Waiter by lazy {
        WaiterImpl()
    }
    val kitchen: Kitchen by lazy {
        KitchenImpl()
    }

    fun orderFood(orderId:String){
        var flowInfo = ""
        flowInfo = waiter.takeOrder()
        responseFacade.value = flowInfo
        flowInfo = waiter.sendOrderToKitchen()
        responseFacade.value = flowInfo
        flowInfo = kitchen.prepareFood()
        responseFacade.value = flowInfo
        flowInfo = kitchen.callWaiter()
        responseFacade.value = flowInfo
        flowInfo = waiter.serveFood()
        responseFacade.value = flowInfo
        flowInfo = kitchen.washesDishes()
        responseFacade.value = flowInfo
    }
}
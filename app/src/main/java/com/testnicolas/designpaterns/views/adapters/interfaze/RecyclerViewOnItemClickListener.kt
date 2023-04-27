package com.testnicolas.designpaterns.views.adapters.interfaze

interface RecyclerViewOnItemClickListener<in Model> {
    fun onClick(model: Model)
}
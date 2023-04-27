package com.testnicolas.designpaterns.models

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.testnicolas.designpaterns.R

data class UserInfo(
    val name:String,
    val age:Int,
    val dead:Boolean,
    val description:String,
    val picture:String
)

@BindingAdapter("imageUser")
fun setImage(image: ImageView, url:String?){
    Glide
        .with(image.context)
        .load(url)
        .placeholder(R.drawable.ic_launcher_background)
        .into(image)
}

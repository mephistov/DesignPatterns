package com.testnicolas.designpaterns.views.adapters

import android.content.Context
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.testnicolas.designpaterns.databinding.UserRowBinding
import com.testnicolas.designpaterns.models.UserInfo
import com.testnicolas.designpaterns.views.adapters.interfaze.RecyclerViewOnItemClickListener

class UserAdapter(
    private val onItemClickListener: RecyclerViewOnItemClickListener<UserInfo>? = null,
    private val contextAdapter: Context
): RecyclerView.Adapter<BaseViewHolder<UserInfo>>() {

    var listUsers = listOf<UserInfo>()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder<UserInfo> {
        return UserViewHolder.create(parent).apply {
            setOnClickListener(onItemClickListener)
            context = contextAdapter
        }
    }

    override fun onBindViewHolder(holder: BaseViewHolder<UserInfo>, position: Int) {
        holder.bindTo(listUsers[position])
    }

    override fun getItemCount(): Int = listUsers.size
}
//---------- Holder ----
class UserViewHolder(
    private val binding:UserRowBinding
): BaseViewHolder<UserInfo>(binding.root), View.OnClickListener {

    lateinit var context: Context

    private lateinit var userInfo: UserInfo
    private var onItemClickListener: RecyclerViewOnItemClickListener<UserInfo>? = null


    companion object {
        fun create(parent: ViewGroup): UserViewHolder {
            val binding = parent.viewBinding(UserRowBinding::inflate)
            return UserViewHolder(binding)
        }
    }

    override fun onClick(v: View?) {
        TODO("Not yet implemented")
    }

    override fun bindTo(model: UserInfo) {
        binding.infoUser = model
        userInfo = model

    }
    fun setOnClickListener(onItemClickListener: RecyclerViewOnItemClickListener<UserInfo>?) {
        this.onItemClickListener = onItemClickListener
    }

}